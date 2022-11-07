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
public class QVI {
    public static void main(String[] args){
//      Faça um algoritmo que receba o nome, o ano de nascimento de uma pessoa 
//      e o ano atual, calcule e mostre:
//      a) o nome dessa pessoa.
//      b) a idade dessa pessoa.
//      c) quantos anos ela terá em 2030.
        String name;
        int year, birth, age;//ano atual, ano de nascimento, idade
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Digite seu nome:");
        name = reader.nextLine();
        System.out.println("Digite o ano de nascimento:");
        birth = reader.nextInt();
        System.out.println("Digite o ano atual:");
        year = reader.nextInt();
        
        //nome
        System.out.println("seu nome é " + name);
        
        //idade atual
        age = year-birth;
        System.out.println("Sua idade é " + age + " anos");
        
        //idade em 2030
        age = 2030-birth;
        System.out.println("Sua idade em 2030 será " + age + " anos");
        
        //questão concluida
    }
}
