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
public class QX {
    public static void main(String[] args) {
//      Escreva um algoritmo que leia um caractere e informe se este é ou não 
//      uma vogal.
        
        char a;
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Digite uma letra:");
        a = reader.next().charAt(0);
        
        if( a=='a' || a=='e' || a=='i' || a=='o' || a=='u' ){
            System.out.println("é vogal");
        }else{
            System.out.println("não é vogal");
        }
        
        //questão concluída
        
    }
}
