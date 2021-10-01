package com.oop_java.presupuesto.entidades;

import java.util.Date;

public class gasto {

    private String nombre;
    private String moneda;
    private String categoria;
    private int monto;
    private Date fecha;

    //creo el constructor para poder acceder a clase porque se encuentra en otro paquete
    public gasto(String nombre,String moneda,String categoria,int monto){

        this.nombre = nombre;
        this.moneda = moneda;
        this.categoria = categoria;
        this.monto = monto;
        this.fecha = new Date();
    }

    public String getNombre(){
        return this.nombre;
    }

}
