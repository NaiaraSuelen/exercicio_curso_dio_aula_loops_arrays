package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class Ex_Fatorial {
    public static void main(String[] args){
        /*Calcula fatorial de um número inteiro*/

        Scanner scan = new Scanner(System.in);

        System.out.println("Número: ");
        int numero = scan.nextInt();

        int multiplicacao = 1;

        System.out.println(numero + "! = ");

        for( int i = numero; i >= 1; i--){
            multiplicacao = multiplicacao * i;
        }

        System.out.println(multiplicacao);
    }
}
