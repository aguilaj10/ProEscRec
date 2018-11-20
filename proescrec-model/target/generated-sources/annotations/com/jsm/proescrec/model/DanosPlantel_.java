package com.jsm.proescrec.model;

import com.jsm.proescrec.model.Planteles;
import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-11-20T13:52:21")
@StaticMetamodel(DanosPlantel.class)
public class DanosPlantel_ { 

    public static volatile SingularAttribute<DanosPlantel, String> trabajosReparacion;
    public static volatile SingularAttribute<DanosPlantel, BigInteger> montoReparacion;
    public static volatile SingularAttribute<DanosPlantel, String> edificiosColapsados;
    public static volatile SingularAttribute<DanosPlantel, BigInteger> montoConclusion;
    public static volatile SingularAttribute<DanosPlantel, String> murosFisurados;
    public static volatile SingularAttribute<DanosPlantel, String> edificiosInclinados;
    public static volatile SingularAttribute<DanosPlantel, String> desprendiemiento;
    public static volatile SingularAttribute<DanosPlantel, String> tuberiaSanitaria;
    public static volatile SingularAttribute<DanosPlantel, String> cisternaFisurada;
    public static volatile SingularAttribute<DanosPlantel, Date> fechaConclusion;
    public static volatile SingularAttribute<DanosPlantel, String> motivoSuspension;
    public static volatile SingularAttribute<DanosPlantel, Planteles> planteles;
    public static volatile SingularAttribute<DanosPlantel, BigInteger> avanceAprox;
    public static volatile SingularAttribute<DanosPlantel, Date> fechaInicio;
    public static volatile SingularAttribute<DanosPlantel, String> columnasDanadas;
    public static volatile SingularAttribute<DanosPlantel, String> pisosFracturados;
    public static volatile SingularAttribute<DanosPlantel, String> observaciones;
    public static volatile SingularAttribute<DanosPlantel, String> tuberiaHidraulica;
    public static volatile SingularAttribute<DanosPlantel, String> pisosDanados;
    public static volatile SingularAttribute<DanosPlantel, Date> fechaSuspension;
    public static volatile SingularAttribute<DanosPlantel, String> bardasDanadas;
    public static volatile SingularAttribute<DanosPlantel, String> tuberiaElectrica;
    public static volatile SingularAttribute<DanosPlantel, Integer> plantelId;
    public static volatile SingularAttribute<DanosPlantel, String> reparacionTotal;

}