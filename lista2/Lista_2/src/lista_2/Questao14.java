package lista_2;

import java.util.Scanner;

public class Questao14 {
 public static void main(String[] args) {
//14. Leia uma matriz de 5x5 elementos. Calcule a soma dos elementos que estão abaixo da diagonal principal.
        int soma = 0;
        int[][] matriz = new int[5][5];
        Scanner reader = new Scanner(System.in);
        
        for(int i =0; i< matriz.length; i++){
            System.out.println("Digite os valores da " + (i+1) + "ª Linha: ");
            for(int j =0; j<matriz[0].length; j++){
                matriz[i][j] = reader.nextInt();
            }
        }
        
        for(int i =0; i< matriz.length; i++){
            for(int j =0; j<matriz[0].length; j++){
                if(i == j && i!=matriz.length-1){/* I deve ser diferente de matriz.length-1 pois não existe elemento abaixo da ultima linha*/
                    soma += matriz[i+1][j];/* I+1 signifca pegar o elemento abaixo da linha atual*/
                }
            }
        }
        System.out.println("Soma dos elementos abaixo da diagonal principal = " + soma);    
 }
}
