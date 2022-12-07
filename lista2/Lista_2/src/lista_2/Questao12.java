package lista_2;

import java.util.Scanner;

public class Questao12 {

    public static void main(String[] args) {
//        Ler uma matriz 4x4 de números inteiros, multiplicar os elementos da diagonal principal por um número
//inteiro também lido e escrever a matriz resultante.
        int x;
        int[][] matriz = new int[4][4];
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Informe o número que multiplica a diagonal principal: ");
        x = reader.nextInt();
        
        for(int i =0; i< matriz.length; i++){
            System.out.println("Digite os valores da " + (i+1) + "ª Linha: ");
            for(int j =0; j<matriz[0].length; j++){
                matriz[i][j] = reader.nextInt();
                
                //multiplicação da diagonal principal
                if( i == j){
                    matriz[i][j] *= x ;
                }
            }
        }
        System.out.println("Matriz resultante: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
