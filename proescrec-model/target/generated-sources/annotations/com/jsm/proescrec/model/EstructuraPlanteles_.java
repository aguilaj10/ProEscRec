package com.jsm.proescrec.model;

import com.jsm.proescrec.model.CatTipoEstructura;
import com.jsm.proescrec.model.Planteles;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-11-20T13:52:21")
@StaticMetamodel(EstructuraPlanteles.class)
public class EstructuraPlanteles_ { 

    public static volatile SingularAttribute<EstructuraPlanteles, Integer> edificios1Nivel;
    public static volatile SingularAttribute<EstructuraPlanteles, Integer> estructuraPlantelId;
    public static volatile SingularAttribute<EstructuraPlanteles, Integer> edificios2Niveles;
    public static volatile SingularAttribute<EstructuraPlanteles, Integer> edificios3Niveles;
    public static volatile SingularAttribute<EstructuraPlanteles, CatTipoEstructura> cveTipoEstructura;
    public static volatile SingularAttribute<EstructuraPlanteles, Planteles> plantelId;

}