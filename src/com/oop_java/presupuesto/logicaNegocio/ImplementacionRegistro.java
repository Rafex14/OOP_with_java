package com.oop_java.presupuesto.logicaNegocio;

import com.oop_java.presupuesto.entidades.Gasto;
import com.oop_java.presupuesto.entidades.Ingreso;
import com.oop_java.presupuesto.entidades.Movimiento;

import java.util.ArrayList;
import java.util.List;

public class ImplementacionRegistro implements InterfaceRegistro {

    List<Movimiento> movimientos;

    //constructor y no retorna nada
    public ImplementacionRegistro() {
        this.movimientos = new ArrayList<>();

    }

    //Los metodos comienzan con minusculas
    //metodo 1
    public void getMovimientos() {
        for (Movimiento movimientos : movimientos) {
            System.out.println(movimientos.getNombre());
        }
    }

    //metodo 2
    public void addIngreso(String nombre, String moneda, String categoria,String montoStr, String periodicidad){

        if(!moneda.equals("USD")){
            System.out.println("Moneda no valida");
        }else {
            int monto = Integer.parseInt(montoStr);
            this.movimientos.add(new Ingreso(nombre,
                    moneda,
                    categoria,
                    monto,
                    periodicidad));
        }
    }

    @Override
    public void addGasto(String nombre, String moneda, String categoria, String montoStr) {
        int monto = Integer.parseInt(montoStr);
        this.movimientos.add(new Gasto(nombre,
                moneda,
                categoria,
                monto));
    }

    //Metodo 3
    public void getGastos() {
        for (Movimiento movimiento : this.movimientos) {
            if (movimiento instanceof Gasto) {
                System.out.println(movimiento.getNombre());

            }
        }
    }
}