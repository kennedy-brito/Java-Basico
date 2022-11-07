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
public class QV {
    public static void main(String[] args){
//      Escreva um algoritmo que calcule e mostre a área de um trapézio. 
//      A fórmula do trapézio é: A=( (base maior + base menor)*altura)/2
        float height, smallBase, bigBase, area; //altura, base menor, base maior
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Digite a altura:");
        height = reader.nextFloat();
        System.out.println("Digite o tamanho da base menor:");
        smallBase = reader.nextFloat();
        System.out.println("Digite o tamanho da base maior:");
        bigBase = reader.nextFloat();
        
        area =(float)(  ((bigBase + smallBase)*height)/2  );
      
        System.out.println("A área do trapézio é igual " + area);
        
        //questão concluída
    }
}
