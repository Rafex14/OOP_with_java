package com.oop_java.presupuesto.repo;

import java.util.List;

public interface InterfaceRepository {

    boolean save (String text) throws ErrorMuyPocaData;

    List<String> read ();
}
