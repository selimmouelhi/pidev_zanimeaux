/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pidev.services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import pidev.entities.Association;
import pidev.entities.Responsable_Association;
import pidev.util.Connexion;

/**
 *
 * @author ADMIN
 */
public class Association_Services {
    
    
    ResultSet rs;
    PreparedStatement pst;
    Connection cnx;

    public Association_Services() {
        cnx=Connexion.getInstance().getConnexion();
    }
    
    
    //on peut ajouter une association A on a besoin d'un responsable qui est lié a cette association
    public void ajouterAssociation(Association A,Responsable_Association R) throws SQLException
    {
        String req="insert into association(id,id_responsable,info,adresse,nom,date_creation,tel) values(?,?,?,?,?,?,?)";
        pst=cnx.prepareStatement(req);
        pst.setInt(1, A.getId());
        pst.setInt(2, R.getId());
        pst.setString(3, A.getInfo());
        pst.setString(4, A.getAdresse());
        pst.setString(5, A.getNom());
        pst.setDate(6,A.getDate_creation());
        pst.setInt(7, A.getTel());
        pst.executeUpdate();
        
        
    }
    //on peut modifier les info d'une association : on modifie seulement les info
    public void ModifierAssociation(int id,String info) throws SQLException
    {
        String req="update association set info=? where id=?";
        pst=cnx.prepareStatement(req);
        pst.setString(1, info);
        pst.setInt(2, id);
        pst.executeUpdate();
        
    
    }
    //on peut consulter la liste des associations
    public void consulterAssociation() throws SQLException
    {
        String req="select * from association";
        pst=cnx.prepareStatement(req);
        rs=pst.executeQuery();
        while(rs.next())
        {
            Association A = new Association(
                    rs.getInt(1),
                    rs.getInt(2),
                    rs.getString(3)
                    ,rs.getString(4),
                    rs.getString(5),
                    rs.getDate(6),rs.getInt(7)
            );
            A.toString();
        }
        
    }
    public List<Association> getAssociations() throws SQLException{
    List<Association> Liste = new ArrayList<>();
    String req="select * from association";
        pst=cnx.prepareStatement(req);
        rs=pst.executeQuery();
        while(rs.next())
        {
            Association A = new Association(
                    rs.getInt(1),
                    rs.getInt(2),
                    rs.getString(3)
                    ,rs.getString(4),
                    rs.getString(5),
                    rs.getDate(6),rs.getInt(7)
            );
            Liste.add(A);
    
    }
        return Liste;
    
}
}
