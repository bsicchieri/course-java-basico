package com.bsicchieri.cursojava.aula33;

public class TesteCalculadora {

    public static void main(String[] args) {

        MinhaCalculadora calc = new MinhaCalculadora();

        System.out.println("Resultado: " + calc.soma(1, 2));
        System.out.println("Resultado: " + calc.soma(1.0, 2.1));

    }

}
