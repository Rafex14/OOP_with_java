package com.oop_java.presupuesto;

import com.oop_java.presupuesto.logicaNegocio.ImplementacionRegistro;
import com.oop_java.presupuesto.repo.InMemoryRepository;
import com.oop_java.presupuesto.ui.FrontEnd;

public class Main {
    //este es el metodo de Main
    public static void main(String[] args) {

        System.out.println("Sistema Reistro de Movimientos");

        FrontEnd fe = new FrontEnd("Sistema Registro de Movimientos");
        fe.build();
    }
    }



//ORIENTACION A OBJETOS OOP


//CONSTRUCTOR es como un metodo el cual tiene el mismo nombre de la clase