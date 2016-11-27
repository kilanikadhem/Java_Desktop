/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author kadhem
 */
@Embeddable
public class ServiceHasGuichetPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "id_service")
    private int idService;
    @Basic(optional = false)
    @Column(name = "id_guichet")
    private int idGuichet;

    public ServiceHasGuichetPK() {
    }

    public ServiceHasGuichetPK(int idService, int idGuichet) {
        this.idService = idService;
        this.idGuichet = idGuichet;
    }

    public int getIdService() {
        return idService;
    }

    public void setIdService(int idService) {
        this.idService = idService;
    }

    public int getIdGuichet() {
        return idGuichet;
    }

    public void setIdGuichet(int idGuichet) {
        this.idGuichet = idGuichet;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idService;
        hash += (int) idGuichet;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ServiceHasGuichetPK)) {
            return false;
        }
        ServiceHasGuichetPK other = (ServiceHasGuichetPK) object;
        if (this.idService != other.idService) {
            return false;
        }
        if (this.idGuichet != other.idGuichet) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "admin.ServiceHasGuichetPK[ idService=" + idService + ", idGuichet=" + idGuichet + " ]";
    }
    
}
