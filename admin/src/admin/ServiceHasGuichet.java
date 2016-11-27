/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author kadhem
 */
@Entity
@Table(name = "service_has_guichet", catalog = "pfe", schema = "")
@NamedQueries({
    @NamedQuery(name = "ServiceHasGuichet.findAll", query = "SELECT s FROM ServiceHasGuichet s"),
    @NamedQuery(name = "ServiceHasGuichet.findByIdService", query = "SELECT s FROM ServiceHasGuichet s WHERE s.serviceHasGuichetPK.idService = :idService"),
    @NamedQuery(name = "ServiceHasGuichet.findByIdGuichet", query = "SELECT s FROM ServiceHasGuichet s WHERE s.serviceHasGuichetPK.idGuichet = :idGuichet")})
public class ServiceHasGuichet implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ServiceHasGuichetPK serviceHasGuichetPK;

    public ServiceHasGuichet() {
    }

    public ServiceHasGuichet(ServiceHasGuichetPK serviceHasGuichetPK) {
        this.serviceHasGuichetPK = serviceHasGuichetPK;
    }

    public ServiceHasGuichet(int idService, int idGuichet) {
        this.serviceHasGuichetPK = new ServiceHasGuichetPK(idService, idGuichet);
    }

    public ServiceHasGuichetPK getServiceHasGuichetPK() {
        return serviceHasGuichetPK;
    }

    public void setServiceHasGuichetPK(ServiceHasGuichetPK serviceHasGuichetPK) {
        this.serviceHasGuichetPK = serviceHasGuichetPK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (serviceHasGuichetPK != null ? serviceHasGuichetPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ServiceHasGuichet)) {
            return false;
        }
        ServiceHasGuichet other = (ServiceHasGuichet) object;
        if ((this.serviceHasGuichetPK == null && other.serviceHasGuichetPK != null) || (this.serviceHasGuichetPK != null && !this.serviceHasGuichetPK.equals(other.serviceHasGuichetPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "admin.ServiceHasGuichet[ serviceHasGuichetPK=" + serviceHasGuichetPK + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
