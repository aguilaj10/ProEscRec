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
@Table(name = "cat_asentamientos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CatAsentamientos.findAll", query = "SELECT c FROM CatAsentamientos c")})
public class CatAsentamientos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "cve_asentamiento")
    private String cveAsentamiento;
    @Column(name = "asentamiento")
    private String asentamiento;
    @Column(name = "codigo_postal")
    private String codigoPostal;
    @Basic(optional = false)
    @Column(name = "tipo_asentamiento")
    private String tipoAsentamiento;
    @OneToMany(mappedBy = "cveAsentamiento")
    private List<Planteles> plantelesList;
    @JoinColumn(name = "cve_municipio", referencedColumnName = "cve_municipio")
    @ManyToOne
    private CatMunicipios cveMunicipio;

    public CatAsentamientos() {
    }

    public CatAsentamientos(String cveAsentamiento) {
        this.cveAsentamiento = cveAsentamiento;
    }

    public CatAsentamientos(String cveAsentamiento, String tipoAsentamiento) {
        this.cveAsentamiento = cveAsentamiento;
        this.tipoAsentamiento = tipoAsentamiento;
    }

    public String getCveAsentamiento() {
        return cveAsentamiento;
    }

    public void setCveAsentamiento(String cveAsentamiento) {
        this.cveAsentamiento = cveAsentamiento;
    }

    public String getAsentamiento() {
        return asentamiento;
    }

    public void setAsentamiento(String asentamiento) {
        this.asentamiento = asentamiento;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getTipoAsentamiento() {
        return tipoAsentamiento;
    }

    public void setTipoAsentamiento(String tipoAsentamiento) {
        this.tipoAsentamiento = tipoAsentamiento;
    }

    @XmlTransient
    public List<Planteles> getPlantelesList() {
        return plantelesList;
    }

    public void setPlantelesList(List<Planteles> plantelesList) {
        this.plantelesList = plantelesList;
    }

    public CatMunicipios getCveMunicipio() {
        return cveMunicipio;
    }

    public void setCveMunicipio(CatMunicipios cveMunicipio) {
        this.cveMunicipio = cveMunicipio;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cveAsentamiento != null ? cveAsentamiento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CatAsentamientos)) {
            return false;
        }
        CatAsentamientos other = (CatAsentamientos) object;
        if ((this.cveAsentamiento == null && other.cveAsentamiento != null) || (this.cveAsentamiento != null && !this.cveAsentamiento.equals(other.cveAsentamiento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jsm.proescrec.model.CatAsentamientos[ cveAsentamiento=" + cveAsentamiento + " ]";
    }
    
}
