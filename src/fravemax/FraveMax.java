package fravemax;

import datos.Conexion;
import datos.*;
import datos.ProductoData;
import entidades.*;
import java.sql.Connection;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FraveMax {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Connection con = Conexion.getConexion();

//Pruebas en el Main
        Producto prod = new Producto(10, "Licuadora", "Licuadora TOP HOUSE", Categoria.LINEABLANCA, 20000, 30, true);
        ProductoData pd = new ProductoData();
//     pd.agregarProducto(prod);
        //pd.modificarProducto(prod);

//   ArrayList<Producto> lista= pd.listarProductos();
//        for (Producto p: lista) 
//        {
//            System.out.println(""+p.getNombre());   
//            System.out.println(p.getCategoria());
//        }
//Producto prod1=pd.listarProducto(1);
//        System.out.println(prod1.getNombre());
//
//    }
//pd.borrarProducto(1);
//List<Producto> lista= pd.buscarProductos("Licuadora TOP");
//        System.out.println(lista.size());
//        for (Producto p: lista) 
//        {
//            System.out.println(p.getNombre());   
//            System.out.println(p.getCategoria());
//        }



        UsuarioData ud = new UsuarioData();

//        String password = "1234";
//        String saltvalue = PassEnc.getSaltvalue(30);
//        String encryptedpassword = PassEnc.generateSecurePassword(password, saltvalue);

//        try {
//            String date = "1976-08-13";
//            Date date2 = new SimpleDateFormat("yyyy-MM-dd").parse(date);
//            java.sql.Date sqlDate2 = new java.sql.Date(date2.getTime());
//            Usuario usuario1 = new Usuario(Rol.valueOf("CLIENTE"), 87654321, "Julia", "Roberts", sqlDate2, "julia321", encryptedpassword, saltvalue, "345234523", "AvSiempreViva1233", "julia_r@gmail.com");
//            ud.agregarUsuario(usuario1);
//        } catch (ParseException ex) {
//            System.out.println("ocurrio un error: " + ex.getMessage());
//        }

//      String  encryptedpassword = ud.listarUsuario("Julia321").getPass();
//      String   saltvalue =ud.listarUsuario("Julia321").getSalt();
//        System.out.println(encryptedpassword);
//        System.out.println(saltvalue);
//        
//        Boolean status = PassEnc.verifyUserPassword(password, encryptedpassword, saltvalue);
//        if (status == true) {
//            System.out.println("Password es correcto!!");
//        } else {
//            System.out.println("Password es incorrecto");
//        }
        VentaData ventadata=new VentaData();
        DetalleData detalledata =new DetalleData();
        
         
           
        try {
            String date = "1976-08-13";
            Date date2 = new SimpleDateFormat("yyyy-MM-dd").parse(date);
                  java.sql.Date sqlDate2 = new java.sql.Date(date2.getDate());
        Venta venta =new Venta(1,date2,20000,1);
        ventadata.IngresarVenta(venta);
        } catch (ParseException ex) {
            Logger.getLogger(FraveMax.class.getName()).log(Level.SEVERE, null, ex);
        }
      
        
        DetalleVenta venta1 =new DetalleVenta(1,2,1,20000,true);
detalledata.agregarDetalle(venta1);
//DetalleVenta venta2 =new DetalleVenta(1,2,1,20000,true);
//detalledata.agregarDetalle(venta2);

    }

}
