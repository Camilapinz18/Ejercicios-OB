package com.example;

import org.springframework.stereotype.Component;

@Component
public class FacturaCRUD {

    CalculatorService calculator1;


    public FacturaCRUD(CalculatorService calculator1) {
        this.calculator1 = calculator1;

        System.out.println("Estoy en FacturaCRUD");
    }
}
