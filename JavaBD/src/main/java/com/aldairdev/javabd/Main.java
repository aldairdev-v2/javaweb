/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aldairdev.javabd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

private static String sqlinsert="insert into cliente (nom_cliente , app_pat_cliente , app_mat_cliente , "
        + "calle , numero , colonia , tel_cel_cliente , sexo , nacionalidad , edad) "
        + "values (?,?,?,?,?,?,?,?,?,?)";
    
    public static void main(String[] args) {   
        Main llamadobasededatos = new Main();
        llamadobasededatos.insertCliente("Noemí", "Bastida", "Bautista", "Calle 2", 18, "Monera", 5564178521L, "M", "Mexicana", 23);
    }

    public void insertCliente(String nombre_cliente, String apellido_pat, String apellido_mat, String calle, 
            int numero, String colonia, long telefono, String sexo, String nacion, int edad){    
        
    try {
        Conexion objConexion = new Conexion();
        Connection conexionabierta = objConexion.establecerConexion();
        
        PreparedStatement ps = conexionabierta.prepareStatement(sqlinsert);
        ps.setString(1, nombre_cliente);//nom_cliente
        ps.setString(2, apellido_pat);
        ps.setString(3, apellido_mat);
        ps.setString(4, calle);
        ps.setInt(5, numero);
        ps.setString(6, colonia);
        ps.setLong(7, telefono);
        ps.setString(8, sexo );
        ps.setString(9, nacion);
        ps.setInt(10, edad);
        
       int resultadoinsert= ps.executeUpdate();
        System.out.println("el resultado del insert es "+resultadoinsert);
        
        
    } catch (SQLException ex) {
        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
    }
        
        
    }
}
