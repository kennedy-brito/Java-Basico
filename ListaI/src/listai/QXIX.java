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
public class QXIX {
    public static void main(String[] args) {
//      Faça um algoritmo que calcule o produto de dois valores informados 
//      pelo usuário. Crie um sistema com a estrutura de repetição WHILE na qual
//      o usuário deverá responder a seguinte pergunta: Deseja executar o algoritmo? 
//      Se o usuário responder SIM o programa deve executar o cálculo e imprimir
//      o resultado, se responder NÃO, o programa deve ser encerrado.
        int x, y, result;
        String choice;
        
        choice = JOptionPane.showInputDialog("Deseja realizar um produto? sim ou nao?");
        
        while("sim".equals(choice) || "s".equals(choice)){
            x = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
            y = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
            result = x*y;
            
            JOptionPane.showMessageDialog(null,x+ "x" + y + " = " + result);
            
            choice = JOptionPane.showInputDialog("Deseja continuar?sim ou nao?");
        }
        //questão concluída
    }
}
