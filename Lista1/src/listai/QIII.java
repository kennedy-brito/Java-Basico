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
public class QIII {
    public static void main(String[] args){
//      Leia 4 variáveis A, B, C e D. A seguir, calcule e mostre a diferença do 
//      produto de A e B pelo produto de C e D (A*B - C*D).
        
        float result, a, b, c, d;
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Digite o valor de A");
        a = reader.nextFloat();
        System.out.println("Digite o valor de B");
        b = reader.nextFloat();
        System.out.println("Digite o valor de C");
        c = reader.nextFloat();
        System.out.println("Digite o valor de D");
        d = reader.nextFloat();
        
        result = a*b - c*d;
        
        System.out.println(a + "x" + b + " - " + c + "x" + d + " = " + result);
        
        //questão concluída
    }
}

