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
@Table(name = "cat_estatus_dano")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CatEstatusDano.findAll", query = "SELECT c FROM CatEstatusDano c")})
public class CatEstatusDano implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "cve_estatus_dano")
    private Short cveEstatusDano;
    @Column(name = "estatus_dano")
    private String estatusDano;
    @OneToMany(mappedBy = "cveEstatusDano")
    private List<DetalleEstructuraPlanteles> detalleEstructuraPlantelesList;

    public CatEstatusDano() {
    }

    public CatEstatusDano(Short cveEstatusDano) {
        this.cveEstatusDano = cveEstatusDano;
    }

    public Short getCveEstatusDano() {
        return cveEstatusDano;
    }

    public void setCveEstatusDano(Short cveEstatusDano) {
        this.cveEstatusDano = cveEstatusDano;
    }

    public String getEstatusDano() {
        return estatusDano;
    }

    public void setEstatusDano(String estatusDano) {
        this.estatusDano = estatusDano;
    }

    @XmlTransient
    public List<DetalleEstructuraPlanteles> getDetalleEstructuraPlantelesList() {
        return detalleEstructuraPlantelesList;
    }

    public void setDetalleEstructuraPlantelesList(List<DetalleEstructuraPlanteles> detalleEstructuraPlantelesList) {
        this.detalleEstructuraPlantelesList = detalleEstructuraPlantelesList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cveEstatusDano != null ? cveEstatusDano.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CatEstatusDano)) {
            return false;
        }
        CatEstatusDano other = (CatEstatusDano) object;
        if ((this.cveEstatusDano == null && other.cveEstatusDano != null) || (this.cveEstatusDano != null && !this.cveEstatusDano.equals(other.cveEstatusDano))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jsm.proescrec.model.CatEstatusDano[ cveEstatusDano=" + cveEstatusDano + " ]";
    }
    
}
