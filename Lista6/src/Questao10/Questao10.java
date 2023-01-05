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

        int qnt, x, y;

        System.out.println("Digite qunatas vezes deseja somar");
        qnt = leitor.nextInt();

        for (int i = 0; i < qnt; i++) {
            try {
                System.out.println("Digite o primeiro numero");
                x = leitor.nextInt();
                System.out.println("Digite o segundo numero");
                y = leitor.nextInt();

                if ((x + y) > 100) {
                    throw new ExcecaoAcimaDeCem();
                }

                System.out.println(x + " + " + y + " = " + (x + y));
                
            } catch (ExcecaoAcimaDeCem e) {
                System.out.println(e.toString());
            }
        }

    }
}
