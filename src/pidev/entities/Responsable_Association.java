/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pidev.entities;

/**
 *
 * @author ADMIN
 */
public class Responsable_Association extends User {
    String information;

    public Responsable_Association() {
    }

    public Responsable_Association(int id ,String information) {
        super(id);
        this.information = information;
    }
    
    
     
    
    
}
