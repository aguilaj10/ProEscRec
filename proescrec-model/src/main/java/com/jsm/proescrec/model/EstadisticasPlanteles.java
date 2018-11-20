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
@Table(name = "estadisticas_planteles")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EstadisticasPlanteles.findAll", query = "SELECT e FROM EstadisticasPlanteles e")})
public class EstadisticasPlanteles implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "plantel_id")
    private Integer plantelId;
    @Column(name = "matricula_matutino")
    private Integer matriculaMatutino;
    @Column(name = "matricula_vespertino")
    private Integer matriculaVespertino;
    @Column(name = "matricula_noturno")
    private Integer matriculaNoturno;
    @Column(name = "alumnos_clases")
    private String alumnosClases;
    @Column(name = "edificios_sin_danos")
    private Integer edificiosSinDanos;
    @Column(name = "edificios_nuevos")
    private Integer edificiosNuevos;
    @Column(name = "aulas_provisionales")
    private Integer aulasProvisionales;
    @Column(name = "edificios_prestados")
    private Integer edificiosPrestados;
    @Column(name = "edificios_reparados")
    private Integer edificiosReparados;
    @Column(name = "impartiendo_clases")
    private String impartiendoClases;
    @Column(name = "motivo")
    private String motivo;
    @JoinColumn(name = "plantel_id", referencedColumnName = "plantel_id", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Planteles planteles;

    public EstadisticasPlanteles() {
    }

    public EstadisticasPlanteles(Integer plantelId) {
        this.plantelId = plantelId;
    }

    public Integer getPlantelId() {
        return plantelId;
    }

    public void setPlantelId(Integer plantelId) {
        this.plantelId = plantelId;
    }

    public Integer getMatriculaMatutino() {
        return matriculaMatutino;
    }

    public void setMatriculaMatutino(Integer matriculaMatutino) {
        this.matriculaMatutino = matriculaMatutino;
    }

    public Integer getMatriculaVespertino() {
        return matriculaVespertino;
    }

    public void setMatriculaVespertino(Integer matriculaVespertino) {
        this.matriculaVespertino = matriculaVespertino;
    }

    public Integer getMatriculaNoturno() {
        return matriculaNoturno;
    }

    public void setMatriculaNoturno(Integer matriculaNoturno) {
        this.matriculaNoturno = matriculaNoturno;
    }

    public String getAlumnosClases() {
        return alumnosClases;
    }

    public void setAlumnosClases(String alumnosClases) {
        this.alumnosClases = alumnosClases;
    }

    public Integer getEdificiosSinDanos() {
        return edificiosSinDanos;
    }

    public void setEdificiosSinDanos(Integer edificiosSinDanos) {
        this.edificiosSinDanos = edificiosSinDanos;
    }

    public Integer getEdificiosNuevos() {
        return edificiosNuevos;
    }

    public void setEdificiosNuevos(Integer edificiosNuevos) {
        this.edificiosNuevos = edificiosNuevos;
    }

    public Integer getAulasProvisionales() {
        return aulasProvisionales;
    }

    public void setAulasProvisionales(Integer aulasProvisionales) {
        this.aulasProvisionales = aulasProvisionales;
    }

    public Integer getEdificiosPrestados() {
        return edificiosPrestados;
    }

    public void setEdificiosPrestados(Integer edificiosPrestados) {
        this.edificiosPrestados = edificiosPrestados;
    }

    public Integer getEdificiosReparados() {
        return edificiosReparados;
    }

    public void setEdificiosReparados(Integer edificiosReparados) {
        this.edificiosReparados = edificiosReparados;
    }

    public String getImpartiendoClases() {
        return impartiendoClases;
    }

    public void setImpartiendoClases(String impartiendoClases) {
        this.impartiendoClases = impartiendoClases;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
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
        if (!(object instanceof EstadisticasPlanteles)) {
            return false;
        }
        EstadisticasPlanteles other = (EstadisticasPlanteles) object;
        if ((this.plantelId == null && other.plantelId != null) || (this.plantelId != null && !this.plantelId.equals(other.plantelId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jsm.proescrec.model.EstadisticasPlanteles[ plantelId=" + plantelId + " ]";
    }
    
}
