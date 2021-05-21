package com.bsicchieri.cursojava.aula36;

public class TesteContato {

    public static void main(String[] args) {

        Contato contato = new Contato();
        contato.setNome("Bruno");
        //contato.setEndereco("Rua 10");
        //contato.setTelefone("11 99999-9999");

        Endereco end = new Endereco();
        end.setNomeRua("Rua do Comercio");
        end.setNumero(10);
        end.setComplemento("Casa");
        end.setBairro("Centro");
        end.setCidade("Curitiba");
        end.setEstado("Paraná");
        end.setCEP("300321-000");

        contato.setEndereco(end);

        Telefone tel = new Telefone();
        tel.setTipo("Fixo");
        tel.setDDD("11");
        tel.setNumero("99999-9999");

        Telefone tel2 = new Telefone();
        tel2.setTipo("Celular");
        tel2.setDDD("11");
        tel2.setNumero("88888-8888");

        Telefone[] telefones = new Telefone[2];
        telefones[0] = tel;
        telefones[1] = tel2;

        contato.setTelefones(telefones);

        System.out.println(contato.getNome());

        if(contato != null && contato.getEndereco() != null){
            System.out.println(contato.getEndereco().getCidade());
        }

        /*
        if(contato != null && contato.getTelefone() != null){
            System.out.println(contato.getTelefone().getDDD() + " " + contato.getTelefone().getNumero());
        } */

        if(contato != null & contato.getTelefones() != null){
            for(Telefone t : contato.getTelefones()){
                System.out.println(t.getDDD() + " " + t.getNumero() );
            }
        }

    }
}
