package br.com.dio.exercicios.arrays;

import java.util.Random;

public class Ex_ArrayMultidimensional {
    public static void main(String[] args){
        /*Matriz 4X4 com númeoros aleatórios*/
        Random random = new Random();

        int[][] M = new int[4][4];
        int i, j;

        for(i = 0; i < M.length;  i++){
            for(j = 0; j < M[i].length; j++){
                M[i][j] = random.nextInt(9);
            }
        }

        System.out.println("Matriz: ");
        for (int[] linha : M) {
            for (int coluna : linha)
            {
                System.out.println(coluna + " ");
            }
            System.out.println();
        }
    }
}
