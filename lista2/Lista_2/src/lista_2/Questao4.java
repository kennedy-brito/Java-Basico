package lista_2;

import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args){
//    4. Leia um vetor de 40 posições. Contar e escrever quantos valores pares ele possui.

        int[] vetor = new int[40];
        int qtdP = 0;
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Digite os valores do vetor:");
        for(int i =0; i<vetor.length; i++){
            vetor[i] = reader.nextInt();
            qtdP = (vetor[i] % 2 == 0)? qtdP + 1: qtdP;
        }
        
        System.out.println("Esse vetor tem " + qtdP + " números pares.");
    }
}
