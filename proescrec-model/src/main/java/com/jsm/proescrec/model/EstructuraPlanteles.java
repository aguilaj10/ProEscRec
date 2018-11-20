/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsm.proescrec.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jonthansanchez
 */
@Entity
@Table(name = "estructura_planteles")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EstructuraPlanteles.findAll", query = "SELECT e FROM EstructuraPlanteles e")})
public class EstructuraPlanteles implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @SequenceGenerator(allocationSize = 1, name = "SEQ_ESTRUCTURA_PLANTEL", sequenceName = "estructura_planteles_estructura_plantel_id_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_ESTRUCTURA_PLANTEL")
    @Basic(optional = false)
    @Column(name = "estructura_plantel_id")
    private Integer estructuraPlantelId;
    @Column(name = "edificios_1_nivel")
    private Integer edificios1Nivel;
    @Column(name = "edificios_2_niveles")
    private Integer edificios2Niveles;
    @Column(name = "edificios_3_niveles")
    private Integer edificios3Niveles;
    @JoinColumn(name = "cve_tipo_estructura", referencedColumnName = "cve_tipo_estructura")
    @ManyToOne
    private CatTipoEstructura cveTipoEstructura;
    @JoinColumn(name = "plantel_id", referencedColumnName = "plantel_id")
    @ManyToOne
    private Planteles plantelId;

    public EstructuraPlanteles() {
    }

    public EstructuraPlanteles(Integer estructuraPlantelId) {
        this.estructuraPlantelId = estructuraPlantelId;
    }

    public Integer getEstructuraPlantelId() {
        return estructuraPlantelId;
    }

    public void setEstructuraPlantelId(Integer estructuraPlantelId) {
        this.estructuraPlantelId = estructuraPlantelId;
    }

    public Integer getEdificios1Nivel() {
        return edificios1Nivel;
    }

    public void setEdificios1Nivel(Integer edificios1Nivel) {
        this.edificios1Nivel = edificios1Nivel;
    }

    public Integer getEdificios2Niveles() {
        return edificios2Niveles;
    }

    public void setEdificios2Niveles(Integer edificios2Niveles) {
        this.edificios2Niveles = edificios2Niveles;
    }

    public Integer getEdificios3Niveles() {
        return edificios3Niveles;
    }

    public void setEdificios3Niveles(Integer edificios3Niveles) {
        this.edificios3Niveles = edificios3Niveles;
    }

    public CatTipoEstructura getCveTipoEstructura() {
        return cveTipoEstructura;
    }

    public void setCveTipoEstructura(CatTipoEstructura cveTipoEstructura) {
        this.cveTipoEstructura = cveTipoEstructura;
    }

    public Planteles getPlantelId() {
        return plantelId;
    }

    public void setPlantelId(Planteles plantelId) {
        this.plantelId = plantelId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (estructuraPlantelId != null ? estructuraPlantelId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EstructuraPlanteles)) {
            return false;
        }
        EstructuraPlanteles other = (EstructuraPlanteles) object;
        if ((this.estructuraPlantelId == null && other.estructuraPlantelId != null) || (this.estructuraPlantelId != null && !this.estructuraPlantelId.equals(other.estructuraPlantelId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jsm.proescrec.model.EstructuraPlanteles[ estructuraPlantelId=" + estructuraPlantelId + " ]";
    }
    
}
