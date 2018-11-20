package com.jsm.proescrec.model;

import com.jsm.proescrec.model.CatAsentamientos;
import com.jsm.proescrec.model.DanosPlantel;
import com.jsm.proescrec.model.DetalleEstructuraPlanteles;
import com.jsm.proescrec.model.EstadisticasPlanteles;
import com.jsm.proescrec.model.EstatusFinanciero;
import com.jsm.proescrec.model.EstructuraPlanteles;
import com.jsm.proescrec.model.FotosPlantel;
import com.jsm.proescrec.model.Usuarios;
import java.math.BigInteger;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-11-20T13:52:21")
@StaticMetamodel(Planteles.class)
public class Planteles_ { 

    public static volatile SingularAttribute<Planteles, String> whatsapp;
    public static volatile SingularAttribute<Planteles, String> claveNocturno;
    public static volatile SingularAttribute<Planteles, CatAsentamientos> cveAsentamiento;
    public static volatile SingularAttribute<Planteles, String> celularDirector;
    public static volatile ListAttribute<Planteles, EstructuraPlanteles> estructuraPlantelesList;
    public static volatile ListAttribute<Planteles, FotosPlantel> fotosPlantelList;
    public static volatile SingularAttribute<Planteles, String> claveVespertino;
    public static volatile SingularAttribute<Planteles, BigInteger> superficieAproxLibres;
    public static volatile SingularAttribute<Planteles, BigInteger> superficieAproxConstruido;
    public static volatile SingularAttribute<Planteles, DanosPlantel> danosPlantel;
    public static volatile SingularAttribute<Planteles, String> nombre;
    public static volatile SingularAttribute<Planteles, Usuarios> usuarioId;
    public static volatile SingularAttribute<Planteles, String> nombreDirector;
    public static volatile SingularAttribute<Planteles, EstatusFinanciero> estatusFinanciero;
    public static volatile SingularAttribute<Planteles, EstadisticasPlanteles> estadisticasPlanteles;
    public static volatile SingularAttribute<Planteles, DetalleEstructuraPlanteles> detalleEstructuraPlanteles;
    public static volatile SingularAttribute<Planteles, String> domicilio;
    public static volatile SingularAttribute<Planteles, String> observaciones;
    public static volatile SingularAttribute<Planteles, String> telefono;
    public static volatile SingularAttribute<Planteles, String> claveMatutino;
    public static volatile SingularAttribute<Planteles, BigInteger> superficieAproxContacto;
    public static volatile SingularAttribute<Planteles, String> email;
    public static volatile SingularAttribute<Planteles, Integer> plantelId;
    public static volatile SingularAttribute<Planteles, BigInteger> superficieAproxTerreno;

}