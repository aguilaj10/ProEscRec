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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "cat_municipios")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CatMunicipios.findAll", query = "SELECT c FROM CatMunicipios c")})
public class CatMunicipios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "cve_municipio")
    private String cveMunicipio;
    @Column(name = "municipio")
    private String municipio;
    @JoinColumn(name = "cve_entidad", referencedColumnName = "cve_entidad")
    @ManyToOne
    private CatEntidades cveEntidad;
    @OneToMany(mappedBy = "cveMunicipio")
    private List<CatAsentamientos> catAsentamientosList;

    public CatMunicipios() {
    }

    public CatMunicipios(String cveMunicipio) {
        this.cveMunicipio = cveMunicipio;
    }

    public String getCveMunicipio() {
        return cveMunicipio;
    }

    public void setCveMunicipio(String cveMunicipio) {
        this.cveMunicipio = cveMunicipio;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public CatEntidades getCveEntidad() {
        return cveEntidad;
    }

    public void setCveEntidad(CatEntidades cveEntidad) {
        this.cveEntidad = cveEntidad;
    }

    @XmlTransient
    public List<CatAsentamientos> getCatAsentamientosList() {
        return catAsentamientosList;
    }

    public void setCatAsentamientosList(List<CatAsentamientos> catAsentamientosList) {
        this.catAsentamientosList = catAsentamientosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cveMunicipio != null ? cveMunicipio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CatMunicipios)) {
            return false;
        }
        CatMunicipios other = (CatMunicipios) object;
        if ((this.cveMunicipio == null && other.cveMunicipio != null) || (this.cveMunicipio != null && !this.cveMunicipio.equals(other.cveMunicipio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jsm.proescrec.model.CatMunicipios[ cveMunicipio=" + cveMunicipio + " ]";
    }
    
}
