package lista_2;

import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args){
//        5. Faça um algoritmo que leia 2 vetores numéricos A[10] e B[10]. A seguir, crie um vetor C que seja a
//intersecção de A com B e mostre este vetor C. Obs.: intersecção é quando um valor estiver nos dois vetores.
//Considere que não há elementos duplicados em cada um dos vetores.
        int[] a = new int[10];
        int[] b = new int[10];
        int[] c = new int[10];
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Digite os valores do primeiro vetor:");
        for (int i = 0; i < a.length; i++) {
            a[i] = reader.nextInt();
        }
        
        System.out.println("Digite os valores do segundo vetor:");
        for (int i = 0; i < b.length; i++) {
            b[i] = reader.nextInt();
        }
        
        //realizando a intersecção desses vetores
        
        for (int i = 0; i < c.length; i++) {
            //verificar se a e b possuem algum valor em comum
            for(int j =0 ; j<a.length;j++){
                //se possuírem, atribuir a c
                if(a[j] == b[i]){
                  c[i] = a[j];
                } 
                
            };
        }
        
        System.out.println("A intersecção de A e B é: ");
        for(int i =0; i<c.length; i++){
            if(c[i]!=0){
             System.out.println(c[i]);
            }
        }
        
    }
}
