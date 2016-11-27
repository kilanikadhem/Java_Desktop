/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kadhem
 */
@Entity
@Table(name = "statistique")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Statistique_1.findAll", query = "SELECT s FROM Statistique_1 s"),
    @NamedQuery(name = "Statistique_1.findByIdStatistique", query = "SELECT s FROM Statistique_1 s WHERE s.idStatistique = :idStatistique"),
    @NamedQuery(name = "Statistique_1.findByDate", query = "SELECT s FROM Statistique_1 s WHERE s.date = :date"),
    @NamedQuery(name = "Statistique_1.findByNumCltTrait", query = "SELECT s FROM Statistique_1 s WHERE s.numCltTrait = :numCltTrait"),
    @NamedQuery(name = "Statistique_1.findByTmptrait", query = "SELECT s FROM Statistique_1 s WHERE s.tmptrait = :tmptrait")})
public class Statistique_1 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_statistique")
    private Integer idStatistique;
    @Basic(optional = false)
    @Column(name = "date")
    @Temporal(TemporalType.DATE)
    private Date date;
    @Basic(optional = false)
    @Column(name = "num_clt_trait")
    private int numCltTrait;
    @Basic(optional = false)
    @Column(name = "tmptrait")
    private int tmptrait;

    public Statistique_1() {
    }

    public Statistique_1(Integer idStatistique) {
        this.idStatistique = idStatistique;
    }

    public Statistique_1(Integer idStatistique, Date date, int numCltTrait, int tmptrait) {
        this.idStatistique = idStatistique;
        this.date = date;
        this.numCltTrait = numCltTrait;
        this.tmptrait = tmptrait;
    }

    public Integer getIdStatistique() {
        return idStatistique;
    }

    public void setIdStatistique(Integer idStatistique) {
        this.idStatistique = idStatistique;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getNumCltTrait() {
        return numCltTrait;
    }

    public void setNumCltTrait(int numCltTrait) {
        this.numCltTrait = numCltTrait;
    }

    public int getTmptrait() {
        return tmptrait;
    }

    public void setTmptrait(int tmptrait) {
        this.tmptrait = tmptrait;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idStatistique != null ? idStatistique.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Statistique_1)) {
            return false;
        }
        Statistique_1 other = (Statistique_1) object;
        if ((this.idStatistique == null && other.idStatistique != null) || (this.idStatistique != null && !this.idStatistique.equals(other.idStatistique))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Statistique_1[ idStatistique=" + idStatistique + " ]";
    }
    
}
