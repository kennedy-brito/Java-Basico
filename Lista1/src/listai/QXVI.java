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
public class QXVI {
    public static void main(String[] args) {
//      Faça um programa que leia 6 valores. Estes valores serão somente 
//      negativos ou positivos (desconsidere os valores nulos). A seguir, mostre a 
//      quantidade de valores positivos digitados.
//      Entrada: Seis valores, negativos e/ou positivos.
//      Saída: Imprima uma mensagem dizendo quantos valores positivos foram lidos.
        int i, x, cont = 0;
        Scanner reader = new Scanner(System.in);   
        
        for(i=0; i<6 ; i++){
            System.out.println("Digite um número:");
            x = reader.nextInt();
            if(x!=0){
                if(x%2==0){
                    cont+=1;
                }
            }else{
                System.out.println("Digite um número não nulo!!");
                i--;
            }
        }
        System.out.println("Você digitou " + cont + " números positivos");
    }
    
    //questão concluída
}
