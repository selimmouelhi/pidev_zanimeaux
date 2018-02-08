/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pidev.services;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import pidev.entities.Evenment;
import pidev.util.Connexion;

/**
 *
 * @author ADMIN
 */
public class Evenments_Services {
    ResultSet rs;
    PreparedStatement pst;
    Connection cnx;

    
     public Evenments_Services() {
         cnx=Connexion.getInstance().getConnexion();
    }
    
    //Association peut ajouter un evenment
    public void ajouterEvenment(Evenment E) throws SQLException
    {
        String req="insert into evenement(id,id_association,date_debut,date_fin,information,signale,cloture) values(?,?,?,?,?,?,?)";
        pst=cnx.prepareStatement(req);
        pst.setInt(1, E.getId());
        pst.setInt(2, E.getIDassociation());
        pst.setDate(3, (Date) E.getDate_debut());
        pst.setDate(4, (Date) E.getDate_fin());
        pst.setString(5, E.getInformation());
        pst.setBoolean(6, E.getSignale());
        pst.setBoolean(7, E.getSignale());
        pst.executeUpdate();
        
        
        
        
        
    
    }
    //Responsable peut modifier son evenment
    public void modifierEvenment(int id,String info) throws SQLException
    {
        String req="update evenement set information=? where id=? ";
        pst=cnx.prepareStatement(req);
        pst.setString(1, info);
        pst.setInt(2, id);
        pst.executeUpdate();
    
    }
    //Responsable peut supprimer son evenment
    public void supprimerEvenment(int id) throws SQLException
    {
        String req="delete from evenement where id=?";
        pst=cnx.prepareStatement(req);
        pst.setInt(1, id);
        pst.executeUpdate();
    }
    //afficher un seul evenment
    public void afficherEvenment(int id) throws SQLException
    {
    String req="select * from association where id=?";
        pst=cnx.prepareStatement(req);
        pst.setInt(1, id);
        rs=pst.executeQuery();
       rs.next();
        
            Evenment E = new Evenment(
                    rs.getInt(1),
                    rs.getInt(2),
                    rs.getDate(3)
                    ,rs.getDate(4),
                    rs.getString(5),
                    rs.getBoolean(6),
                    rs.getBoolean(7));
            E.toString();
               
    
    }
    //afficher tous les evenments
    public void afficherHistoriqueEvenment() throws SQLException
    {
        
    String req="select * from association where id=?";
        pst=cnx.prepareStatement(req);
        rs=pst.executeQuery();
       while(rs.next());
       {
            Evenment E = new Evenment(
                    rs.getInt(1),
                    rs.getInt(2),
                    rs.getDate(3)
                    ,rs.getDate(4),
                    rs.getString(5),
                    rs.getBoolean(6),
                    rs.getBoolean(7));
           E.toString();
    }
       
    
    }
    //recuperer liste des evenments
    public List<Evenment> getEvents() throws SQLException
    {
    List<Evenment> Liste = new ArrayList<>();
    String req="select * from association where id=?";
        pst=cnx.prepareStatement(req);
        rs=pst.executeQuery();
       while(rs.next());
       {
            Evenment E = new Evenment(
                    rs.getInt(1),
                    rs.getInt(2),
                    rs.getDate(3)
                    ,rs.getDate(4),
                    rs.getString(5),
                    rs.getBoolean(6),
                    rs.getBoolean(7));
           Liste.add(E);
    }
       return Liste;
    }
    //chercher un evenemnt selon id 
    public Boolean rechercheEvenment(int id) throws SQLException
    {   
        
         String req = "select id from evenement where id=?";
        pst = cnx.prepareStatement(req);
        pst.setInt(1, id);
        ResultSet rs = pst.executeQuery();
        return rs.first();
    }
    
    
    
            
}
