
package com.aldairdev.javabd;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Conexion {
    
    Connection conectar = null;
    
    String usuario ="postgres";
    String contrasenia = "admin";
    String bd = "alquiler_a";
    String ip = "localhost";
    String puerto = "5432";
    
    String cadena = "jdbc:postgresql://"+ip+":"+puerto+"/"+bd;
    
    public Connection establecerConexion(){
        try {
            Class.forName("org.postgresql.Driver");
            conectar = DriverManager.getConnection(cadena,usuario,contrasenia);
            JOptionPane.showMessageDialog(null, "Conexión exitosa a la BD");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al conectar a la BD: " +e.toString());
        }
        
        return conectar;
    }
    
}
