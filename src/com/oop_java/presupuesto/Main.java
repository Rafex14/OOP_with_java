package com.oop_java.presupuesto;

import com.oop_java.presupuesto.logicaNegocio.ImplementacionRegistro;
import com.oop_java.presupuesto.logicaNegocio.ImplementacionSuperDummy;
import com.oop_java.presupuesto.logicaNegocio.InterfaceRegistro;

import java.util.Scanner;

public class Main {
    //este es el metodo de Main
    public static void main(String[] args) {

        System.out.println("Sistema Reistro de Movimientos");
        Scanner consola = new Scanner(System.in);

        boolean siga =true;


        System.out.println("Que quiere usar? Fake? (F):");
        InterfaceRegistro registo;
        if (consola.nextLine().equals("F")) {
            registo = new ImplementacionSuperDummy();
        }else {
            registo = new ImplementacionRegistro();
        }



        while (siga) {

            System.out.println("Digite el nombre de su Movimiento:");
            String nombre = consola.nextLine();

            System.out.println("Digite la moneda de su Movimiento:");
            String moneda = consola.nextLine();

            System.out.println("Digite la categoria de su Movimiento:");
            String categoria = consola.nextLine();

            System.out.println("Digite el monto de su Movimiento:");
            String montoStr = consola.nextLine();


            System.out.println("Indique si es un Gasto (S)");

            if(consola.nextLine().equals("S")){

                registo.addGasto(nombre,
                        moneda,
                        categoria,
                        montoStr);
            }else{

                System.out.println("Especifique la periocidad");
                String periodicidad = consola.nextLine();

                registo.addIngreso(nombre,
                        moneda,
                        categoria,
                        montoStr,
                        periodicidad);
            }


            System.out.println("Todos los movientos:");

            registo.getMovimientos();

            System.out.println("Solo Gastos:");

            registo.getGastos();

            System.out.println("Quiere seguir? (`S`)");
            siga = consola.nextLine().equals("S");
        }
    }
}


//ORIENTACION A OBJETOS OOP


//CONSTRUCTOR es como un metodo el cual tiene el mismo nombre de la clase