package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class Ex_Nota {
    public static void main(String[] args){
        /*Pedir uma nota entre zero e dez, continuar pedidondo até o valor ser válido*/
        Scanner scan = new Scanner(System.in);

        int nota;

        System.out.println("Nota: ");
        nota = scan.nextInt();

        while (nota < 0 | nota > 10){
            System.out.println("Nota inválida! Digite novamente: ");
            nota = scan.nextInt();
        }

    }
}
