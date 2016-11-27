/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author kadhem
 */
@Entity
@Table(name = "service")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Service.findAll", query = "SELECT s FROM Service s"),
    @NamedQuery(name = "Service.findByIdService", query = "SELECT s FROM Service s WHERE s.idService = :idService"),
    @NamedQuery(name = "Service.findByNomAR", query = "SELECT s FROM Service s WHERE s.nomAR = :nomAR"),
    @NamedQuery(name = "Service.findByNomFR", query = "SELECT s FROM Service s WHERE s.nomFR = :nomFR"),
    @NamedQuery(name = "Service.findByEtat", query = "SELECT s FROM Service s WHERE s.etat = :etat")})
public class Service implements Serializable {

    @JoinTable(name = "service_has_guichet", joinColumns = {
        @JoinColumn(name = "id_service", referencedColumnName = "id_service")}, inverseJoinColumns = {
        @JoinColumn(name = "id_guichet", referencedColumnName = "id_guichet")})
    @ManyToMany
    private Collection<Guichet> guichetCollection;

    @Basic(optional = false)
    @Column(name = "tmptrait")
    private int tmptrait;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idService")
    private Collection<Client> clientCollection;

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_service")
    private Integer idService;
    @Basic(optional = false)
    @Column(name = "nomAR")
    private String nomAR;
    @Basic(optional = false)
    @Column(name = "nomFR")
    private String nomFR;
    @Basic(optional = false)
    @Column(name = "etat")
    private int etat;

    public Service() {
    }

    public Service(Integer idService) {
        this.idService = idService;
    }

    public Service(Integer idService, String nomAR, String nomFR, int etat) {
        this.idService = idService;
        this.nomAR = nomAR;
        this.nomFR = nomFR;
        this.etat = etat;
    }

    public Integer getIdService() {
        return idService;
    }

    public void setIdService(Integer idService) {
        Integer oldIdService = this.idService;
        this.idService = idService;
        changeSupport.firePropertyChange("idService", oldIdService, idService);
    }

    public String getNomAR() {
        return nomAR;
    }

    public void setNomAR(String nomAR) {
        String oldNomAR = this.nomAR;
        this.nomAR = nomAR;
        changeSupport.firePropertyChange("nomAR", oldNomAR, nomAR);
    }

    public String getNomFR() {
        return nomFR;
    }

    public void setNomFR(String nomFR) {
        String oldNomFR = this.nomFR;
        this.nomFR = nomFR;
        changeSupport.firePropertyChange("nomFR", oldNomFR, nomFR);
    }

    public int getEtat() {
        return etat;
    }

    public void setEtat(int etat) {
        int oldEtat = this.etat;
        this.etat = etat;
        changeSupport.firePropertyChange("etat", oldEtat, etat);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idService != null ? idService.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Service)) {
            return false;
        }
        Service other = (Service) object;
        if ((this.idService == null && other.idService != null) || (this.idService != null && !this.idService.equals(other.idService))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Service[ idService=" + idService + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }

    public int getTmptrait() {
        return tmptrait;
    }

    public void setTmptrait(int tmptrait) {
        this.tmptrait = tmptrait;
    }

    @XmlTransient
    public Collection<Client> getClientCollection() {
        return clientCollection;
    }

    public void setClientCollection(Collection<Client> clientCollection) {
        this.clientCollection = clientCollection;
    }

    @XmlTransient
    public Collection<Guichet> getGuichetCollection() {
        return guichetCollection;
    }

    public void setGuichetCollection(Collection<Guichet> guichetCollection) {
        this.guichetCollection = guichetCollection;
    }
    
}
