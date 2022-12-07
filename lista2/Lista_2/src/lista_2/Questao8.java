package lista_2;

import java.util.Scanner;

public class Questao8 {
    public static void main(String[] args){
//        8. Dada uma matriz de ordem 4x3 contendo valores numéricos reais. Faça um algoritmo que calcule e exiba
//a soma dos números positivos e a soma dos números negativos.
        int[][] matriz = new int[4][3];
        int somaP =0;
        int somaN = 0;
        Scanner reader = new Scanner(System.in);
        
        for(int i =0 ; i < matriz.length;i++){
            System.out.println("Digite os elementos da " + (i+1) + "ª Linha: ");
            for(int j = 0; j<matriz[0].length; j++){
                matriz[i][j] = reader.nextInt();
                
                //verificação se é positivo ou negativo
                if(matriz[i][j]>=0){
                    somaP+=matriz[i][j];
                }else{
                    somaN+=matriz[i][j];
                }
            }
        }
        
        //exibir soma dos positivos e negativos
        System.out.println("Soma dos Positivos: " + somaP);
        System.out.println("Soma dos Negativos: " + somaN);
    }
}
