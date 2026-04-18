
package escuela1;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author CHAVEZ
 */
public class ConexionBD {
    
    private static Connection conectar = null;
    
    private static final String usuario = "postgres";
    private static final String contrasenia = "admin";
    private static final String bd = "escuela2";
    private static final String ip = "localhost";
    private static final String puerto = "5432";
    
    private static final String cadena = "jdbc:postgresql://"+ip+":"+puerto+"/"+bd;
    
    public static Connection obtieneConexion(){
        try {
           // Class.forName("org.postegresql.Driver");
            conectar = DriverManager.getConnection(cadena, usuario, contrasenia);
           // JOptionPane.showMessageDialog(null,"Conexión exitosa a la BD!");
            
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null,"ERROR de conexión a la BD!"+ e.getMessage());
            
        }
        return conectar;   
    }
    
    public static void main(String [] args){
        Connection conn = ConexionBD.obtieneConexion();
        System.out.println("Hola");  
    }
}
