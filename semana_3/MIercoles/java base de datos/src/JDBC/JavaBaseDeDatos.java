
package JDBC;

import java.sql.SQLException;

public class JavaBaseDeDatos {
    public static void main(String[] args){
        try{
            Conexion con = new Conexion();
            con.insertar("Ing. electrica", 9);
            con.insertar("FIsica", 10);
            con.seleccionar();
            con.cerrar();
        }catch(SQLException sql){
            System.out.println("Error"+sql.getMessage());
        }
    }    
}
