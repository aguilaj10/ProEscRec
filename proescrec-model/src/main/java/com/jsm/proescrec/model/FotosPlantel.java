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
import javax.persistence.Lob;
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
@Table(name = "fotos_plantel")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FotosPlantel.findAll", query = "SELECT f FROM FotosPlantel f")})
public class FotosPlantel implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @SequenceGenerator(allocationSize = 1, name = "SEQ_FOTO_PLANTEL", sequenceName = "fotos_plantel_foto_plantel_id_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_FOTO_PLANTEL")
    @Basic(optional = false)
    @Column(name = "foto_plantel_id")
    private Integer fotoPlantelId;
    @Lob
    @Column(name = "foto")
    private byte[] foto;
    @JoinColumn(name = "plantel_id", referencedColumnName = "plantel_id")
    @ManyToOne
    private Planteles plantelId;

    public FotosPlantel() {
    }

    public FotosPlantel(Integer fotoPlantelId) {
        this.fotoPlantelId = fotoPlantelId;
    }

    public Integer getFotoPlantelId() {
        return fotoPlantelId;
    }

    public void setFotoPlantelId(Integer fotoPlantelId) {
        this.fotoPlantelId = fotoPlantelId;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
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
        hash += (fotoPlantelId != null ? fotoPlantelId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FotosPlantel)) {
            return false;
        }
        FotosPlantel other = (FotosPlantel) object;
        return !((this.fotoPlantelId == null && other.fotoPlantelId != null) || (this.fotoPlantelId != null && !this.fotoPlantelId.equals(other.fotoPlantelId)));
    }

    @Override
    public String toString() {
        return "com.jsm.proescrec.model.FotosPlantel[ fotoPlantelId=" + fotoPlantelId + " ]";
    }
    
}
