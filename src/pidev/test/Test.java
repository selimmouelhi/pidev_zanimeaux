/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pidev.test;


import java.sql.Date;
import java.sql.SQLException;
import pidev.entities.Association;
import pidev.entities.Responsable_Association;
import pidev.services.Association_Services;

/**
 *
 * @author ADMIN
 */
public class Test {
    public static void main(String[] args) throws SQLException {
        Association A = new Association(1, 2, "info", "ariana", "aso1", new Date(17, 03, 2004), 71708248);
        Responsable_Association R= new Responsable_Association();
        R.setId(2);
        Association_Services AS = new Association_Services();
        AS.ajouterAssociation(A, R);
        
        
        
    }
    
}
