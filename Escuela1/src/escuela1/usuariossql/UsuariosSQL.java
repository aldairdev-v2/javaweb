/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escuela1.usuariossql;

import escuela1.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author CHAVEZ
 */
public class UsuariosSQL {
    
    public void crearUsuario(String usuario, String password, int activo){
        try {
            String insertausuario = "insert into usarios(usario, password, activo) values(?,?,?)),";
            
            PreparedStatement ps = ConexionBD.obtieneConexion().prepareCall(insertausuario);
            
            //Nos. indican posición de "???"
            ps.setString(1, usuario);
            ps.setString(2, password);
            ps.setInt(3, activo);
            int resultado=ps.executeUpdate(); //ResutSet
            System.out.println("resultado insert "+resultado);
        } catch (SQLException ex) {
            Logger.getLogger(UsuariosSQL.class.getName()).log(Level.SEVERE, null, ex);
        }         
    }
    
    public boolean validarUsuario(String usuario, String password){
        
        boolean existe = false;
        try {
            String validarusuario = "select * from usuarios where usuario = ? AND password = ?";
            PreparedStatement ps = ConexionBD.obtieneConexion().prepareStatement(validarusuario);
            
            ps.setString(1, usuario);
            ps.setString(2, password);
            
            ResultSet rs = ps.executeQuery();
            
            rs.next();
            existe = true;
            
        } catch (SQLException ex) {
            Logger.getLogger(UsuariosSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return existe;
    }
    
    public static void main(String [] args){
        UsuariosSQL prueba = new UsuariosSQL();
        prueba.crearUsuario("Mariana", "mar",1);
        
        boolean resultado = prueba.validarUsuario("Aldair", "admin");
        System.out.println(resultado);
    }
    
}
