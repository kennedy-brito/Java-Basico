/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listai;

import javax.swing.JOptionPane;

/**
 *
 * @author cliente
 */
public class QXX {
    public static void main(String[] args) {
//      Faça um programa que leia várias idades e que calcule e imprima a média 
//      dessas idades. Escolha entre as estruturas de repetição 
//      DO_WHILE, FOR ou WHILE para implementar ao algoritmo.
        double x, age, sum = 0, media;
        
        x = Double.parseDouble(JOptionPane.showInputDialog("Deseja calcular a média de quantas idades?"));
        
        for(int i=0 ; i<x ; i++){
            age = Double.parseDouble(JOptionPane.showInputDialog("Digite a " + (i+1) + "ª idade"));
            sum+=age;
        }
        
        media = sum/x;
        JOptionPane.showMessageDialog(null, "a media dessas idades é " + media);
        
        //questão concluída
    }
}
