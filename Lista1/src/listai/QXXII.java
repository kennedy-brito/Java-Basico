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
public class QXXII {
    public static void main(String[] args) {
//      Ler vários números e informar quantos números entre 100 e 200 foram 
//      digitados. Quando o valor 0 (zero) for lido, o algoritmo deverá cessar s
//      ua execução. 
        int a, cont = 0;
        do{
            a = Integer.parseInt(JOptionPane.showInputDialog("Digite 0 para encerrar\nDigite um número:"));
            
            if((a>=100)&&(a<=200)){
                cont +=1;
            }
            
        }while (a!=0);
        
        JOptionPane.showMessageDialog(null, "você digitou " + cont + " valor(es) entre 100 e 200");
//      questão concluída
    }
}
