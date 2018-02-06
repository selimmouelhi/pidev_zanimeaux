/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pidev.entities;

import java.util.Date;

/**
 *
 * @author ADMIN
 */
public class Message {
    
   int id;
   User sender;
   User receiver;
   String contenu;
   String objet ;
   Date date;

    public Message() {
    }

    public Message(int id, User sender, User receiver, String contenu, String objet, Date date) {
        this.id = id;
        this.sender = sender;
        this.receiver = receiver;
        this.contenu = contenu;
        this.objet = objet;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getSender() {
        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public User getReceiver() {
        return receiver;
    }

    public void setReceiver(User receiver) {
        this.receiver = receiver;
    }

    public String getContenu() {
        return contenu;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    public String getObjet() {
        return objet;
    }

    public void setObjet(String objet) {
        this.objet = objet;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Message other = (Message) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Message{" + "id=" + id + ", sender=" + sender + ", receiver=" + receiver + ", contenu=" + contenu + ", objet=" + objet + ", date=" + date + '}';
    }
   
   
   
    
}
