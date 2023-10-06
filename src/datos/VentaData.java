/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import entidades.*;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author emanu
 */
public class VentaData {

    private Connection con = null;

    public VentaData() {
        con = Conexion.getConexion();
    }

    public void IngresarVenta(Venta venta) {
        String sql = "INSERT INTO venta idUsuario,fecha,total VALUES ('?','?','?')";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, venta.getIdUsuario());
            ps.setString(2, venta.getFecha().toString());
            ps.setDouble(3, venta.getTotal());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

             if (rs.next()) {
                venta.setIdVenta(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Venta Guardada");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al guardar Venta: " + ex.getMessage());

        }
        
        
    }
            
    }

