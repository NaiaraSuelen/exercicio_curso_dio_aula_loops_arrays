package br.com.dio.exercicios.arrays;

public class Ex_OrdemInversa {
    public static void main(String[] args){
        /*ordem inversa de um vetor de 6 números inteiros*/

        int[] vetor = {9,8,7,6,5,4};
        int i = 0;

        System.out.println("Vetor: ");
        while(i < vetor.length){
            System.out.println(vetor[i] + " ");
            i++;
        }

        System.out.println("\nVetor na ordem inversa: ");
        for(i = (vetor.length)-1; i >= 0; i-- ){
            System.out.println(vetor[i] + " ");
        }
    }
}
