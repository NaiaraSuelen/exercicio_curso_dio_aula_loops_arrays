package br.com.dio.exercicios.arrays;

import java.util.Scanner;

public class Ex_Consoantes {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        String[] consoantes = new String[6];
        int i = 0, quantidadeConsoantes = 0;

        do{
            System.out.println("Letra: ");
            String letra = scan.next();

            if( !(letra.equalsIgnoreCase("a")|
                letra.equalsIgnoreCase("e") |
                letra.equalsIgnoreCase("i") |
                letra.equalsIgnoreCase("o") |
                letra.equalsIgnoreCase("u")))
            {
                consoantes[i] = letra;
                quantidadeConsoantes++;
            }
            i++;
        } while(i < consoantes.length);

        System.out.println("Consoantes: ");
        for (String consoante : consoantes)
        {
            if(consoante != null)
            System.out.println(consoante + " ");
        }
         System.out.println("Quantidade de consoantes: " + quantidadeConsoantes);
    }
}

