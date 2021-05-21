package com.bsicchieri.cursojava.aula29;

import java.util.Date;

public class Carro {

    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;
    String[] vendedores;
    Date dataLancamento;

    public Carro(){}

    public Carro(String marca, String modelo, int numPassageiros, double capCombustivel,
                 double consumoCombustivel, String[] vendedores, Date dataLancamento) {
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        this.capCombustivel = capCombustivel;
        this.consumoCombustivel = consumoCombustivel;
        this.vendedores = vendedores;
        this.dataLancamento = dataLancamento;
    }

    void exibirAutonomia(){
        System.out.println("A autonomia do carro é: " + this.capCombustivel * this.consumoCombustivel + " km");
    }

    double obterAutonomia(){
        return this.capCombustivel * this.consumoCombustivel;
    }

    double calcularCombustivel(double km){
        double qtdCombustivel = km / this.consumoCombustivel;
        return qtdCombustivel;
    }

}
