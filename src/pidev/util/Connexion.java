/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pidev.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ADMIN
 */
public class Connexion {
    
       
    final String url = "jdbc:mysql://localhost:3306/pidev_zanimaux";
    final String user = "root";
    final String password = "";
    static Connexion instance = null;
    Connection cnx = null;
    
    private Connexion(){
        try{
            cnx = DriverManager.getConnection(url, user, password);
        }catch(SQLException e){
            System.out.println("connexion failed");
        }
    }
    
    public static Connexion getInstance(){
        return (instance == null ? instance = new Connexion() : instance);
    }
    
    public Connection getConnexion(){
        return this.cnx;
    }
}
