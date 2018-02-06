/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pidev.services;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import pidev.entities.Message;
import pidev.util.Connexion;

/**
 *
 * @author ADMIN
 */
public class Message_Services {
    
    Connexion cnx= Connexion.getInstance().getConnexion();
    PreparedStatement pst;
    ResultSet rs;
    //ajout de message est fait par toute utilisateur apar l'admin
    public void ajouterMessage(Message M)
    {
    
    }
    //tout utilisateur peut afficher son historique de message
    public void afficherHistoriqueMessage()
    {
    
    }
    
    
}
