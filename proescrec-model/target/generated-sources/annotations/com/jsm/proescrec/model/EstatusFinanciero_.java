package com.jsm.proescrec.model;

import com.jsm.proescrec.model.Planteles;
import java.math.BigInteger;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-11-20T13:52:21")
@StaticMetamodel(EstatusFinanciero.class)
public class EstatusFinanciero_ { 

    public static volatile SingularAttribute<EstatusFinanciero, Planteles> planteles;
    public static volatile SingularAttribute<EstatusFinanciero, BigInteger> montoDevengado;
    public static volatile SingularAttribute<EstatusFinanciero, String> recursoSuficiente;
    public static volatile SingularAttribute<EstatusFinanciero, BigInteger> seguroInmueble;
    public static volatile SingularAttribute<EstatusFinanciero, BigInteger> recursoFonden;
    public static volatile SingularAttribute<EstatusFinanciero, BigInteger> montoReparacionPlantel;
    public static volatile SingularAttribute<EstatusFinanciero, Integer> plantelId;
    public static volatile SingularAttribute<EstatusFinanciero, BigInteger> recursoEscuelas100;

}