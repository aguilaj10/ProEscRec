package com.jsm.proescrec.model;

import com.jsm.proescrec.model.RolesUsuarios;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-11-20T13:52:21")
@StaticMetamodel(Roles.class)
public class Roles_ { 

    public static volatile SingularAttribute<Roles, Integer> rolId;
    public static volatile SingularAttribute<Roles, String> rol;
    public static volatile SingularAttribute<Roles, Boolean> activo;
    public static volatile ListAttribute<Roles, RolesUsuarios> rolesUsuariosList;

}