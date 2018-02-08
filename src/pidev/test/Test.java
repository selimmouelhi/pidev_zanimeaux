/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pidev.test;


import java.sql.Date;
import java.sql.SQLException;
import pidev.entities.Association;
import pidev.entities.Evenment;
import pidev.entities.Message;
import pidev.entities.Responsable_Association;
import pidev.entities.User;
import pidev.services.Association_Services;
import pidev.services.Evenments_Services;
import pidev.services.Message_Services;

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
        //testing association_service here
         //AS.ajouterAssociation(A, R);
        //AS.ModifierAssociation(1, "infooo");
        //AS.consulterAssociation();
        //AS.deleteAssociation(1);
        
        //testing Evenments service here
//        Evenment E = new Evenment(1, 2, new Date(17, 03, 2004), new Date(19, 04, 2004),"information", true, false);
//        Evenments_Services ES=new Evenments_Services();
//        ES.ajouterEvenment(E);
        
//          testing Message services here  
//        Message M= new Message(1, 1, 1, "peace", "peacee", new Date(12));
//        Message_Services MS = new Message_Services();
//        User U1=new User(1);
//        User U2=new User(2);
//        MS.ajouterMessage(M, U1, U2);
//        
        
    }
    
}
