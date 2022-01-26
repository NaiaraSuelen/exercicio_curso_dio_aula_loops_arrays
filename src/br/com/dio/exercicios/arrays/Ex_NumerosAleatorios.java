package br.com.dio.exercicios.arrays;

import java.util.Random;

public class Ex_NumerosAleatorios {
    public static void main(String[] args){
        /*Imprime 20 numeros aleatórios entre 0 e 100 e mostra seus sucessores*/

        Random random = new Random();
        int[] aleatorios = new int[20];
        int i = 0;

        for(i = 0; i < aleatorios.length; i++ ){
            int numero = random.nextInt(100);
            aleatorios[i] = numero;
        }

        System.out.println("Números aleatorios e seus sucessores: ");
        for (int aleatorio : aleatorios)
        {
            System.out.println(aleatorio + " Sucessor: " + (aleatorio+1));
        }
    }
}
