package lista_2;

import java.util.Scanner;

public class Questao7 {

    public static void main(String[] args) {
//    7. Ler um vetor de 10 elementos inteiros. Após isto, imprimir na tela os 10 valores lidos e o usuário poderá
//escolher um destes valores para ser excluído do vetor. Ler o valor escolhido e eliminá-lo do vetor. No
//momento da exclusão todos os valores posteriores ao valor escolhido deverão ser reorganizados (movidos
//uma posição para esquerda) a fim de que o vetor resultante não fique com um espaço em branco. Imprimir
//o novo vetor.
        int[] vetor = new int[4];
        String opc;
        Scanner reader = new Scanner(System.in);
        int del;
        
        System.out.println("Informe o vetor: ");
        for(int i =0; i < vetor.length; i++){
            vetor[i] = reader.nextInt();
        }
        
        //exibição do vetor
        System.out.println("Esse é o vetor: ");
        for(int n : vetor){
            System.out.println(n);
        }
        
        System.out.println("Deseja excluir um dos valores do vetor? (s/n)");
        opc = reader.next();
        if("s".equals(opc)){
            System.out.println("Digite o número a ser deletado: ");
            del = reader.nextInt();
            for(int i =0; i < vetor.length; i++){
                if(vetor[i] == del ){
                    for(int j=i; j< vetor.length -1; j++){
                        vetor[j] = vetor[j+1];
                    }
                    
                }
            }
            System.out.println("O novo vetor é: ");
            for(int i =0; i < vetor.length-1; i++){
                System.out.println(vetor[i]);
            }
        }
    }
}
