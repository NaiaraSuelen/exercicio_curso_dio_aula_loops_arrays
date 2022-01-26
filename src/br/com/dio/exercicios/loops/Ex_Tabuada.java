package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class Ex_Tabuada {
    public static void main(String[] args){
        /*Gerador de tabuada de qualquer número entre 0  e 10*/

        Scanner scan =  new Scanner(System.in);
        System.out.println("Tabuada: ");
        int numero = scan.nextInt();

        for(int i = 1; i < 11; i++){
            System.out.println(numero + " X " + i + " = " + (numero*i));
        }
    }
}
