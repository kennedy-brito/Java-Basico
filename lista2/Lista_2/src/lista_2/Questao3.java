package lista_2;

import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args){
//        3. Faça um algoritmo que leia um vetor K[10] e um vetor N[10]. A seguir, crie um vetor M que seja a
//diferença entre o vetor K e N (M=K-N). Mostre a seguir o vetor M.
        int[] k = new int[10];
        int[] n = new int[10];
        int[] m = new int[10];
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Digite os valores do primeiro vetor: ");
        for(int i =0; i<k.length; i++){
            k[i] = reader.nextInt();
        }
        
        System.out.println("Digite os valores do segundo vetor: ");
        for(int i =0; i<k.length; i++){
            n[i] = reader.nextInt();
        }
        
        System.out.println("Calculando o vetor resultante de k-n:");
        for(int i = 0; i < m.length ; i++) {
            m[i] = k[i]-n[i];
        }
        
        //exibindo o resultado com for-each
        for(int x : m){
            System.out.println(x);
        }
    }
}
