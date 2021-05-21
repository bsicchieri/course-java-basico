package com.bsicchieri.cursojava.aula27;

import java.util.Date;

public class Carro {

    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;
    String[] vendedores;
    Date dataLancamento;

    void exibirAutonomia(){
        System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel + " km");
    }

    double obterAutonomia(){
        return capCombustivel * consumoCombustivel;
    }

    double calcularCombustivel(double km){
        double qtdCombustivel = km / consumoCombustivel;
        return qtdCombustivel;
    }

}
