package com.oop_java.presupuesto.entidades;

import java.util.ArrayList;
import java.util.List;

public class registroGasto{

    List <gasto> gastos;
    //constructor y no retorna nada
    public registroGasto(){
        this.gastos = new ArrayList<>();

    }
    //Los metodos comienzan con minusculas
    //metodo 1
    public List<gasto> getGastos(){
        return this.gastos;
    }
    //metodo 2
    public void addGastos(gasto item){
        this.gastos.add(item);
    }
}
