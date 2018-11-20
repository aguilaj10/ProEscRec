package com.jsm.proescrec.model;

import com.jsm.proescrec.model.CatAsentamientos;
import com.jsm.proescrec.model.CatEntidades;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-11-20T13:52:21")
@StaticMetamodel(CatMunicipios.class)
public class CatMunicipios_ { 

    public static volatile SingularAttribute<CatMunicipios, String> municipio;
    public static volatile SingularAttribute<CatMunicipios, CatEntidades> cveEntidad;
    public static volatile ListAttribute<CatMunicipios, CatAsentamientos> catAsentamientosList;
    public static volatile SingularAttribute<CatMunicipios, String> cveMunicipio;

}