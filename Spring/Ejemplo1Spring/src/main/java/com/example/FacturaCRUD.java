package com.example;

public class FacturaCRUD {

    CalculatorService calculator1;
    String nombre;

    public FacturaCRUD(CalculatorService calculator1, String nombre) {
        this.calculator1 = calculator1;
        this.nombre = nombre;
        System.out.println("Estoy en FacturaCRUD");
    }
}
