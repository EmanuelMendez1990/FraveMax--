/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import entidades.*;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
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

    public Venta IngresarVenta(Venta venta) {
        String sql = "INSERT INTO venta (idUsuario,fecha,total,idCliente) VALUES (?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, venta.getIdUsuario());
            java.sql.Date fechaActual = new java.sql.Date(System.currentTimeMillis());
            ps.setDate(2, fechaActual);
            ps.setDouble(3, venta.getTotal());
            ps.setInt(4, venta.getIdCliente());
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
        return venta;
    }
public ArrayList<Venta> buscarVentaPorCliente(int idCliente) {
        ArrayList<Venta> lista = new ArrayList<>();
        String sql = "SELECT * FROM venta WHERE idCliente = " + idCliente;

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Venta venta = new Venta();
                venta.setIdVenta(rs.getInt("idVenta"));
                venta.setIdUsuario(rs.getInt("idUsuario"));
                venta.setFecha(rs.getDate("fecha"));
                venta.setTotal(rs.getDouble("total"));
                venta.setIdCliente(rs.getInt("idCliente"));
                lista.add(venta);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR " + ex.getMessage());

        }
        return lista;
    }
    public ArrayList<Venta> buscarVentaPorVendedor(int idUsuario) {
        ArrayList<Venta> lista = new ArrayList<>();
        String sql = "SELECT * FROM venta WHERE idUsuario = " + idUsuario;

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Venta venta = new Venta();
                venta.setIdVenta(rs.getInt("idVenta"));
                venta.setIdUsuario(rs.getInt("idUsuario"));
                venta.setFecha(rs.getDate("fecha"));
                venta.setTotal(rs.getDouble("total"));
                venta.setIdCliente(rs.getInt("idCliente"));
                lista.add(venta);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR " + ex.getMessage());

        }
        return lista;
    }
    
   

    public Venta buscarVentaPorId(int id) {
        
        String sql = "SELECT * FROM venta WHERE idVenta = " + id;
 Venta venta = new Venta();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
               
                venta.setIdVenta(rs.getInt("idVenta"));
                venta.setIdUsuario(rs.getInt("idUsuario"));
                venta.setFecha(rs.getDate("fecha"));
                venta.setTotal(rs.getDouble("total"));
                venta.setIdCliente(rs.getInt("idCliente"));
                
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR " + ex.getMessage());

        }
        return venta;
    }
    
    public ArrayList<Venta> buscarVentaPorFecha(Date fecha) {
        ArrayList<Venta> lista = new ArrayList<>();
        String sql = "SELECT * FROM venta WHERE fecha = '" + fecha + "'";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Venta venta = new Venta();
                venta.setIdVenta(rs.getInt("idVenta"));
                venta.setIdUsuario(rs.getInt("idUsuario"));
                venta.setFecha(rs.getDate("fecha"));
                venta.setTotal(rs.getDouble("total"));
                venta.setIdCliente(rs.getInt("idCliente"));
                lista.add(venta);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR " + ex.getMessage());

        }
        return lista;
    }
     public ArrayList<Venta> buscarVentaPorFechas(Date desde,Date hasta) {
        ArrayList<Venta> lista = new ArrayList<>();
        String sql = "SELECT * FROM venta WHERE fecha BETWEEN '" + desde + "' AND '" + hasta+"'";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Venta venta = new Venta();
                venta.setIdVenta(rs.getInt("idVenta"));
                venta.setIdUsuario(rs.getInt("idUsuario"));
                venta.setFecha(rs.getDate("fecha"));
                venta.setTotal(rs.getDouble("total"));
                venta.setIdCliente(rs.getInt("idCliente"));
                lista.add(venta);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR " + ex.getMessage());

        }
        return lista;
    }
}
