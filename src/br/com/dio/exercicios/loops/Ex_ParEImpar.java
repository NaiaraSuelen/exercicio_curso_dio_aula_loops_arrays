package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class Ex_ParEImpar {
    public static void main(String[] args){
        /*Lê N números inteiros e mostra a quantidade de números pares e de números impares*/

        Scanner scan = new Scanner(System.in);

        int qtddNumeros = 0;
        int qtddPares = 0, qtddImpares = 0;
        int numero, i = 0;

        System.out.println("Quantidade de números: ");
        qtddNumeros = scan.nextInt();

        do{
            System.out.println("Número: ");
            numero = scan.nextInt();

            if((numero % 2) == 0 )qtddPares ++;
            else qtddImpares++;

            i++;
        }while(i < qtddNumeros);

        System.out.println("Quantidade par: " + qtddPares);
        System.out.println("Quantidade ímpar: " + qtddImpares);
    }
}
