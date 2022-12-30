/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao3;

import java.util.Scanner;

/**
 *
 * @author cliente
 */
public class Teste {
    public static void main(String[] args) {
        CartaoWeb msg[] = new CartaoWeb[3];
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Digite o  nome do destinatario: ");
        msg[0] = new DiaDosNamorados(reader.nextLine());
        System.out.println("Digite o  nome do destinatario: ");
        msg[1] = new Aniversario(reader.nextLine());
        System.out.println("Digite o  nome do destinatario: ");
        msg[2] = new Natal(reader.nextLine());
        
        for (int i = 0; i < 3; i++) {
            msg[i].showMessage();
        }
    }
}
