/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pidev.entities;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */

//cette classe n'est pas detaillé car le module users est fait par collegue aziz
public class User {
    
    protected int id;
    protected List<Evenment> events=new ArrayList<>();

    public User() {
    }

    public User(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Evenment> getEvents() {
        return events;
    }

    public void setEvents(List<Evenment> events) {
        this.events = events;
    }

    
    
    
    
    
}
