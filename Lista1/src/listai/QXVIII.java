/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listai;

import static java.lang.Math.pow;
import java.util.Scanner;

/**
 *
 * @author cliente
 */
public class QXVIII {
    public static void main(String[] args) {
//      Leia um valor inteiro N. Apresente o quadrado de cada um dos valores 
//      pares, de 1 até N, inclusive N, se for o caso.
//      Entrada: A entrada contém um valor inteiro N.
//      Saída: Imprima o quadrado de cada um dos valores pares, de 1 até N.
        int n, i, square;
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Digite um número:");
        n = reader.nextInt();
        
        for(i=1 ; i<=n ; i++){
            if(i%2==0){
                square =(int) pow(i ,2);
                System.out.println(i + "^2 = " + square);
            }
        }
        
        //questão concluída
    }
}
