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
   int IDsender;
   int IDreceiver;
   String contenu;
   String objet ;
   Date date;

    public Message() {
    }

    public Message(int id, int IDsender, int IDreceiver, String contenu, String objet, Date date) {
        this.id = id;
        this.IDsender = IDsender;
        this.IDreceiver = IDreceiver;
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

    public int getIDsender() {
        return IDsender;
    }

    public void setIDsender(int IDsender) {
        this.IDsender = IDsender;
    }

    public int getIDreceiver() {
        return IDreceiver;
    }

    public void setIDreceiver(int IDreceiver) {
        this.IDreceiver = IDreceiver;
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
        int hash = 3;
        hash = 97 * hash + this.id;
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
        return "Message{" + "id=" + id + ", IDsender=" + IDsender + ", IDreceiver=" + IDreceiver + ", contenu=" + contenu + ", objet=" + objet + ", date=" + date + '}';
    }
    
    
    
    
   
   
   
    
}
