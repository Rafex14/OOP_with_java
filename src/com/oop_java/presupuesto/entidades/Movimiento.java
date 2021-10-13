package com.oop_java.presupuesto.entidades;

import java.util.Date;

public abstract class Movimiento {

    private String nombre;
    private String moneda;
    private String categoria;
    private int monto;
    private Date fecha;

    //creo el constructor para poder acceder a clase porque se encuentra en otro paquete
    public Movimiento(String nombre, String moneda, String categoria, int monto) {

        this.nombre = nombre;
        this.moneda = moneda;
        this.categoria = categoria;
        this.monto = monto;
        this.fecha = new Date();
    }

    public abstract String getDetails();

    String getNombre(){
        return this.nombre;
    }

    String getMoneda(){
        return moneda;
    }

    String getCategoria(){
        return categoria;
    }

    int getMonto(){
        return monto;
    }

    Date getFecha(){
        return fecha;
    }
}


