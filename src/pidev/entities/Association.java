/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pidev.entities;

import java.sql.Date;

/**
 *
 * @author ADMIN
 */
public class Association {
    
    int id;
    Responsable_Association Responsable;
    String info;
    String  adresse ;
    String nom;
    Date date_creation;
    int tel;
    public Association ()
    {}

    public Association(int id, Responsable_Association Responsable, String info, String adresse, String nom, Date date_creation, int tel) {
        this.id = id;
        this.Responsable = Responsable;
        this.info = info;
        this.adresse = adresse;
        this.nom = nom;
        this.date_creation = date_creation;
        this.tel = tel;
    }
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Responsable_Association getResponsable() {
        return Responsable;
    }

    public void setResponsable(Responsable_Association Responsable) {
        this.Responsable = Responsable;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Date getDate_creation() {
        return date_creation;
    }

    public void setDate_creation(Date date_creation) {
        this.date_creation = date_creation;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "Association{" + "id=" + id + ", Responsable=" + Responsable + ", info=" + info + ", adresse=" + adresse + ", nom=" + nom + ", date_creation=" + date_creation + ", tel=" + tel + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + this.id;
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
        final Association other = (Association) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
    
    
}
