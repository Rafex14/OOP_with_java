package com.oop_java.presupuesto.entidades;

import java.util.Date;

public class Ingreso extends Movimiento {



    private String periodicidad;

    public Ingreso(){}

    //creo el constructor para poder acceder a clase porque se encuentra en otro paquete
    public Ingreso(String nombre, String moneda, String categoria, int monto, String periodicidad) {

        super(nombre, moneda, categoria, monto);
        this.periodicidad = periodicidad;
    }

    @Override
    public String getDetails() {
        return "INGRESO: " + this.getNombre() + " - " +
                this.getMoneda() + " - " +
                this.getCategoria() + " - " +
                this.getMonto() + " - " +
                this.periodicidad;
    }
}
