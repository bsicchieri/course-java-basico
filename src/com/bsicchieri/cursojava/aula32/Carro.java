package com.bsicchieri.cursojava.aula32;

import java.util.Date;

public class Carro {

    private String marca;
    private String modelo;
    private int numPassageiros;
    private double capCombustivel;
    private double consumoCombustivel;
    private String[] vendedores;
    private Date dataLancamento;

    public Carro(){}

    public Carro(String marca, String modelo, int numPassageiros, double capCombustivel,
                 double consumoCombustivel, String[] vendedores, Date dataLancamento) {
        setMarca(marca);
        setModelo(modelo);
        setNumPassageiros(numPassageiros);
        setCapCombustivel(capCombustivel);
        setConsumoCombustivel(consumoCombustivel);
        setVendedores(vendedores);
        setDataLancamento(dataLancamento);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNumPassageiros() {
        return numPassageiros;
    }

    public void setNumPassageiros(int numPassageiros) {
        this.numPassageiros = numPassageiros;
    }

    public double getCapCombustivel() {
        return capCombustivel;
    }

    public void setCapCombustivel(double capCombustivel) {
        this.capCombustivel = capCombustivel;
    }

    public double getConsumoCombustivel() {
        return consumoCombustivel;
    }

    public void setConsumoCombustivel(double consumoCombustivel) {
        this.consumoCombustivel = consumoCombustivel;
    }

    public String[] getVendedores() {
        return vendedores;
    }

    public void setVendedores(String[] vendedores) {
        this.vendedores = vendedores;
    }

    public Date getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(Date dataLancamento) {
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
