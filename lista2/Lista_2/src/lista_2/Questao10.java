
package lista_2;

import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args){
//    10. Leia uma matriz 10 x 10 e escreva a localização (linha e a coluna) do maior valor. Considere que a matriz
//não terá elementos repetidos.
    int linha =0, coluna=0, maior = 0;
    int[][] matriz = new int[3][3];
    Scanner reader = new Scanner(System.in);
    
        for (int i = 0; i < matriz.length; i++) {
            System.out.println("Digite a " + (i+1) + "ª Linha da matriz:");
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = reader.nextInt();
            }
        }
        
        //verificação do maior elemento e sua posição
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if(matriz[i][j]>maior){
                    maior = matriz[i][j];
                    linha = i;
                    coluna = j;
                }
            }
        }
        
        System.out.println("O maior elemento está nos índices(linha e coluna) " + linha + ", " + coluna);
    }
}
