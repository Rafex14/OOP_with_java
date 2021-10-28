package com.oop_java.presupuesto.logicaNegocio;

import com.oop_java.presupuesto.repo.ErrorMuyPocaData;

public interface InterfaceRegistro {


    boolean addIngreso(String nombre, String moneda, String categoria, String montoStr, String periodicidad) throws ErrorMuyPocaData;;

    boolean addGasto(String nombre, String moneda, String categoria, String montoStr) throws ErrorMuyPocaData;;


}
