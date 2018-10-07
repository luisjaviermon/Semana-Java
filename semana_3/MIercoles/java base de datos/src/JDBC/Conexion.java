
package JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author proteco
 */
public class Conexion {
    private Connection con;
    public Conexion()throws SQLException{
    String url = "http://localhost/phpmyadmin/db_structure.php?server=1&db=Universidad";
    String userName="root";
    String password = "";
    con = DriverManager.getConnection(url,userName,password);
    if(con!=null){
        System.out.println("conectado");
    }else{
        System.out.println("Error de conexion");
    }
    }
    
    public void insertar(String nombre, int duracion) throws SQLException{
        String sql = "INSERT INTO CARRERA (NOMBRE,DURACION)VALUES(?,?)";
        PreparedStatement stat = con.prepareStatement(sql);
        stat.setString(1, nombre);
        stat.setInt(2, duracion);
        int filasInsertadas=stat.executeUpdate();
        if(filasInsertadas>0){
            System.out.println("Se inserto correctamente");
        }else{
            System.out.println("Error");
        }
    }
        
    public void seleccionar() throws SQLException{
        String sql = "SELECT * FROM CARRERA";
        Statement stat=con.createStatement();
        ResultSet resultado = stat.executeQuery(sql);
        while(resultado.next()){
            int id = resultado.getInt("ID");
            String nombre = resultado.getString("NOMBRE");
            int duracion = resultado.getInt("DURACION");
            System.out.println(id+" : "+nombre+" : "+duracion);
        }
    }
    
    public void actualizar(String nombre,int duracion) throws SQLException{
        String sql = "UPDATE CARRERA SET DURACION=? WHERE NOMBRE=?";
        PreparedStatement stat = con.prepareStatement(sql);
        stat.setString(2,nombre);
        stat.setInt(1,duracion);
        int registroCambiado = stat.executeUpdate();
        if(registroCambiado>0){
            System.out.println("Se ha actualizado la carrera "+nombre);
        }
    }
    public void eliminar(String nombre) throws SQLException{
        String sql = "DELETE CARRERA SET DURACION=? WHERE NOMBRE=?";
        PreparedStatement stat = con.prepareStatement(sql);
        stat.setString(1,nombre);
        int registroBorrado = stat.executeUpdate();
        if(registroBorrado>0){
            System.out.println("Se ha eliminado la carrera "+nombre);
        }
    }
    
    public void cerrar(){
        
    }
}
