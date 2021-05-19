package com.bsicchieri.cursojava.aula19;

import java.util.Scanner;

public class Arrays {

    public static void main(String[] args) {

        double[] temperaturas = new double[365];
        temperaturas[0] = 31.3;
        temperaturas[1] = 31.7;
        temperaturas[2] = 32.0;
        temperaturas[3] = 32.1;
        temperaturas[4] = 32.3;
        temperaturas[5] = 31.1;

        System.out.println("O valor da temp do dia 1 é: " + temperaturas[3]);
        System.out.println("O tamanho do array é: " + temperaturas.length);

        for(int i = 0; i < temperaturas.length; i++){
            System.out.println("O valor da temp do dia " + (i + 1) + " é: " + temperaturas[i]);
        }

        for(double temp : temperaturas){
            System.out.println(temp);
        }

    }
}
