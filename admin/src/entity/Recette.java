/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kadhem
 */
@Entity
@Table(name = "recette")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Recette.findAll", query = "SELECT r FROM Recette r"),
    @NamedQuery(name = "Recette.findByIdrecette", query = "SELECT r FROM Recette r WHERE r.idrecette = :idrecette"),
    @NamedQuery(name = "Recette.findByNomARrecette", query = "SELECT r FROM Recette r WHERE r.nomARrecette = :nomARrecette"),
    @NamedQuery(name = "Recette.findByNomFRrecette", query = "SELECT r FROM Recette r WHERE r.nomFRrecette = :nomFRrecette")})
public class Recette implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idrecette")
    private Integer idrecette;
    @Basic(optional = false)
    @Column(name = "nomAR_recette")
    private String nomARrecette;
    @Basic(optional = false)
    @Column(name = "nomFR_recette")
    private String nomFRrecette;

    public Recette() {
    }

    public Recette(Integer idrecette) {
        this.idrecette = idrecette;
    }

    public Recette(Integer idrecette, String nomARrecette, String nomFRrecette) {
        this.idrecette = idrecette;
        this.nomARrecette = nomARrecette;
        this.nomFRrecette = nomFRrecette;
    }

    public Integer getIdrecette() {
        return idrecette;
    }

    public void setIdrecette(Integer idrecette) {
        this.idrecette = idrecette;
    }

    public String getNomARrecette() {
        return nomARrecette;
    }

    public void setNomARrecette(String nomARrecette) {
        this.nomARrecette = nomARrecette;
    }

    public String getNomFRrecette() {
        return nomFRrecette;
    }

    public void setNomFRrecette(String nomFRrecette) {
        this.nomFRrecette = nomFRrecette;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idrecette != null ? idrecette.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Recette)) {
            return false;
        }
        Recette other = (Recette) object;
        if ((this.idrecette == null && other.idrecette != null) || (this.idrecette != null && !this.idrecette.equals(other.idrecette))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Recette[ idrecette=" + idrecette + " ]";
    }
    
}
