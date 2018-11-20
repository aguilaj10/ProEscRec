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
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jonthansanchez
 */
@Entity
@Table(name = "roles_usuarios")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RolesUsuarios.findAll", query = "SELECT r FROM RolesUsuarios r")})
public class RolesUsuarios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @SequenceGenerator(allocationSize = 1, name = "SEQ_ROL_USUARIO", sequenceName = "roles_usuarios_rol_usuario_id_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "roles_usuarios_rol_usuario_id_seq")
    @Basic(optional = false)
    @Column(name = "rol_usuario_id")
    private Integer rolUsuarioId;
    @Column(name = "usuario_id")
    private Integer usuarioId;
    @JoinColumn(name = "rol_id", referencedColumnName = "rol_id")
    @ManyToOne
    private Roles rolId;
    @JoinColumn(name = "rol_usuario_id", referencedColumnName = "usuario_id", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Usuarios usuarios;

    public RolesUsuarios() {
    }

    public RolesUsuarios(Integer rolUsuarioId) {
        this.rolUsuarioId = rolUsuarioId;
    }

    public Integer getRolUsuarioId() {
        return rolUsuarioId;
    }

    public void setRolUsuarioId(Integer rolUsuarioId) {
        this.rolUsuarioId = rolUsuarioId;
    }

    public Integer getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Integer usuarioId) {
        this.usuarioId = usuarioId;
    }

    public Roles getRolId() {
        return rolId;
    }

    public void setRolId(Roles rolId) {
        this.rolId = rolId;
    }

    public Usuarios getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Usuarios usuarios) {
        this.usuarios = usuarios;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rolUsuarioId != null ? rolUsuarioId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RolesUsuarios)) {
            return false;
        }
        RolesUsuarios other = (RolesUsuarios) object;
        return !((this.rolUsuarioId == null && other.rolUsuarioId != null) || (this.rolUsuarioId != null && !this.rolUsuarioId.equals(other.rolUsuarioId)));
    }

    @Override
    public String toString() {
        return "com.jsm.proescrec.model.RolesUsuarios[ rolUsuarioId=" + rolUsuarioId + " ]";
    }
    
}
