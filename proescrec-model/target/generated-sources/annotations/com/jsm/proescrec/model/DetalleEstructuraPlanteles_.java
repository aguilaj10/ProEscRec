package com.jsm.proescrec.model;

import com.jsm.proescrec.model.CatEstatusDano;
import com.jsm.proescrec.model.Planteles;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-11-20T13:52:22")
@StaticMetamodel(DetalleEstructuraPlanteles.class)
public class DetalleEstructuraPlanteles_ { 

    public static volatile SingularAttribute<DetalleEstructuraPlanteles, Short> noAulasDidacticas;
    public static volatile SingularAttribute<DetalleEstructuraPlanteles, String> dictamenDro;
    public static volatile SingularAttribute<DetalleEstructuraPlanteles, CatEstatusDano> cveEstatusDano;
    public static volatile SingularAttribute<DetalleEstructuraPlanteles, Short> noComputadorasDiraccion;
    public static volatile SingularAttribute<DetalleEstructuraPlanteles, Short> noImpresorasDireccion;
    public static volatile SingularAttribute<DetalleEstructuraPlanteles, Short> noComputadorasAulas;
    public static volatile SingularAttribute<DetalleEstructuraPlanteles, Short> noSanitariosNinos;
    public static volatile SingularAttribute<DetalleEstructuraPlanteles, Short> noTalleres;
    public static volatile SingularAttribute<DetalleEstructuraPlanteles, Short> noComputadorasAdmin;
    public static volatile SingularAttribute<DetalleEstructuraPlanteles, String> internetDireccionAdmin;
    public static volatile SingularAttribute<DetalleEstructuraPlanteles, String> internetAulas;
    public static volatile SingularAttribute<DetalleEstructuraPlanteles, Planteles> planteles;
    public static volatile SingularAttribute<DetalleEstructuraPlanteles, Short> noAulasComputo;
    public static volatile SingularAttribute<DetalleEstructuraPlanteles, Short> noImpresorasAdmin;
    public static volatile SingularAttribute<DetalleEstructuraPlanteles, Short> noSanitariosNinas;
    public static volatile SingularAttribute<DetalleEstructuraPlanteles, Short> noImpresorasAulas;
    public static volatile SingularAttribute<DetalleEstructuraPlanteles, Integer> plantelId;

}