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
public class Evenment {
    int id;
    Association As;
    Date date_debut;
    Date date_fin;
    String information;
    Boolean signale;
    Boolean cloture ;

    public Evenment() {
    }

    public Evenment(int id, Association As, Date date_debut, Date date_fin, String information, Boolean signale, Boolean cloture) {
        this.id = id;
        this.As = As;
        this.date_debut = date_debut;
        this.date_fin = date_fin;
        this.information = information;
        this.signale = signale;
        this.cloture = cloture;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + this.id;
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
        final Evenment other = (Evenment) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Association getAs() {
        return As;
    }

    public void setAs(Association As) {
        this.As = As;
    }

    public Date getDate_debut() {
        return date_debut;
    }

    public void setDate_debut(Date date_debut) {
        this.date_debut = date_debut;
    }

    public Date getDate_fin() {
        return date_fin;
    }

    public void setDate_fin(Date date_fin) {
        this.date_fin = date_fin;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public Boolean getSignale() {
        return signale;
    }

    public void setSignale(Boolean signale) {
        this.signale = signale;
    }

    public Boolean getCloture() {
        return cloture;
    }

    public void setCloture(Boolean cloture) {
        this.cloture = cloture;
    }

    @Override
    public String toString() {
        return "Evenment{" + "id=" + id + ", As=" + As + ", date_debut=" + date_debut + ", date_fin=" + date_fin + ", information=" + information + ", signale=" + signale + ", cloture=" + cloture + '}';
    }
    
    
    
    
}
