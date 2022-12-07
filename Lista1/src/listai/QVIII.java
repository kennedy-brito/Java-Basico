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
public class QVIII {
    public static void main(String[] args){
//      Faça um algoritmo que leia dois valores inteiros A e B se os valores
//      forem iguais deverá se somar os dois, caso contrário multiplique A por B.
//      Ao final de qualquer um dos cálculos deve-se atribuir o resultado para uma
//      variável C e mostrar seu conteúdo na tela.
    
        int a, b, c;
        
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite A:"));
        
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite B:"));
        
        c = (a==b)? a+b : a*b ;
        
        if(a==b){
            JOptionPane.showMessageDialog( null,a + "+" + b + " = " + c);
        }else{
            JOptionPane.showMessageDialog(null, a + "*" + b + " = " + c);
        }
        
        //questão concluída
    }
}
