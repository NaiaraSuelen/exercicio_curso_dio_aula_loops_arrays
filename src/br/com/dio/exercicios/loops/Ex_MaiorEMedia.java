package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class Ex_MaiorEMedia {
    public static void main(String[] args){
        /*Programa que lê 5 números e mostra o maior entre eles e a média*/

        Scanner scan = new Scanner(System.in);

        int numero = 0;
        int maior = 0;
        int soma = 0;


        for(int i = 0; i < 5; i++){
            System.out.println("Número: ");
            numero = scan.nextInt();

            soma += numero;

            if(numero > maior){
                maior = numero;
            }
        }

        System.out.println("Maior número: " + maior);
        System.out.println("Média: " + (soma / 5));
    }
}
