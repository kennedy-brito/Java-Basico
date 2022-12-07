/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista_2;

import java.util.Scanner;

/**
 *
 * @author cliente
 */
public class Questao1 {

    public static void main(String[] args) {
//        1. Escreva um algoritmo que leia dois vetores de 10 posições e faça a multiplicação dos elementos de mesmo
//índice, colocando o resultado em um terceiro vetor. Mostre o vetor resultante.
        Scanner reader = new Scanner(System.in);
        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];
        int[] result = new int[10];
        
        System.out.println("Digite os valores do primeiro vetor:");
        for(int i =0 ; i < vetor1.length ; i++){
            vetor1[i] = reader.nextInt();
        }
        
        System.out.println("Digite os valores do segundo vetor:");
        for(int i =0 ; i < vetor2.length ; i++){
            vetor2[i] = reader.nextInt();
        }
        
        //calculando o vetor resultante e imprimindo
        for(int i =0 ; i < result.length ; i++){
            result[i] = vetor1[i]*vetor2[i];
            System.out.println("result[" + i + "] = " + result[i]);
        }
    }

}
