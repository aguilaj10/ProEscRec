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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jonthansanchez
 */
@Entity
@Table(name = "detalle_estructura_planteles")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DetalleEstructuraPlanteles.findAll", query = "SELECT d FROM DetalleEstructuraPlanteles d")})
public class DetalleEstructuraPlanteles implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "plantel_id")
    private Integer plantelId;
    @Column(name = "no_sanitarios_ninos")
    private Short noSanitariosNinos;
    @Column(name = "no_sanitarios_ninas")
    private Short noSanitariosNinas;
    @Column(name = "no_aulas_didacticas")
    private Short noAulasDidacticas;
    @Column(name = "no_talleres")
    private Short noTalleres;
    @Column(name = "no_aulas_computo")
    private Short noAulasComputo;
    @Column(name = "no_computadoras_aulas")
    private Short noComputadorasAulas;
    @Column(name = "no_impresoras_aulas")
    private Short noImpresorasAulas;
    @Column(name = "no_computadoras_diraccion")
    private Short noComputadorasDiraccion;
    @Column(name = "no_impresoras_direccion")
    private Short noImpresorasDireccion;
    @Column(name = "no_computadoras_admin")
    private Short noComputadorasAdmin;
    @Column(name = "no_impresoras_admin")
    private Short noImpresorasAdmin;
    @Column(name = "internet_aulas")
    private String internetAulas;
    @Column(name = "internet_direccion_admin")
    private String internetDireccionAdmin;
    @Column(name = "dictamen_dro")
    private String dictamenDro;
    @JoinColumn(name = "cve_estatus_dano", referencedColumnName = "cve_estatus_dano")
    @ManyToOne
    private CatEstatusDano cveEstatusDano;
    @JoinColumn(name = "plantel_id", referencedColumnName = "plantel_id", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Planteles planteles;

    public DetalleEstructuraPlanteles() {
    }

    public DetalleEstructuraPlanteles(Integer plantelId) {
        this.plantelId = plantelId;
    }

    public Integer getPlantelId() {
        return plantelId;
    }

    public void setPlantelId(Integer plantelId) {
        this.plantelId = plantelId;
    }

    public Short getNoSanitariosNinos() {
        return noSanitariosNinos;
    }

    public void setNoSanitariosNinos(Short noSanitariosNinos) {
        this.noSanitariosNinos = noSanitariosNinos;
    }

    public Short getNoSanitariosNinas() {
        return noSanitariosNinas;
    }

    public void setNoSanitariosNinas(Short noSanitariosNinas) {
        this.noSanitariosNinas = noSanitariosNinas;
    }

    public Short getNoAulasDidacticas() {
        return noAulasDidacticas;
    }

    public void setNoAulasDidacticas(Short noAulasDidacticas) {
        this.noAulasDidacticas = noAulasDidacticas;
    }

    public Short getNoTalleres() {
        return noTalleres;
    }

    public void setNoTalleres(Short noTalleres) {
        this.noTalleres = noTalleres;
    }

    public Short getNoAulasComputo() {
        return noAulasComputo;
    }

    public void setNoAulasComputo(Short noAulasComputo) {
        this.noAulasComputo = noAulasComputo;
    }

    public Short getNoComputadorasAulas() {
        return noComputadorasAulas;
    }

    public void setNoComputadorasAulas(Short noComputadorasAulas) {
        this.noComputadorasAulas = noComputadorasAulas;
    }

    public Short getNoImpresorasAulas() {
        return noImpresorasAulas;
    }

    public void setNoImpresorasAulas(Short noImpresorasAulas) {
        this.noImpresorasAulas = noImpresorasAulas;
    }

    public Short getNoComputadorasDiraccion() {
        return noComputadorasDiraccion;
    }

    public void setNoComputadorasDiraccion(Short noComputadorasDiraccion) {
        this.noComputadorasDiraccion = noComputadorasDiraccion;
    }

    public Short getNoImpresorasDireccion() {
        return noImpresorasDireccion;
    }

    public void setNoImpresorasDireccion(Short noImpresorasDireccion) {
        this.noImpresorasDireccion = noImpresorasDireccion;
    }

    public Short getNoComputadorasAdmin() {
        return noComputadorasAdmin;
    }

    public void setNoComputadorasAdmin(Short noComputadorasAdmin) {
        this.noComputadorasAdmin = noComputadorasAdmin;
    }

    public Short getNoImpresorasAdmin() {
        return noImpresorasAdmin;
    }

    public void setNoImpresorasAdmin(Short noImpresorasAdmin) {
        this.noImpresorasAdmin = noImpresorasAdmin;
    }

    public String getInternetAulas() {
        return internetAulas;
    }

    public void setInternetAulas(String internetAulas) {
        this.internetAulas = internetAulas;
    }

    public String getInternetDireccionAdmin() {
        return internetDireccionAdmin;
    }

    public void setInternetDireccionAdmin(String internetDireccionAdmin) {
        this.internetDireccionAdmin = internetDireccionAdmin;
    }

    public String getDictamenDro() {
        return dictamenDro;
    }

    public void setDictamenDro(String dictamenDro) {
        this.dictamenDro = dictamenDro;
    }

    public CatEstatusDano getCveEstatusDano() {
        return cveEstatusDano;
    }

    public void setCveEstatusDano(CatEstatusDano cveEstatusDano) {
        this.cveEstatusDano = cveEstatusDano;
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
        if (!(object instanceof DetalleEstructuraPlanteles)) {
            return false;
        }
        DetalleEstructuraPlanteles other = (DetalleEstructuraPlanteles) object;
        if ((this.plantelId == null && other.plantelId != null) || (this.plantelId != null && !this.plantelId.equals(other.plantelId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jsm.proescrec.model.DetalleEstructuraPlanteles[ plantelId=" + plantelId + " ]";
    }
    
}
