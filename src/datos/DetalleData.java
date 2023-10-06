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
    
    public void agregarDetalle(DetalleVenta venta){
        String sql ="INSERT INTO detalle (idVenta,idProducto,cantidad,total,entregado) VALUES (?,?,?,?,?)";
       try {
           PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
 ps.setInt(1,venta.getIdVenta());
 ps.setInt(2,venta.getIdProducto());
 ps.setInt(3,venta.getCantidad());
 ps.setDouble(4, venta.getTotal());
 ps.setBoolean(5,venta.isEntregado());
 ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

             if (rs.next()) {
                venta.setIdVenta(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Detalle Guardado");
            }
            ps.close();
       } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error: "+ ex.getMessage());
       }

        
        
    }
}
