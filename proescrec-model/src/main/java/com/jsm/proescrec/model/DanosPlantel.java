/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsm.proescrec.model;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jonthansanchez
 */
@Entity
@Table(name = "danos_plantel")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DanosPlantel.findAll", query = "SELECT d FROM DanosPlantel d")})
public class DanosPlantel implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "plantel_id")
    private Integer plantelId;
    @Column(name = "bardas_danadas")
    private String bardasDanadas;
    @Column(name = "muros_fisurados")
    private String murosFisurados;
    @Column(name = "columnas_danadas")
    private String columnasDanadas;
    @Column(name = "pisos_danados")
    private String pisosDanados;
    @Column(name = "edificios_inclinados")
    private String edificiosInclinados;
    @Column(name = "desprendiemiento")
    private String desprendiemiento;
    @Column(name = "pisos_fracturados")
    private String pisosFracturados;
    @Column(name = "edificios_colapsados")
    private String edificiosColapsados;
    @Column(name = "cisterna_fisurada")
    private String cisternaFisurada;
    @Column(name = "tuberia_hidraulica")
    private String tuberiaHidraulica;
    @Column(name = "tuberia_sanitaria")
    private String tuberiaSanitaria;
    @Column(name = "tuberia_electrica")
    private String tuberiaElectrica;
    @Column(name = "trabajos_reparacion")
    private String trabajosReparacion;
    @Column(name = "avance_aprox")
    private BigInteger avanceAprox;
    @Column(name = "fecha_inicio")
    @Temporal(TemporalType.DATE)
    private Date fechaInicio;
    @Column(name = "fecha_conclusion")
    @Temporal(TemporalType.DATE)
    private Date fechaConclusion;
    @Column(name = "fecha_suspension")
    @Temporal(TemporalType.DATE)
    private Date fechaSuspension;
    @Column(name = "motivo_suspension")
    private String motivoSuspension;
    @Column(name = "monto_reparacion")
    private BigInteger montoReparacion;
    @Column(name = "reparacion_total")
    private String reparacionTotal;
    @Column(name = "monto_conclusion")
    private BigInteger montoConclusion;
    @Column(name = "observaciones")
    private String observaciones;
    @JoinColumn(name = "plantel_id", referencedColumnName = "plantel_id", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Planteles planteles;

    public DanosPlantel() {
    }

    public DanosPlantel(Integer plantelId) {
        this.plantelId = plantelId;
    }

    public Integer getPlantelId() {
        return plantelId;
    }

    public void setPlantelId(Integer plantelId) {
        this.plantelId = plantelId;
    }

    public String getBardasDanadas() {
        return bardasDanadas;
    }

    public void setBardasDanadas(String bardasDanadas) {
        this.bardasDanadas = bardasDanadas;
    }

    public String getMurosFisurados() {
        return murosFisurados;
    }

    public void setMurosFisurados(String murosFisurados) {
        this.murosFisurados = murosFisurados;
    }

    public String getColumnasDanadas() {
        return columnasDanadas;
    }

    public void setColumnasDanadas(String columnasDanadas) {
        this.columnasDanadas = columnasDanadas;
    }

    public String getPisosDanados() {
        return pisosDanados;
    }

    public void setPisosDanados(String pisosDanados) {
        this.pisosDanados = pisosDanados;
    }

    public String getEdificiosInclinados() {
        return edificiosInclinados;
    }

    public void setEdificiosInclinados(String edificiosInclinados) {
        this.edificiosInclinados = edificiosInclinados;
    }

    public String getDesprendiemiento() {
        return desprendiemiento;
    }

    public void setDesprendiemiento(String desprendiemiento) {
        this.desprendiemiento = desprendiemiento;
    }

    public String getPisosFracturados() {
        return pisosFracturados;
    }

    public void setPisosFracturados(String pisosFracturados) {
        this.pisosFracturados = pisosFracturados;
    }

    public String getEdificiosColapsados() {
        return edificiosColapsados;
    }

    public void setEdificiosColapsados(String edificiosColapsados) {
        this.edificiosColapsados = edificiosColapsados;
    }

    public String getCisternaFisurada() {
        return cisternaFisurada;
    }

    public void setCisternaFisurada(String cisternaFisurada) {
        this.cisternaFisurada = cisternaFisurada;
    }

    public String getTuberiaHidraulica() {
        return tuberiaHidraulica;
    }

    public void setTuberiaHidraulica(String tuberiaHidraulica) {
        this.tuberiaHidraulica = tuberiaHidraulica;
    }

    public String getTuberiaSanitaria() {
        return tuberiaSanitaria;
    }

    public void setTuberiaSanitaria(String tuberiaSanitaria) {
        this.tuberiaSanitaria = tuberiaSanitaria;
    }

    public String getTuberiaElectrica() {
        return tuberiaElectrica;
    }

    public void setTuberiaElectrica(String tuberiaElectrica) {
        this.tuberiaElectrica = tuberiaElectrica;
    }

    public String getTrabajosReparacion() {
        return trabajosReparacion;
    }

    public void setTrabajosReparacion(String trabajosReparacion) {
        this.trabajosReparacion = trabajosReparacion;
    }

    public BigInteger getAvanceAprox() {
        return avanceAprox;
    }

    public void setAvanceAprox(BigInteger avanceAprox) {
        this.avanceAprox = avanceAprox;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaConclusion() {
        return fechaConclusion;
    }

    public void setFechaConclusion(Date fechaConclusion) {
        this.fechaConclusion = fechaConclusion;
    }

    public Date getFechaSuspension() {
        return fechaSuspension;
    }

    public void setFechaSuspension(Date fechaSuspension) {
        this.fechaSuspension = fechaSuspension;
    }

    public String getMotivoSuspension() {
        return motivoSuspension;
    }

    public void setMotivoSuspension(String motivoSuspension) {
        this.motivoSuspension = motivoSuspension;
    }

    public BigInteger getMontoReparacion() {
        return montoReparacion;
    }

    public void setMontoReparacion(BigInteger montoReparacion) {
        this.montoReparacion = montoReparacion;
    }

    public String getReparacionTotal() {
        return reparacionTotal;
    }

    public void setReparacionTotal(String reparacionTotal) {
        this.reparacionTotal = reparacionTotal;
    }

    public BigInteger getMontoConclusion() {
        return montoConclusion;
    }

    public void setMontoConclusion(BigInteger montoConclusion) {
        this.montoConclusion = montoConclusion;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
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
        if (!(object instanceof DanosPlantel)) {
            return false;
        }
        DanosPlantel other = (DanosPlantel) object;
        if ((this.plantelId == null && other.plantelId != null) || (this.plantelId != null && !this.plantelId.equals(other.plantelId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jsm.proescrec.model.DanosPlantel[ plantelId=" + plantelId + " ]";
    }
    
}
