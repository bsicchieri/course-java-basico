package com.bsicchieri.cursojava.aula31;

import java.util.Date;

public class TesteCarro {

    public static void main(String[] args) {

        String[] vendedores = {"Joao", "Miguel"};

        Carro van = new Carro("Fiat", "Ducato", 10, 100, 0.02, vendedores, new Date());

        System.out.println(van.marca);
        System.out.println(van.modelo);
        System.out.println(van.numPassageiros);
        System.out.println(van.capCombustivel);
        System.out.println(van.consumoCombustivel);
        System.out.println(van.vendedores[0]);
        System.out.println(van.vendedores[1]);
        System.out.println(van.dataLancamento);

        van.exibirAutonomia();

        double autonomia = van.obterAutonomia();
        System.out.println("A autonomia do carro é: " + autonomia);

        System.out.println("A autonomia do carro é: " + van.obterAutonomia());

        double quantidade = 10;
        System.out.println("O combustível necessário para andar 10km é: " + van.calcularCombustivel(quantidade));

        System.out.println("O combustível necessário para andar 10km é: " + van.calcularCombustivel(15));
    }
}
