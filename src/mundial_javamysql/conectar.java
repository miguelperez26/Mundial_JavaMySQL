/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundial_javamysql;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author MiguelPerez
 */
public class conectar {
    Connection conn=null;//almacena la ruta donde esta la base de datos
    public Connection conexion(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            
           conn=DriverManager.getConnection("jdbc:mysql://localhost/mundial?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","12345");

            
        } catch (Exception e) {
            System.out.println (e.getMessage());
        }
        return conn;
    
    }
}
