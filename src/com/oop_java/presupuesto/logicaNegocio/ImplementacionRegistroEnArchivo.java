package com.oop_java.presupuesto.logicaNegocio;

import com.oop_java.presupuesto.entidades.Gasto;
import com.oop_java.presupuesto.entidades.Ingreso;
import com.oop_java.presupuesto.entidades.Movimiento;
import com.oop_java.presupuesto.repo.InterfaceRepository;

public class ImplementacionRegistroEnArchivo implements InterfaceRegistro {

    private InterfaceRepository repository;

    public ImplementacionRegistroEnArchivo(InterfaceRepository repository){

        this.repository = repository;
    }


    @Override
    public boolean addIngreso(String nombre, String moneda, String categoria, String montoStr, String periodicidad) {
        int monto = Integer.parseInt(montoStr);
        Ingreso ingreso = new Ingreso(nombre,
                moneda,
                categoria,
                monto,
                periodicidad);
        return this.repository.save(ingreso.getDetails());
    }

    @Override
    public boolean addGasto(String nombre, String moneda, String categoria, String montoStr) {
        int monto = Integer.parseInt(montoStr);
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

    @Override
    public void getGastos() {
        this.repository.read();
    }
}