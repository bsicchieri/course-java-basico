package com.bsicchieri.cursojava.aula36;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Contato {

    private String nome;
    private Endereco endereco;
    private Telefone[] telefones;
    private LocalDate dataCadastro;
    private LocalDate dataAtual;

    public Contato() { }

    public Contato(String nome) {
        setNome(nome);
    }

    public String getNome() { return nome; }

    public void setNome(String nome) { this.nome = nome; }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getDataCadastro() {
        String dataFinal = dataCadastro.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        return dataFinal;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getDataAtual() {
        String dataFinal = dataAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        return dataFinal;
    }

    public void setDataAtual(LocalDate dataAtual) {
        this.dataAtual = dataAtual;
    }
}
