package com.jsm.proescrec.model;

import com.jsm.proescrec.model.CatMunicipios;
import com.jsm.proescrec.model.Planteles;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-11-20T13:52:22")
@StaticMetamodel(CatAsentamientos.class)
public class CatAsentamientos_ { 

    public static volatile SingularAttribute<CatAsentamientos, String> cveAsentamiento;
    public static volatile SingularAttribute<CatAsentamientos, String> asentamiento;
    public static volatile SingularAttribute<CatAsentamientos, String> codigoPostal;
    public static volatile ListAttribute<CatAsentamientos, Planteles> plantelesList;
    public static volatile SingularAttribute<CatAsentamientos, String> tipoAsentamiento;
    public static volatile SingularAttribute<CatAsentamientos, CatMunicipios> cveMunicipio;

}