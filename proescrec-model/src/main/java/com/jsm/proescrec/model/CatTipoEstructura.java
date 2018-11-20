/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsm.proescrec.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author jonthansanchez
 */
@Entity
@Table(name = "cat_tipo_estructura")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CatTipoEstructura.findAll", query = "SELECT c FROM CatTipoEstructura c")})
public class CatTipoEstructura implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cve_tipo_estructura")
    private Integer cveTipoEstructura;
    @Column(name = "tipo_estructura")
    private String tipoEstructura;
    @OneToMany(mappedBy = "cveTipoEstructura")
    private List<EstructuraPlanteles> estructuraPlantelesList;

    public CatTipoEstructura() {
    }

    public CatTipoEstructura(Integer cveTipoEstructura) {
        this.cveTipoEstructura = cveTipoEstructura;
    }

    public Integer getCveTipoEstructura() {
        return cveTipoEstructura;
    }

    public void setCveTipoEstructura(Integer cveTipoEstructura) {
        this.cveTipoEstructura = cveTipoEstructura;
    }

    public String getTipoEstructura() {
        return tipoEstructura;
    }

    public void setTipoEstructura(String tipoEstructura) {
        this.tipoEstructura = tipoEstructura;
    }

    @XmlTransient
    public List<EstructuraPlanteles> getEstructuraPlantelesList() {
        return estructuraPlantelesList;
    }

    public void setEstructuraPlantelesList(List<EstructuraPlanteles> estructuraPlantelesList) {
        this.estructuraPlantelesList = estructuraPlantelesList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cveTipoEstructura != null ? cveTipoEstructura.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CatTipoEstructura)) {
            return false;
        }
        CatTipoEstructura other = (CatTipoEstructura) object;
        if ((this.cveTipoEstructura == null && other.cveTipoEstructura != null) || (this.cveTipoEstructura != null && !this.cveTipoEstructura.equals(other.cveTipoEstructura))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jsm.proescrec.model.CatTipoEstructura[ cveTipoEstructura=" + cveTipoEstructura + " ]";
    }
    
}
