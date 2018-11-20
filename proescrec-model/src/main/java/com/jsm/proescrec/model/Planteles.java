/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsm.proescrec.model;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author jonthansanchez
 */
@Entity
@Table(name = "planteles")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Planteles.findAll", query = "SELECT p FROM Planteles p")})
public class Planteles implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @SequenceGenerator(allocationSize = 1, name = "SEQ_PLANTEL", sequenceName = "planteles_plantel_id_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_PLANTEL")
    @Basic(optional = false)
    @Column(name = "plantel_id")
    private Integer plantelId;
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "clave_matutino")
    private String claveMatutino;
    @Basic(optional = false)
    @Column(name = "clave_vespertino")
    private String claveVespertino;
    @Basic(optional = false)
    @Column(name = "nombre_director")
    private String nombreDirector;
    @Basic(optional = false)
    @Column(name = "telefono")
    private String telefono;
    @Basic(optional = false)
    @Column(name = "celular_director")
    private String celularDirector;
    @Basic(optional = false)
    @Column(name = "clave_nocturno")
    private String claveNocturno;
    @Basic(optional = false)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @Column(name = "whatsapp")
    private String whatsapp;
    @Column(name = "domicilio")
    private String domicilio;
    @Basic(optional = false)
    @Column(name = "superficie_aprox_terreno")
    private BigInteger superficieAproxTerreno;
    @Basic(optional = false)
    @Column(name = "superficie_aprox_contacto")
    private BigInteger superficieAproxContacto;
    @Basic(optional = false)
    @Column(name = "superficie_aprox_construido")
    private BigInteger superficieAproxConstruido;
    @Basic(optional = false)
    @Column(name = "superficie_aprox_libres")
    private BigInteger superficieAproxLibres;
    @Basic(optional = false)
    @Column(name = "observaciones")
    private String observaciones;
    @OneToMany(mappedBy = "plantelId")
    private List<EstructuraPlanteles> estructuraPlantelesList;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "planteles")
    private DanosPlantel danosPlantel;
    @OneToMany(mappedBy = "plantelId")
    private List<FotosPlantel> fotosPlantelList;
    @JoinColumn(name = "cve_asentamiento", referencedColumnName = "cve_asentamiento")
    @ManyToOne
    private CatAsentamientos cveAsentamiento;
    @JoinColumn(name = "usuario_id", referencedColumnName = "usuario_id")
    @ManyToOne
    private Usuarios usuarioId;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "planteles")
    private EstadisticasPlanteles estadisticasPlanteles;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "planteles")
    private DetalleEstructuraPlanteles detalleEstructuraPlanteles;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "planteles")
    private EstatusFinanciero estatusFinanciero;

    public Planteles() {
    }

    public Planteles(Integer plantelId) {
        this.plantelId = plantelId;
    }

    public Planteles(Integer plantelId, String claveMatutino, String claveVespertino, String nombreDirector, String telefono, String celularDirector, String claveNocturno, String email, String whatsapp, BigInteger superficieAproxTerreno, BigInteger superficieAproxContacto, BigInteger superficieAproxConstruido, BigInteger superficieAproxLibres, String observaciones) {
        this.plantelId = plantelId;
        this.claveMatutino = claveMatutino;
        this.claveVespertino = claveVespertino;
        this.nombreDirector = nombreDirector;
        this.telefono = telefono;
        this.celularDirector = celularDirector;
        this.claveNocturno = claveNocturno;
        this.email = email;
        this.whatsapp = whatsapp;
        this.superficieAproxTerreno = superficieAproxTerreno;
        this.superficieAproxContacto = superficieAproxContacto;
        this.superficieAproxConstruido = superficieAproxConstruido;
        this.superficieAproxLibres = superficieAproxLibres;
        this.observaciones = observaciones;
    }

    public Integer getPlantelId() {
        return plantelId;
    }

    public void setPlantelId(Integer plantelId) {
        this.plantelId = plantelId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClaveMatutino() {
        return claveMatutino;
    }

    public void setClaveMatutino(String claveMatutino) {
        this.claveMatutino = claveMatutino;
    }

    public String getClaveVespertino() {
        return claveVespertino;
    }

    public void setClaveVespertino(String claveVespertino) {
        this.claveVespertino = claveVespertino;
    }

    public String getNombreDirector() {
        return nombreDirector;
    }

    public void setNombreDirector(String nombreDirector) {
        this.nombreDirector = nombreDirector;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCelularDirector() {
        return celularDirector;
    }

    public void setCelularDirector(String celularDirector) {
        this.celularDirector = celularDirector;
    }

    public String getClaveNocturno() {
        return claveNocturno;
    }

    public void setClaveNocturno(String claveNocturno) {
        this.claveNocturno = claveNocturno;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWhatsapp() {
        return whatsapp;
    }

    public void setWhatsapp(String whatsapp) {
        this.whatsapp = whatsapp;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public BigInteger getSuperficieAproxTerreno() {
        return superficieAproxTerreno;
    }

    public void setSuperficieAproxTerreno(BigInteger superficieAproxTerreno) {
        this.superficieAproxTerreno = superficieAproxTerreno;
    }

    public BigInteger getSuperficieAproxContacto() {
        return superficieAproxContacto;
    }

    public void setSuperficieAproxContacto(BigInteger superficieAproxContacto) {
        this.superficieAproxContacto = superficieAproxContacto;
    }

    public BigInteger getSuperficieAproxConstruido() {
        return superficieAproxConstruido;
    }

    public void setSuperficieAproxConstruido(BigInteger superficieAproxConstruido) {
        this.superficieAproxConstruido = superficieAproxConstruido;
    }

    public BigInteger getSuperficieAproxLibres() {
        return superficieAproxLibres;
    }

    public void setSuperficieAproxLibres(BigInteger superficieAproxLibres) {
        this.superficieAproxLibres = superficieAproxLibres;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    @XmlTransient
    public List<EstructuraPlanteles> getEstructuraPlantelesList() {
        return estructuraPlantelesList;
    }

    public void setEstructuraPlantelesList(List<EstructuraPlanteles> estructuraPlantelesList) {
        this.estructuraPlantelesList = estructuraPlantelesList;
    }

    public DanosPlantel getDanosPlantel() {
        return danosPlantel;
    }

    public void setDanosPlantel(DanosPlantel danosPlantel) {
        this.danosPlantel = danosPlantel;
    }

    @XmlTransient
    public List<FotosPlantel> getFotosPlantelList() {
        return fotosPlantelList;
    }

    public void setFotosPlantelList(List<FotosPlantel> fotosPlantelList) {
        this.fotosPlantelList = fotosPlantelList;
    }

    public CatAsentamientos getCveAsentamiento() {
        return cveAsentamiento;
    }

    public void setCveAsentamiento(CatAsentamientos cveAsentamiento) {
        this.cveAsentamiento = cveAsentamiento;
    }

    public Usuarios getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Usuarios usuarioId) {
        this.usuarioId = usuarioId;
    }

    public EstadisticasPlanteles getEstadisticasPlanteles() {
        return estadisticasPlanteles;
    }

    public void setEstadisticasPlanteles(EstadisticasPlanteles estadisticasPlanteles) {
        this.estadisticasPlanteles = estadisticasPlanteles;
    }

    public DetalleEstructuraPlanteles getDetalleEstructuraPlanteles() {
        return detalleEstructuraPlanteles;
    }

    public void setDetalleEstructuraPlanteles(DetalleEstructuraPlanteles detalleEstructuraPlanteles) {
        this.detalleEstructuraPlanteles = detalleEstructuraPlanteles;
    }

    public EstatusFinanciero getEstatusFinanciero() {
        return estatusFinanciero;
    }

    public void setEstatusFinanciero(EstatusFinanciero estatusFinanciero) {
        this.estatusFinanciero = estatusFinanciero;
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
        if (!(object instanceof Planteles)) {
            return false;
        }
        Planteles other = (Planteles) object;
        if ((this.plantelId == null && other.plantelId != null) || (this.plantelId != null && !this.plantelId.equals(other.plantelId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jsm.proescrec.model.Planteles[ plantelId=" + plantelId + " ]";
    }
    
}
