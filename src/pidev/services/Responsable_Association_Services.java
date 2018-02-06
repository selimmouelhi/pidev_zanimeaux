/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pidev.services;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import pidev.entities.Responsable_Association;
import pidev.util.Connexion;

/**
 *
 * @author ADMIN
 */
public class Responsable_Association_Services {
    
    Connexion cnx= Connexion.getInstance().getConnexion();
    PreparedStatement pst;
    ResultSet rs;
    //on peut seulement ajouter et supprimer Responsable suppression faite par admin
    public void ajouterResponsable(Responsable_Association R)
    {
    
    }
    public void supprimerResponsable(Responsable_Association R)
    {
    
    }
    //a discuter
    public void afficherResponsables(Responsable_Association R)
    {
    
    }
    
    
}
