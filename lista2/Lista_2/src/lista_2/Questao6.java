package lista_2;

import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args){
//    6. Faça um algoritmo que leia um vetor de 100 posições de valores numéricos. Depois da leitura, multiplique
//todos seus elementos pelo primeiro número primo encontrado no vetor. Se não houver número primo no
//vetor não altere os seus valores. Mostre o vetor após o processamento.
        int[] vetor = new int[5];
        int primo = 0;
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Digite o vetor: ");
        for (int i = 0; i < vetor.length; i++){
            vetor[i] = reader.nextInt();
        
            //verificar se o número digitado é primo
            if(primo == 0 && vetor[i] != 1){/* quando primo tem valor 0 ele verifica pois é considerado vazio, se for
                              for diferente de 0 é pq já encontrou o primeiro primo*/
                if(isPrimo(vetor[i])){
                    primo = vetor[i]; 
                }
                
            }
        }
        
        if(primo!=0){
            for(int i =0; i<vetor.length; i++){
                vetor[i]*=primo;
            }
        }
        
        System.out.println("Esse é o vetor resultante:");
        for(int i =0; i<vetor.length; i++){
                System.out.println(vetor[i]);
            }
    }
    
    public static boolean isPrimo(int numero){
        for(int j = 2; j< numero; j++){
            if(numero % j == 0){
                return false;
            }
        }
        return true;
    }
}
