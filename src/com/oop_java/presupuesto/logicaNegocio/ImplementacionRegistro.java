package com.oop_java.presupuesto.logicaNegocio;

import com.oop_java.presupuesto.entidades.Gasto;
import com.oop_java.presupuesto.entidades.Ingreso;
import com.oop_java.presupuesto.entidades.Movimiento;
import com.oop_java.presupuesto.repo.ErrorMuyPocaData;
import com.oop_java.presupuesto.repo.InterfaceRepository;

import java.text.Normalizer;

import java.util.ArrayList;
import java.util.List;

public class ImplementacionRegistro implements InterfaceRegistro {
    private InterfaceRepository repository;


    public ImplementacionRegistro(InterfaceRepository repository){

        this.repository = repository;
    }

    //metodo 2
    public boolean addIngreso(String nombre, String moneda, String categoria, String montoStr, String periodicidad) throws ErrorMuyPocaData {

        int monto;
        try {
            monto = Integer.parseInt(montoStr);
        }catch (NumberFormatException ex){
            throw new FormatoInvalido(montoStr, ex.getMessage());
        }
        Ingreso ingreso = new Ingreso(nombre,
                moneda,
                categoria,
                monto,
                periodicidad);
        return this.repository.save(ingreso.getDetails());
    }

    @Override
    public boolean addGasto(String nombre, String moneda, String categoria, String montoStr) throws ErrorMuyPocaData {

        int monto;
        try {
            monto = Integer.parseInt(montoStr);
        }catch (NumberFormatException ex){
            System.out.println("Formato Invalido en ("+montoStr+"): " + ex.getMessage());
            return false;
        }
        Movimiento gasto = new Gasto(nombre,
                moneda,
                categoria,
                monto);
        return this.repository.save(gasto.getDetails());
    }

    @Override
    public void getMovimientos() {
        this.repository.read();
    }

    public void getGastos() {
        this.repository.read();
    }
}