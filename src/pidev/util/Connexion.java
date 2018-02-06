/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pidev.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ADMIN
 */
public class Connexion {
    String url="jdbc:mysql://127.0.0.1:3306/esprit"; //achanger selon notre base de données
     String login="root";
     String password="root";
     static Connection cnx;
     static Connexion conn;
     
     private Connexion () throws SQLException
     {  
          try{
    cnx =DriverManager.getConnection(url, login, password);
     }catch(SQLException ex)
     {
         System.out.println("connexion failed");
         
        }
    
     }
     //retourner conn
     public Connexion getConnexion()
     {  return conn;
     }
     //methode getInstance selon design pattern singleton
     public static Connexion getInstance() {
         if(conn==null)
         {   try {
             conn=new Connexion();
             } catch (SQLException ex) {
                 Logger.getLogger(Connexion.class.getName()).log(Level.SEVERE, null, ex);
             }
         }
     return conn;
     }
}
