package com.bsicchieri.cursojava.aula31;

import java.util.Date;

public class Carro {

    public String marca;
    public String modelo;
    public int numPassageiros;
    public double capCombustivel;
    public double consumoCombustivel;
    public String[] vendedores;
    public Date dataLancamento;

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

    public void exibirAutonomia(){
        System.out.println("A autonomia do carro é: " + this.capCombustivel * this.consumoCombustivel + " km");
    }

    public double obterAutonomia(){
        return this.capCombustivel * this.consumoCombustivel;
    }

    public double calcularCombustivel(double km){
        double qtdCombustivel = km / this.consumoCombustivel;
        return qtdCombustivel;
    }

}
