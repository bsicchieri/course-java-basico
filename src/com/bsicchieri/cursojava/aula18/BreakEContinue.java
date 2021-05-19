package com.bsicchieri.cursojava.aula18;

import java.util.Scanner;

public class BreakEContinue {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com um número e um limite: ");
        int num = scan.nextInt();
        int max = scan.nextInt();

        for(int i = num; i <= max; i++){
            if(i % 7 == 0){
                System.out.println("O valor de i é: " + i);
                break;
            }
        }

        for(int i = num; i <= max; i++){
            if(i % 7 == 0){
                continue;
            }
            System.out.println("O valor de i é: " + i);
        }
    }
}
