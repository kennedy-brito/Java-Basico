/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao11;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author cliente
 */
public class Questao11 {

    public static void main(String[] args) {
        int[] num = new int[10];
        int x, l;

        Scanner scan = new Scanner(System.in);

        try {
            for (int i = 0; i < num.length; i++) {

                System.out.println("Digite um numero");
                x = scan.nextInt();
                System.out.println("Informe o indicie do vetor que deseja adicionar o numero.");
                l = scan.nextInt();

                num[l] = x;

                System.out.println("Numero " + x + " adicionado no indice " + " = " + l);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro! indice inválido");
            e.printStackTrace(); //Linha que ocorre o erro
        } catch (InputMismatchException e) {
            System.out.println("Erro! número digitado não é um inteiro!");
            e.printStackTrace(); //Linha que ocorre o erro

        }
    }
}
