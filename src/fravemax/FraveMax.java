
package fravemax;

import datos.Conexion;
import datos.ProductoData;
import entidades.*;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;



public class FraveMax {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Connection con=Conexion.getConexion();

//Pruebas en el Main
Producto prod =new Producto(10,"Licuadora","Licuadora TOP HOUSE",Categoria.LINEABLANCA,20000,30,true);
     ProductoData pd=new ProductoData();
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
    

List<Producto> lista= pd.buscarProductos("Licuadora TOP");
        System.out.println(lista.size());
        for (Producto p: lista) 
        {
            System.out.println(p.getNombre());   
            System.out.println(p.getCategoria());
        }
}
    
}