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
public class QXIV {
    public static void main(String[] args) {
//      Faça um algoritmo que calcule o produto dos inteiros ímpares de 1 a N. 
//      Resolva usando o WHILE.
        Scanner reader = new Scanner(System.in);
        int n, result = 1;
        
        System.out.println("Digite um número:");
        n = reader.nextInt();
        
        while(n>0){
            if(n%2!=0){
                result *= n;
            }
            n--;
        }
        
        System.out.println(result);
        //questão concluída
    }
}
