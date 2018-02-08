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
import pidev.entities.Message;
import pidev.entities.User;
import pidev.util.Connexion;

/**
 *
 * @author ADMIN
 */
public class Message_Services {
    
    
    PreparedStatement pst;
    Connection cnx;
    ResultSet rs;

    public Message_Services() {
        cnx=Connexion.getInstance().getConnexion();
    }
    
    //ajout de message est fait par toute utilisateur apar l'admin
    public void ajouterMessage(Message M,User S,User R) throws SQLException
    {
        String req="insert into message(id,id_user1,id_user2,contenu,objet,date)values (?,?,?,?,?,?)";
        pst=cnx.prepareStatement(req);
        pst.setInt(1, M.getId());
        pst.setInt(2, S.getId());
        pst.setInt(3, R.getId());
        pst.setString(4, M.getContenu());
        pst.setString(5, M.getObjet());
        pst.setDate(6, (Date) M.getDate());
        pst.executeUpdate();
        
    
    }
    //tout utilisateur peut afficher son historique de message
    public void afficherHistoriqueMessage() throws SQLException
    {
        String req="select * from message";
        pst=cnx.prepareStatement(req);
        rs=pst.executeQuery();
        while(rs.next())
        {Message M = new Message(
                rs.getInt(1),
                rs.getInt(2),
                rs.getInt(3),
                rs.getString(4),
                rs.getString(5),
                rs.getDate(6)
        );
        M.toString();
        }
        
    
    }
    // si on veut recuperer tous les messages
    public List<Message> getMessages() throws SQLException{
        List<Message> liste = new ArrayList<>();
        String req="select * from message";
        pst=cnx.prepareStatement(req);
        rs=pst.executeQuery();
        while(rs.next())
        {Message M = new Message(
                rs.getInt(1),
                rs.getInt(2),
                rs.getInt(3),
                rs.getString(4),
                rs.getString(5),
                rs.getDate(6)
        );
        liste.add(M);
    }
    return liste;
    
}
}
