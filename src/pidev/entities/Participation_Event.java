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
public class Participation_Event {
    List<User> participants=new ArrayList<> ();
    List<Evenment> Evenments=new ArrayList<> ();

    public Participation_Event() {
    }

    public Participation_Event(List<User> participants, List<Evenment> Evenments) {
        this.participants = participants;
        this.Evenments = Evenments;
    }

    public List<User> getParticipants() {
        return participants;
    }

    public void setParticipants(List<User> participants) {
        this.participants = participants;
    }

    public List<Evenment> getEvenments() {
        return Evenments;
    }

    public void setEvenments(List<Evenment> Evenments) {
        this.Evenments = Evenments;
    }
    
    
}
