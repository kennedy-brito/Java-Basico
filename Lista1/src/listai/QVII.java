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
public class QVII {
    public static void main(String[] args){
//      Escreva um algoritmo para ler as dimensões de uma cozinha (comprimento, 
//      largura e altura), calcular e escrever a quantidade de azulejos para se 
//      colocar em todas as paredes (considere que não será descontada a área 
//      ocupada por portas e janelas). Cada caixa de azulejos possui 1,5 metros 
//      quadrados. Considere: Comprimento * Alt * 2 + Largura * Alt * 2
        
        double height, length, width, boxes, area;//altura, comprimento, largura, número de caixas, area
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Digite a altura:");
        height = reader.nextDouble();
        System.out.println("Digite o comprimento:");
        length = reader.nextDouble();
        System.out.println("Digite a largura:");
        width = reader.nextDouble();
        
        area = length*height*2 + width*height*2 ;
        
        boxes = area/1.5;
        
        System.out.println("O número de caixas necessárias é " + boxes);
        
        //questão concluída
        
    }
}
