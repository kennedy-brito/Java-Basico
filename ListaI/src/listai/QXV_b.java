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
public class QXV_b {
    public static void main(String[] args) {
//      Faça algoritmos que calculem a soma dos inteiros pares de 1 a N.
//      a) Resolva usando o WHILE.
//      b) Resolva usando o FOR.
        Scanner reader = new Scanner(System.in);
        int n, result = 1;
        
        System.out.println("Digite um número:");
        n = reader.nextInt();
        
        for(;n>0;n--){
            if(n%2==0){
                result *= n;
            }
        }
        
        System.out.println(result);
        //letra B concluida
//:;
    }
}
