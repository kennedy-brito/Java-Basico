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
public class QXXI {
    public static void main(String[] args) {
//      Faça um algoritmo que leia dois números inteiros e verifique se a 
//      sequência é crescente ou decrescente. O algoritmo deverá encerrar quando o 
//      usuário informar dois números iguais.
        int a, b;
        do{
            a = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));
            b = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));
            
            if(a==b){
                JOptionPane.showMessageDialog(null, "valores iguais encerram o programa!");
                break;
            }
            
            JOptionPane.showMessageDialog(null, (a<b)? "a sequência é crescente":"a sequência é decrescente");
            JOptionPane.showMessageDialog(null, "Para encerrar digite dois números iguais");
            
        }while(a!=b);
        
//        questão concluída
    }    
}
