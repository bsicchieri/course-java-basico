package com.bsicchieri.cursojava.aula36;

public class Telefone {

    private String tipo;
    private String DDD;
    private String numero;

    public Telefone(String tipo, String DDD, String numero) {
        this.tipo = tipo;
        this.DDD = DDD;
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDDD() {
        return DDD;
    }

    public void setDDD(String DDD) {
        this.DDD = DDD;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
