
package datos;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {
    private static final String URL="jdbc:mariadb://localhost/"; //ojo si tienen el XAMPP corriendo en el puerto 3306
    
    private static final String DB="fravemax";
    private static final String USUARIO="root";
    private static final String PASSWORD="";
    private static Connection connection;
    
    private Conexion(){}
    public static Connection getConexion(){
        
        if (connection==null) {
            try {
                Class.forName("org.mariadb.jdbc.Driver");
                connection= DriverManager.getConnection(URL+DB,USUARIO,PASSWORD);
//                JOptionPane.showMessageDialog(null, "Conectado");

                
            } catch (ClassNotFoundException ex) {
JOptionPane.showMessageDialog(null, "Error al cargar los Driver");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al conectar con la base de datos");

            }
            
            
        }
        return connection;
    }
    
    
}
