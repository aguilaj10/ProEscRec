/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsm.proescrec.model;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jonthansanchez
 */
@Entity
@Table(name = "estatus_financiero")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EstatusFinanciero.findAll", query = "SELECT e FROM EstatusFinanciero e")})
public class EstatusFinanciero implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "plantel_id")
    private Integer plantelId;
    @Column(name = "monto_reparacion_plantel ")
    private BigInteger montoReparacionPlantel;
    @Column(name = "monto_devengado")
    private BigInteger montoDevengado;
    @Column(name = "recurso_suficiente")
    private String recursoSuficiente;
    @Column(name = "recurso_fonden")
    private BigInteger recursoFonden;
    @Column(name = "recurso_escuelas_100")
    private BigInteger recursoEscuelas100;
    @Column(name = "seguro_inmueble")
    private BigInteger seguroInmueble;
    @JoinColumn(name = "plantel_id", referencedColumnName = "plantel_id", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Planteles planteles;

    public EstatusFinanciero() {
    }

    public EstatusFinanciero(Integer plantelId) {
        this.plantelId = plantelId;
    }

    public Integer getPlantelId() {
        return plantelId;
    }

    public void setPlantelId(Integer plantelId) {
        this.plantelId = plantelId;
    }

    public BigInteger getMontoReparacionPlantel() {
        return montoReparacionPlantel;
    }

    public void setMontoReparacionPlantel(BigInteger montoReparacionPlantel) {
        this.montoReparacionPlantel = montoReparacionPlantel;
    }

    public BigInteger getMontoDevengado() {
        return montoDevengado;
    }

    public void setMontoDevengado(BigInteger montoDevengado) {
        this.montoDevengado = montoDevengado;
    }

    public String getRecursoSuficiente() {
        return recursoSuficiente;
    }

    public void setRecursoSuficiente(String recursoSuficiente) {
        this.recursoSuficiente = recursoSuficiente;
    }

    public BigInteger getRecursoFonden() {
        return recursoFonden;
    }

    public void setRecursoFonden(BigInteger recursoFonden) {
        this.recursoFonden = recursoFonden;
    }

    public BigInteger getRecursoEscuelas100() {
        return recursoEscuelas100;
    }

    public void setRecursoEscuelas100(BigInteger recursoEscuelas100) {
        this.recursoEscuelas100 = recursoEscuelas100;
    }

    public BigInteger getSeguroInmueble() {
        return seguroInmueble;
    }

    public void setSeguroInmueble(BigInteger seguroInmueble) {
        this.seguroInmueble = seguroInmueble;
    }

    public Planteles getPlanteles() {
        return planteles;
    }

    public void setPlanteles(Planteles planteles) {
        this.planteles = planteles;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (plantelId != null ? plantelId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EstatusFinanciero)) {
            return false;
        }
        EstatusFinanciero other = (EstatusFinanciero) object;
        return !((this.plantelId == null && other.plantelId != null) || (this.plantelId != null && !this.plantelId.equals(other.plantelId)));
    }

    @Override
    public String toString() {
        return "com.jsm.proescrec.model.EstatusFinanciero[ plantelId=" + plantelId + " ]";
    }
    
}
