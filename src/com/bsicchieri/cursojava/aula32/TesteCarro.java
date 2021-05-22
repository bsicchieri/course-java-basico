package com.bsicchieri.cursojava.aula32;

import java.util.Arrays;
import java.util.Date;

public class TesteCarro {

    public static void main(String[] args) {

        String[] vendedores = {"Joao", "Miguel"};

        Carro van = new Carro("Fiat", "Ducato", 10, 100, 0.02, vendedores, new Date());

        System.out.println(van.getMarca());
        System.out.println(van.getModelo());
        System.out.println(van.getNumPassageiros());
        System.out.println(van.getCapCombustivel());
        System.out.println(van.getConsumoCombustivel());
        System.out.println(Arrays.toString(van.getVendedores()));
        System.out.println(van.getVendedores()[0]);
        System.out.println(van.getVendedores()[1]);
        System.out.println(van.getDataLancamento());

        van.exibirAutonomia();

        double autonomia = van.obterAutonomia();
        System.out.println("A autonomia do carro é: " + autonomia);

        System.out.println("A autonomia do carro é: " + van.obterAutonomia());

        double quantidade = 10;
        System.out.println("O combustível necessário para andar 10km é: " + van.calcularCombustivel(quantidade));

        System.out.println("O combustível necessário para andar 10km é: " + van.calcularCombustivel(15));
    }
}
