package lista_2;
import java.util.Scanner;
public class Questao2{

    public static void main(String[] args) {
//        2. Escreva um algoritmo que leia um vetor de 80 elementos inteiros. Encontre e mostre o menor elemento e
//a sua posição.
        int[] vetor = new int[80];
        int menor, psc;
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Digite os elementos do vetor: ");
        for(int i = 0; i <vetor.length; i++){
            vetor[i] = reader.nextInt();
        }
        
        //encontrar o menor e sua posição
        menor = vetor[0];
        psc = 0;
        for(int i = 1; i < vetor.length ; i++){
            if(vetor[i]<menor){
                menor = vetor[i];
                psc = i;
            }
        }
        
        //exibição
        System.out.println("O menor valor é: " + menor +
                "\nSeu índice é: " + psc);
    }

}
