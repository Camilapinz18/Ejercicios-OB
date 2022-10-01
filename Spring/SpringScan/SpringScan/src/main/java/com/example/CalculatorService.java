package com.example;

import org.springframework.stereotype.Component;

@Component
public class CalculatorService {

    public CalculatorService() {
        System.out.println("Estoy en constructor de la clase CalculatorSerice");
    }

    public String holaMundo(){
        return "Hola mundo!";
    }
}
