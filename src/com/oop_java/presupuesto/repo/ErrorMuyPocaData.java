package com.oop_java.presupuesto.repo;

public class ErrorMuyPocaData extends Exception{

    public ErrorMuyPocaData(String error){
        super("Este elemento a guardar es muy pequeño: " + error);
    }
}
