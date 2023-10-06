/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import entidades.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

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
        String sql ="INSERT INTO detalle (idVenta,idProducto,cantidad,total,entregado VALUES ('?','?','?','?','?')";
       try {
           PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
       } catch (SQLException ex) {
           Logger.getLogger(DetalleData.class.getName()).log(Level.SEVERE, null, ex);
       }

        
        
    }
}
