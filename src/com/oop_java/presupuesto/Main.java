package com.oop_java.presupuesto;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        System.out.println("Mi nuevo Main");

        //Creando objetos
        gasto gastoLuz = new gasto();
        gastoLuz.nombre = "Luz";
        gastoLuz.moneda ="Colones";
        gastoLuz.monto = 22000;

        gasto gastoInternet = new gasto();
        gastoInternet.nombre = "Internet";
        gastoInternet.moneda ="Colones";
        gastoInternet.monto = 30000;

        //Aca se esta creando otro objeto de tipo lista y se le estan agregando valores
        registroGasto registro = new registroGasto();
        //Daba error porque no estaba asignado en memoria por lo que se procede a agregar un valor al array
        registro.gastos = new ArrayList<>();
        registro.gastos.add(gastoLuz);
        registro.gastos.add(gastoInternet);


        for(int i=0; i<registro.gastos.size(); i++){

            System.out.println(registro.gastos.get(i).nombre);
        }

        System.out.println(gastoLuz.nombre + " ->" + gastoLuz.monto);
        System.out.println(gastoInternet.nombre + " ->" + gastoInternet.monto);

    }
}
