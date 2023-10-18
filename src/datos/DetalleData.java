/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import entidades.*;
import datos.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author emanu
 */
public class DetalleData {

    private Connection con = null;

    public DetalleData() {
        con = Conexion.getConexion();
    }

    public void agregarDetalle(DetalleVenta venta) {
        String sql = "INSERT INTO detalle (idVenta,idProducto,cantidad,total,entregado,detalle) VALUES (?,?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, venta.getIdVenta());
            ps.setInt(2, venta.getIdProducto());
            ps.setInt(3, venta.getCantidad());
            ps.setDouble(4, venta.getTotal());
            ps.setBoolean(5, venta.isEntregado());
            ps.setString (6,venta.getDetalle());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                venta.setIdVenta(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Detalle Guardado");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
        }

    }

    public ArrayList<Usuario> buscarDetallePorProducto(int idProducto) {
        ArrayList<Usuario> lista = new ArrayList<>();
        String sql = "SELECT * FROM usuario\n"
                + "JOIN venta\n"
                + "ON usuario.idUsuario = venta.idUsuario\n"
                + "JOIN detalle \n"
                + "ON detalle.idVenta = venta.idVenta\n"
                + "WHERE detalle.idProducto = " + idProducto;

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Usuario usuario = new Usuario();
                usuario.setIdUsuario(rs.getInt("idUsuario"));
                usuario.setRol(Rol.valueOf(rs.getString("rol")));
                usuario.setDni(rs.getInt("dni"));
                usuario.setNombre(rs.getString("nombre"));
                usuario.setApellido(rs.getString("apellido"));
                usuario.setFechaIngreso(rs.getDate("fechaIngreso"));
                usuario.setUsuario(rs.getString("usuario"));
                usuario.setPass(rs.getString("pass"));
                usuario.setSalt(rs.getString("salt"));
                usuario.setTel(rs.getString("tel"));
                usuario.setDomicilio(rs.getString("domicilio"));
                usuario.setEmail(rs.getString("email"));
                
                lista.add(usuario);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR " + ex.getMessage());

        }
        return lista;
    }

}
