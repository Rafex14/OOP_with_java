package com.oop_java.presupuesto.entidades;

import java.util.Date;

public class Gasto extends Movimiento{

    //creo el constructor para poder acceder a clase porque se encuentra en otro paquete
    public Gasto(String nombre, String moneda, String categoria, int monto){


        super(nombre,moneda,categoria,monto);
    }

    @Override
    public String getDetails() {
        return "GASTO: " + this.getNombre() + " - " +
                this.getMoneda() + " - " +
                this.getCategoria() + " - " +
                this.getMonto();
    }
}
