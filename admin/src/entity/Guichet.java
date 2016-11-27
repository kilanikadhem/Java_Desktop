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
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author kadhem
 */
@Entity
@Table(name = "guichet")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Guichet.findAll", query = "SELECT g FROM Guichet g"),
    @NamedQuery(name = "Guichet.findByIdGuichet", query = "SELECT g FROM Guichet g WHERE g.idGuichet = :idGuichet"),
    @NamedQuery(name = "Guichet.findByNumGuichet", query = "SELECT g FROM Guichet g WHERE g.numGuichet = :numGuichet"),
    @NamedQuery(name = "Guichet.findByClientAct", query = "SELECT g FROM Guichet g WHERE g.clientAct = :clientAct"),
    @NamedQuery(name = "Guichet.findByEtat", query = "SELECT g FROM Guichet g WHERE g.etat = :etat")})
public class Guichet implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    @ManyToMany(mappedBy = "guichetCollection")
    private Collection<Service> serviceCollection;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_guichet")
    private Integer idGuichet;
    @Basic(optional = false)
    @Column(name = "num_guichet")
    private int numGuichet;
    @Basic(optional = false)
    @Column(name = "client_act")
    private int clientAct;
    @Basic(optional = false)
    @Column(name = "etat")
    private int etat;

    public Guichet() {
    }

    public Guichet(Integer idGuichet) {
        this.idGuichet = idGuichet;
    }

    public Guichet(Integer idGuichet, int numGuichet, int clientAct, int etat) {
        this.idGuichet = idGuichet;
        this.numGuichet = numGuichet;
        this.clientAct = clientAct;
        this.etat = etat;
    }

    public Integer getIdGuichet() {
        return idGuichet;
    }

    public void setIdGuichet(Integer idGuichet) {
        Integer oldIdGuichet = this.idGuichet;
        this.idGuichet = idGuichet;
        changeSupport.firePropertyChange("idGuichet", oldIdGuichet, idGuichet);
    }

    public int getNumGuichet() {
        return numGuichet;
    }

    public void setNumGuichet(int numGuichet) {
        int oldNumGuichet = this.numGuichet;
        this.numGuichet = numGuichet;
        changeSupport.firePropertyChange("numGuichet", oldNumGuichet, numGuichet);
    }

    public int getClientAct() {
        return clientAct;
    }

    public void setClientAct(int clientAct) {
        int oldClientAct = this.clientAct;
        this.clientAct = clientAct;
        changeSupport.firePropertyChange("clientAct", oldClientAct, clientAct);
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
        hash += (idGuichet != null ? idGuichet.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Guichet)) {
            return false;
        }
        Guichet other = (Guichet) object;
        if ((this.idGuichet == null && other.idGuichet != null) || (this.idGuichet != null && !this.idGuichet.equals(other.idGuichet))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Guichet[ idGuichet=" + idGuichet + " ]";
    }

    @XmlTransient
    public Collection<Service> getServiceCollection() {
        return serviceCollection;
    }

    public void setServiceCollection(Collection<Service> serviceCollection) {
        this.serviceCollection = serviceCollection;
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
