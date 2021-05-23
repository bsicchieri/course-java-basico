package com.bsicchieri.cursojava.aula36;

import java.time.LocalDate;

public class TesteContato {

    public static void main(String[] args) {

        Endereco endereco = new Endereco("Rua teste", 10, "casa", "centro",
                "curitiba", "pr", "30300-100");

        //LocalDate dataCadastro = LocalDate.of(2020, 2, 1);
        //LocalDate dataAtual = LocalDate.now();

        Contato contato = new Contato("Bruno");
        contato.setEndereco(endereco);
        contato.setDataCadastro(LocalDate.of(2020, 2, 1));
        contato.setDataAtual(LocalDate.now());

        System.out.println(contato.getNome());
        System.out.println(contato.getEndereco().getCEP());
        System.out.println(contato.getDataCadastro());
        System.out.println(contato.getDataAtual());

        /*

        //System.out.println("Informe o nome da rua: ");
        //endereco.setNomeRua(validaTexto(scan.nextLine()));

        if(contato != null && contato.getEndereco() != null){
            System.out.println(contato.getEndereco().getCidade());
        }

        if(contato != null && contato.getEndereco() != null){
            System.out.println(contato.getEndereco().getNomeRua());
        }

        if(contato2 != null && contato2.getEndereco() != null){
            System.out.println(contato2.getEndereco().getCidade());
        }

        if(contato2 != null && contato2.getEndereco() != null){
            System.out.println(contato2.getEndereco().getNomeRua());
        }

        //Telefone tel = new Telefone("Fixo", "11", "99999-9999");
        // tel2 = new Telefone("Celular", "11", "88888-8888");

        //Telefone[] telefones = new Telefone[2];
        //telefones[0] = tel;
        //telefones[1] = tel2;

        //contato.setTelefones(telefones);

        /*
        if(contato != null && contato.getTelefone() != null){
            System.out.println(contato.getTelefone().getDDD() + " " + contato.getTelefone().getNumero());
        } */

        /*
        if(contato != null & contato.getTelefones() != null){
            for(Telefone t : contato.getTelefones()){
                System.out.println(t.getTipo() + " " + t.getDDD() + " " + t.getNumero() );
            }
        }
        */

    }
}


