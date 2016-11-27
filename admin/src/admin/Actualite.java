/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
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
import javax.persistence.Transient;

/**
 *
 * @author kadhem
 */
@Entity
@Table(name = "actualite", catalog = "pfe", schema = "")
@NamedQueries({
    @NamedQuery(name = "Actualite.findAll", query = "SELECT a FROM Actualite a"),
    @NamedQuery(name = "Actualite.findByIdActualite", query = "SELECT a FROM Actualite a WHERE a.idActualite = :idActualite"),
    @NamedQuery(name = "Actualite.findByTitreARactualite", query = "SELECT a FROM Actualite a WHERE a.titreARactualite = :titreARactualite"),
    @NamedQuery(name = "Actualite.findByTitreFRactualite", query = "SELECT a FROM Actualite a WHERE a.titreFRactualite = :titreFRactualite"),
    @NamedQuery(name = "Actualite.findByTextARactualite", query = "SELECT a FROM Actualite a WHERE a.textARactualite = :textARactualite"),
    @NamedQuery(name = "Actualite.findByTextFRactualite", query = "SELECT a FROM Actualite a WHERE a.textFRactualite = :textFRactualite")})
public class Actualite implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_actualite")
    private Integer idActualite;
    @Basic(optional = false)
    @Column(name = "titreAR_actualite")
    private String titreARactualite;
    @Basic(optional = false)
    @Column(name = "titreFR_actualite")
    private String titreFRactualite;
    @Basic(optional = false)
    @Column(name = "textAR_actualite")
    private String textARactualite;
    @Basic(optional = false)
    @Column(name = "textFR_actualite")
    private String textFRactualite;

    public Actualite() {
    }

    public Actualite(Integer idActualite) {
        this.idActualite = idActualite;
    }

    public Actualite(Integer idActualite, String titreARactualite, String titreFRactualite, String textARactualite, String textFRactualite) {
        this.idActualite = idActualite;
        this.titreARactualite = titreARactualite;
        this.titreFRactualite = titreFRactualite;
        this.textARactualite = textARactualite;
        this.textFRactualite = textFRactualite;
    }

    public Integer getIdActualite() {
        return idActualite;
    }

    public void setIdActualite(Integer idActualite) {
        Integer oldIdActualite = this.idActualite;
        this.idActualite = idActualite;
        changeSupport.firePropertyChange("idActualite", oldIdActualite, idActualite);
    }

    public String getTitreARactualite() {
        return titreARactualite;
    }

    public void setTitreARactualite(String titreARactualite) {
        String oldTitreARactualite = this.titreARactualite;
        this.titreARactualite = titreARactualite;
        changeSupport.firePropertyChange("titreARactualite", oldTitreARactualite, titreARactualite);
    }

    public String getTitreFRactualite() {
        return titreFRactualite;
    }

    public void setTitreFRactualite(String titreFRactualite) {
        String oldTitreFRactualite = this.titreFRactualite;
        this.titreFRactualite = titreFRactualite;
        changeSupport.firePropertyChange("titreFRactualite", oldTitreFRactualite, titreFRactualite);
    }

    public String getTextARactualite() {
        return textARactualite;
    }

    public void setTextARactualite(String textARactualite) {
        String oldTextARactualite = this.textARactualite;
        this.textARactualite = textARactualite;
        changeSupport.firePropertyChange("textARactualite", oldTextARactualite, textARactualite);
    }

    public String getTextFRactualite() {
        return textFRactualite;
    }

    public void setTextFRactualite(String textFRactualite) {
        String oldTextFRactualite = this.textFRactualite;
        this.textFRactualite = textFRactualite;
        changeSupport.firePropertyChange("textFRactualite", oldTextFRactualite, textFRactualite);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idActualite != null ? idActualite.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Actualite)) {
            return false;
        }
        Actualite other = (Actualite) object;
        if ((this.idActualite == null && other.idActualite != null) || (this.idActualite != null && !this.idActualite.equals(other.idActualite))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "admin.Actualite[ idActualite=" + idActualite + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
