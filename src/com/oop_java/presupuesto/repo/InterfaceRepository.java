package com.oop_java.presupuesto.repo;


public interface InterfaceRepository {

    boolean save (String text) throws ErrorMuyPocaData;

    void read ();
}
