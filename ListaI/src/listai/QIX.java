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
public class QIX {
    public static void main(String[] args){
//      Encontre o dobro de um número caso ele seja positivo e o seu triplo caso
//      seja negativo, imprimindo o resultado.
        
        double a, result;
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Digite um número:");
        a = reader.nextDouble();
        
        result = (a<0)? a*3 : a*2 ;
        
        System.out.println( result);
        
        //questão concluída
        
    }
}
