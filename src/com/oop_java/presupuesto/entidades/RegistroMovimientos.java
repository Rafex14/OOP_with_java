package com.oop_java.presupuesto.entidades;

import java.util.ArrayList;
import java.util.List;

public class RegistroMovimientos {

    List <Movimiento> movimientos;
    //constructor y no retorna nada
    public RegistroMovimientos(){
        this.movimientos = new ArrayList<>();

    }
    //Los metodos comienzan con minusculas
    //metodo 1
    public List<Movimiento> getMovimientos(){
        return this.movimientos;
    }
    //metodo 2
    public void addMovimientos(Movimiento item){
        this.movimientos.add(item);
    }
}
