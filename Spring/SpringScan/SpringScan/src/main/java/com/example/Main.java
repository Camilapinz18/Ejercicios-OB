package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {


    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        /////////////////
        CalculatorService calculator=(CalculatorService) context.getBean("calculatorService");
        String texto=calculator.holaMundo();
        System.out.println(texto);

        /////////////////Cargar un bean dentro de otro bean:
        FacturaCRUD gestor= (FacturaCRUD)context.getBean("facturaCRUD");
        System.out.println(gestor.calculator1.holaMundo());
    }
}
