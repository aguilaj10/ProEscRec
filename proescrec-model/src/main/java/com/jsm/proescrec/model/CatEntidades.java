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
@Table(name = "cat_entidades")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CatEntidades.findAll", query = "SELECT c FROM CatEntidades c")})
public class CatEntidades implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "cve_entidad")
    private String cveEntidad;
    @Column(name = "entidad")
    private String entidad;
    @Column(name = "abreviatura")
    private String abreviatura;
    @OneToMany(mappedBy = "cveEntidad")
    private List<CatMunicipios> catMunicipiosList;

    public CatEntidades() {
    }

    public CatEntidades(String cveEntidad) {
        this.cveEntidad = cveEntidad;
    }

    public String getCveEntidad() {
        return cveEntidad;
    }

    public void setCveEntidad(String cveEntidad) {
        this.cveEntidad = cveEntidad;
    }

    public String getEntidad() {
        return entidad;
    }

    public void setEntidad(String entidad) {
        this.entidad = entidad;
    }

    public String getAbreviatura() {
        return abreviatura;
    }

    public void setAbreviatura(String abreviatura) {
        this.abreviatura = abreviatura;
    }

    @XmlTransient
    public List<CatMunicipios> getCatMunicipiosList() {
        return catMunicipiosList;
    }

    public void setCatMunicipiosList(List<CatMunicipios> catMunicipiosList) {
        this.catMunicipiosList = catMunicipiosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cveEntidad != null ? cveEntidad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CatEntidades)) {
            return false;
        }
        CatEntidades other = (CatEntidades) object;
        if ((this.cveEntidad == null && other.cveEntidad != null) || (this.cveEntidad != null && !this.cveEntidad.equals(other.cveEntidad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jsm.proescrec.model.CatEntidades[ cveEntidad=" + cveEntidad + " ]";
    }
    
}
