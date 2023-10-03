package datos;

import entidades.Producto;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ProductoData {

    private Connection con = null;

    public ProductoData() {
        con = Conexion.getConexion();

    }

    public void agregarProducto(Producto producto) {
        String sql = "INSERT INTO producto (stock,nombre,descripcion,categoria,precio,estado,enOferta) VALUES (?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, producto.getStock());
            ps.setString(2, producto.getNombre());
            ps.setString(3, producto.getDescripcion());
            ps.setString(4, producto.getCategoria().toString());
            ps.setDouble(5, producto.getPrecio());
            ps.setBoolean(6, producto.isEstado());
            ps.setInt(7, producto.getEnOferta());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                producto.setIdProducto(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Producto Guardado");
            }
            ps.close();
        } catch (SQLException ex) {
                            JOptionPane.showMessageDialog(null, "Error al guardar producto"+ex.getMessage());

        }

    }
    public void modificarProducto (Producto producto){
        String sql= "UPDATE producto SET (stock=?,nombre=?,descripcion=?,categoria=?,precio=?,estado=?,enOferta=?) WHERE idProducto=?";
        
        try {
            PreparedStatement ps=con.prepareStatement(sql);
        ps.setInt(1, producto.getStock());
        ps.setString(2,producto.getNombre());
        ps.setString(3, producto.getDescripcion());
        ps.setString(4,producto.getCategoria().toString());
                ps.setDouble(5, producto.getPrecio());

        ps.setBoolean(6, producto.isEstado());
        ps.setInt(7,producto.getEnOferta());
        ps.setInt(8, producto.getIdProducto());
        int exito = ps.executeUpdate();
        if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Producto modificado");

            }
        } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error, No se pudo modificar "+ex.getMessage());
                System.out.println(ex.getMessage());
        }
        
    }
    
}
