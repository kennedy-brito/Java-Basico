package Questao9;

import java.util.ArrayList;
import java.util.Scanner;


public class TestePais {
    
    public static void main(String[] args){
        
        //inicia os objetos
        Pais eua = new Pais("Estados Unidos", "Washington", 1000);
        Pais unitedStates = new Pais("Estados Unidos", "Washington", 1000);
        
        //verifica se os dois países são iguais
        if(unitedStates.equals(eua)){
            System.out.println("São iguais");
        }
        
        //adiciona e exibe fronteiras usando a função que usa vetor de String
        eua.addFronteiras();
        
        String[] fronteirasEua = eua.getFronteiras();
        for(String pais : fronteirasEua){
            System.out.println(pais);
        }
        
        //adiciona e exibe fronteiras usando a função que usa ArrayList de String
        Scanner lerTeclado = new Scanner(System.in);
        System.out.println("Quantos países fazem fronteira com ele?");
        int qtdFronteiras = lerTeclado.nextInt();
        lerTeclado.nextLine();//precisa para consumir a próxima quebra de linha
        
        //adiciona os paises
        for(int i = 0; i < qtdFronteiras; i++){
            System.out.println("Digite um país");
            String pais = lerTeclado.nextLine();
            unitedStates.addPaisesFronteira(pais);
        }
        
        ArrayList<String> fronteirasUnitedStates = unitedStates.getPaisesFronteira();
        for(String pais : fronteirasUnitedStates){
            System.out.println(pais);
        }
        
        //verificando se exitem paises com fronteiras em comum
//        String[] fronteirasJuntas = eua.fronteirasJuntas(unitedStates);;
//        for(String pais : fronteirasJuntas){
//            System.out.println(pais);
//        }
        System.out.println("");
        ArrayList<String> fronteirasConjuntas = eua.fronteirasConjuntas(unitedStates);
        System.out.println("Fazem fronteira com: ");
        for(String pais : fronteirasConjuntas){
            System.out.println(pais);
        }
    }
}
