/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listai;

import java.util.Scanner;

/**
 *
 * @author cliente
 */
public class QIV {
    public static void main(String[] args){
//      Escreva um algoritmo para calcular e exibir a média ponderada entre duas
//      notas dadas. Essas notas serão digitadas pelo usuário. 
//      Considere que a nota 1 tem peso 2 e a nota 2 tem peso 3.
        
        float n1, n2, average;
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Digite a 1ª nota:");
        n1 = reader.nextFloat();
        System.out.println("Digite a 2ª nota:");
        n2 = reader.nextFloat();
        
        average = (float) ((n1*2 + n2*3)/5.0);
        System.out.println("media = " + average);
        
        //questão concluida
    }
}
