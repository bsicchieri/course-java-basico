package com.bsicchieri.cursojava.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
/*
        System.out.println("Digite seu nome completo: ");
        String nomeCompleto = scan.nextLine();
        System.out.println("Seu nome completo é: " + nomeCompleto);

        System.out.println("Digite seu primeiro nome: ");
        String primeiroNome = scan.next();
        System.out.println("Seu primeiro nome: " + primeiroNome);

        System.out.println("Digite sua idade: ");
        int idade = scan.nextInt();
        System.out.println("Sua idade é: " + idade);
*/
        System.out.println("Digite seu nome e sua idade: ");
        String nome = scan.next();
        int idade = scan.nextInt();
        System.out.println("Seu primeiro nome: " + nome);
        System.out.println("Sua idade é: " + idade);
    }
}
