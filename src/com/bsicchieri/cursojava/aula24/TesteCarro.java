package com.bsicchieri.cursojava.aula24;

import java.util.Date;

public class TesteCarro {

    public static void main(String[] args) {

        Carro van = new Carro();

        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numPassageiros = 10;
        van.capCombustivel = 100;
        van.consumoCombustivel = 0.2;

        van.vendedores = new String[2];
        van.vendedores[0] = "João";
        van.vendedores[1] = "Ana";

        van.dataLancamento = new Date();

        System.out.println(van.marca);
        System.out.println(van.modelo);
        System.out.println(van.numPassageiros);
        System.out.println(van.capCombustivel);
        System.out.println(van.consumoCombustivel);
        System.out.println(van.vendedores[0]);
        System.out.println(van.vendedores[1]);
        System.out.println(van.dataLancamento);

    }
}
