
package fravemax;

import datos.Conexion;
import datos.ProductoData;
import entidades.*;
import java.sql.Connection;


public class FraveMax {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Connection con=Conexion.getConexion();

//Pruebas en el Main
Producto prod =new Producto(1,10,"Licuadora","Licuadora Philips",Categoria.LINEABLANCA,20000,30,true);
     ProductoData pd=new ProductoData();
     //pd.agregarProducto(prod);
     pd.modificarProducto(prod);


    }
    
}
