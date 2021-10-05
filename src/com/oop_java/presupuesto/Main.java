package com.oop_java.presupuesto;

import com.oop_java.presupuesto.entidades.Gasto;
import com.oop_java.presupuesto.entidades.Ingreso;
import com.oop_java.presupuesto.entidades.Movimiento;
import com.oop_java.presupuesto.entidades.RegistroMovimientos;

import java.util.Scanner;

public class Main {
    //este es el metodo de Main
    public static void main(String[] args) {

        System.out.println("Sistema Reistro de Movimientos");
        Scanner consola = new Scanner(System.in);

        boolean siga =true;
        //Aca se esta creando otro objeto de tipo lista y se le estan agregando valores
        RegistroMovimientos registro = new RegistroMovimientos();

        while (siga) {

            System.out.println("Digite el nombre de su Movimiento:");
            String nombre = consola.nextLine();

            System.out.println("Digite la moneda de su Movimiento:");
            String moneda = consola.nextLine();

            System.out.println("Digite la categoria de su Movimiento:");
            String categoria = consola.nextLine();

            System.out.println("Digite el monto de su Movimiento:");
            String montoStr = consola.nextLine();
            int monto = Integer.parseInt(montoStr);


            Movimiento nuevoMovimiento;

            System.out.println("Indique si es un Gasto (S)");

            if(consola.nextLine().equals("S")){

                nuevoMovimiento = new Gasto(nombre,
                        moneda,
                        categoria,
                        monto);
            }else{

                System.out.println("Especifique la periocidad");
                String periodicidad = consola.nextLine();

                nuevoMovimiento= new Ingreso(nombre,
                        moneda,
                        categoria,
                        monto,
                        periodicidad);
            }

            //Creando objetos
           // Gasto nuevoGasto = new Gasto(nombre, moneda, categoria, monto);

            //Daba error porque no estaba asignado en memoria por lo que se procede a agregar un valor al array
            registro.addMovimientos(nuevoMovimiento);

            System.out.println("Todos los movientos:");

            for (Movimiento movimientos : registro.getMovimientos()) {
                System.out.println(movimientos.getNombre());
            }

            System.out.println("Quiere seguir? (`S`)");
            siga = consola.nextLine().equals("S");
        }
    }
}


//ORIENTACION A OBJETOS OOP


//CONSTRUCTOR es como un metodo el cual tiene el mismo nombre de la clase