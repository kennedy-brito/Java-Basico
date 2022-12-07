package lista_2;

import java.util.Scanner;

public class Questao13 {
   public static void main(String[] args) {
//13. Leia uma matriz de 5x5 elementos. Calcule a soma dos elementos que estão acima da diagonal principal.
        int soma = 0;
        int[][] matriz = new int[5][5];
        Scanner reader = new Scanner(System.in);
        
        for(int i =0; i< matriz.length; i++){
            System.out.println("Digite os valores da " + (i+1) + "ª Linha: ");
            for(int j =0; j<matriz[0].length; j++){
                matriz[i][j] = reader.nextInt();
                if(i == j && i!=0){/* I deve ser diferente de 0 pois não existe elemento acima da primeiro linha*/
                    soma += matriz[i-1][j];/* I-1 signifca pegar o elemento acima da linha atual*/
                }
            }
        }
        
        System.out.println("Soma dos elementos acima da diagonal principal = " + soma);
    }    
}
