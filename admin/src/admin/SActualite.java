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
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author kadhem
 */
@Entity
@Table(name = "s_actualite", catalog = "pfe", schema = "")
@NamedQueries({
    @NamedQuery(name = "SActualite.findAll", query = "SELECT s FROM SActualite s"),
    @NamedQuery(name = "SActualite.findByIdSActualite", query = "SELECT s FROM SActualite s WHERE s.idSActualite = :idSActualite"),
    @NamedQuery(name = "SActualite.findByTitreARsactualite", query = "SELECT s FROM SActualite s WHERE s.titreARsactualite = :titreARsactualite"),
    @NamedQuery(name = "SActualite.findByTitreFRsactualite", query = "SELECT s FROM SActualite s WHERE s.titreFRsactualite = :titreFRsactualite"),
    @NamedQuery(name = "SActualite.findByIdActualite", query = "SELECT s FROM SActualite s WHERE s.idActualite = :idActualite")})
public class SActualite implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_s_actualite")
    private Integer idSActualite;
    @Basic(optional = false)
    @Column(name = "titreAR_sactualite")
    private String titreARsactualite;
    @Basic(optional = false)
    @Column(name = "titreFR_sactualite")
    private String titreFRsactualite;
    @Basic(optional = false)
    @Column(name = "id_actualite")
    private int idActualite;
    @Basic(optional = false)
    @Lob
    @Column(name = "textAR_sactualite")
    private String textARsactualite;
    @Basic(optional = false)
    @Lob
    @Column(name = "textFR_sactualite")
    private String textFRsactualite;

    public SActualite() {
    }

    public SActualite(Integer idSActualite) {
        this.idSActualite = idSActualite;
    }

    public SActualite(Integer idSActualite, String titreARsactualite, String titreFRsactualite, int idActualite, String textARsactualite, String textFRsactualite) {
        this.idSActualite = idSActualite;
        this.titreARsactualite = titreARsactualite;
        this.titreFRsactualite = titreFRsactualite;
        this.idActualite = idActualite;
        this.textARsactualite = textARsactualite;
        this.textFRsactualite = textFRsactualite;
    }

    public Integer getIdSActualite() {
        return idSActualite;
    }

    public void setIdSActualite(Integer idSActualite) {
        Integer oldIdSActualite = this.idSActualite;
        this.idSActualite = idSActualite;
        changeSupport.firePropertyChange("idSActualite", oldIdSActualite, idSActualite);
    }

    public String getTitreARsactualite() {
        return titreARsactualite;
    }

    public void setTitreARsactualite(String titreARsactualite) {
        String oldTitreARsactualite = this.titreARsactualite;
        this.titreARsactualite = titreARsactualite;
        changeSupport.firePropertyChange("titreARsactualite", oldTitreARsactualite, titreARsactualite);
    }

    public String getTitreFRsactualite() {
        return titreFRsactualite;
    }

    public void setTitreFRsactualite(String titreFRsactualite) {
        String oldTitreFRsactualite = this.titreFRsactualite;
        this.titreFRsactualite = titreFRsactualite;
        changeSupport.firePropertyChange("titreFRsactualite", oldTitreFRsactualite, titreFRsactualite);
    }

    public int getIdActualite() {
        return idActualite;
    }

    public void setIdActualite(int idActualite) {
        int oldIdActualite = this.idActualite;
        this.idActualite = idActualite;
        changeSupport.firePropertyChange("idActualite", oldIdActualite, idActualite);
    }

    public String getTextARsactualite() {
        return textARsactualite;
    }

    public void setTextARsactualite(String textARsactualite) {
        String oldTextARsactualite = this.textARsactualite;
        this.textARsactualite = textARsactualite;
        changeSupport.firePropertyChange("textARsactualite", oldTextARsactualite, textARsactualite);
    }

    public String getTextFRsactualite() {
        return textFRsactualite;
    }

    public void setTextFRsactualite(String textFRsactualite) {
        String oldTextFRsactualite = this.textFRsactualite;
        this.textFRsactualite = textFRsactualite;
        changeSupport.firePropertyChange("textFRsactualite", oldTextFRsactualite, textFRsactualite);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSActualite != null ? idSActualite.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SActualite)) {
            return false;
        }
        SActualite other = (SActualite) object;
        if ((this.idSActualite == null && other.idSActualite != null) || (this.idSActualite != null && !this.idSActualite.equals(other.idSActualite))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "admin.SActualite[ idSActualite=" + idSActualite + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
