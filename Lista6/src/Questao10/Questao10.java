/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao10;

import java.util.Scanner;

/**
 *
 * @author cliente
 */
public class Questao10 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int qnt, x, y = 0;

        System.out.println("Digite quantos numéros deseja somar");
        qnt = leitor.nextInt();

        for (int i = 0; i < qnt; i++) {
            try {
                System.out.println("Digite um número numero");
                x = leitor.nextInt();
                
                y+=x;
                        
                if (y > 100) {
                    throw new ExcecaoAcimaDeCem();
                }

                System.out.println(" soma dos números digitados " + " = " +  y);
                
            } catch (ExcecaoAcimaDeCem e) {
                System.out.println(e.toString());
                break;
            }
        }
        double media = (y*1.0)/qnt;
        System.out.println("Media = " + media);
    }
}
