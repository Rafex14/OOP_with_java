package com.oop_java.presupuesto;

import com.oop_java.presupuesto.entidades.gasto;
import com.oop_java.presupuesto.entidades.registroGasto;
import com.sun.source.tree.WhileLoopTree;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    //este es el metodo de Main
    public static void main(String[] args) {

        System.out.println("Sistema Reistro de Gastos");
        Scanner consola = new Scanner(System.in);

        boolean siga =true;
        //Aca se esta creando otro objeto de tipo lista y se le estan agregando valores
        registroGasto registro = new registroGasto();

        while (siga) {

            System.out.println("Digite el nombre de su gasto:");
            String nombre = consola.nextLine();

            System.out.println("Digite la moneda de su gasto:");
            String moneda = consola.nextLine();

            System.out.println("Digite la categoria de su gasto:");
            String categoria = consola.nextLine();

            System.out.println("Digite el monto de su gasto:");
            String montoStr = consola.nextLine();
            int monto = Integer.parseInt(montoStr);

            //Creando objetos
            gasto nuevoGasto = new gasto(nombre, moneda, categoria, monto);

            //Daba error porque no estaba asignado en memoria por lo que se procede a agregar un valor al array
            registro.addGastos(nuevoGasto);

        /*for(int i=0; i<registro.getGastos().size(); i++){

            System.out.println(registro.getGastos().get(i).getNombre());
        }*/

            //System.out.println(nuevoGasto.nombre + " ->" + nuevoGasto.monto);
            //System.out.println(gastoInternet.nombre + " ->" + gastoInternet.monto);

            for (gasto gastico : registro.getGastos()) {
                System.out.println(gastico.getNombre());
            }

            System.out.println("Quiere seguir? (`S`)");
            siga = consola.nextLine().equals("S");
        }
    }
}


//ORIENTACION A OBJETOS OOP


//CONSTRUCTOR es como un metodo el cual tiene el mismo nombre de la clase