package lista_2;

import java.util.Scanner;

public class Questao9 {

    public static void main(String[] args) {
//    9. Dado um valor numérico X e uma matriz A 4x2, elabore um algoritmo que calcule e exiba uma outra
//matriz B que deverá conter cada elemento da matriz A dividido pelo valor numérico X.
        int[][] a = new int[4][2];
        int[][] b = new int[4][2];
        int x;
        Scanner reader = new Scanner(System.in);

        System.out.println("Digite o valor que dividira a matriz: ");
        x = reader.nextInt();
        
        for (int i = 0; i < a.length; i++) {
            System.out.println("Digite a " + (i+1) + "ª Linha da matriz:");
            for(int j =0; j<a[0].length; j++){
                a[i][j] = reader.nextInt();
                
                //matriz que é resultado da divisão de A por X
                b[i][j] = a[i][j]/x;
            }
        }
        for(int i =0; i <b.length; i++){
            for(int j = 0; j <b[0].length; j++){
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
        //exibição de B usando Arrays.deepToString()
//        import java.util.Arrays;
//        System.out.println(Arrays.deepToString(b) + " \n");
//        resultado: [[1, 2], [3, 4], [5, 6], [7, 8]] 
        
    }
}
