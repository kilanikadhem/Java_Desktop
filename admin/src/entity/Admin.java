/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author kadhem
 */
@Entity
@Table(name = "admin", catalog = "pfe", schema = "")
@NamedQueries({
    @NamedQuery(name = "Admin_1.findAll", query = "SELECT a FROM Admin a"),
    @NamedQuery(name = "Admin_1.findByLoginAdmin", query = "SELECT a FROM Admin a WHERE a.loginAdmin = :loginAdmin"),
    @NamedQuery(name = "Admin_1.findByPswAdmin", query = "SELECT a FROM Admin a WHERE a.pswAdmin = :pswAdmin")})
public class Admin implements Serializable {

    @JoinColumn(name = "id_recette", referencedColumnName = "idrecette")
    @ManyToOne(optional = false)
    private Recette idRecette;

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "login_admin")
    private String loginAdmin;
    @Basic(optional = false)
    @Column(name = "psw_admin")
    private String pswAdmin;

    public Admin() {
    }

    public Admin(String loginAdmin) {
        this.loginAdmin = loginAdmin;
    }

    public Admin(String loginAdmin, String pswAdmin) {
        this.loginAdmin = loginAdmin;
        this.pswAdmin = pswAdmin;
    }

    public String getLoginAdmin() {
        return loginAdmin;
    }

    public void setLoginAdmin(String loginAdmin) {
        String oldLoginAdmin = this.loginAdmin;
        this.loginAdmin = loginAdmin;
        changeSupport.firePropertyChange("loginAdmin", oldLoginAdmin, loginAdmin);
    }

    public String getPswAdmin() {
        return pswAdmin;
    }

    public void setPswAdmin(String pswAdmin) {
        String oldPswAdmin = this.pswAdmin;
        this.pswAdmin = pswAdmin;
        changeSupport.firePropertyChange("pswAdmin", oldPswAdmin, pswAdmin);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (loginAdmin != null ? loginAdmin.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Admin)) {
            return false;
        }
        Admin other = (Admin) object;
        if ((this.loginAdmin == null && other.loginAdmin != null) || (this.loginAdmin != null && !this.loginAdmin.equals(other.loginAdmin))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "admin.Admin_1[ loginAdmin=" + loginAdmin + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }

    public Recette getIdRecette() {
        return idRecette;
    }

    public void setIdRecette(Recette idRecette) {
        Recette oldIdRecette = this.idRecette;
        this.idRecette = idRecette;
        changeSupport.firePropertyChange("idRecette", oldIdRecette, idRecette);
    }
    
}
