package Questao8;

import java.util.InputMismatchException;
import java.util.Scanner;

/*Faça um programa em que:
• O usuário precise entrar com o nome completo, peso e altura.
o Exceção: peso e altura com entradas inválidas.

• Calule o IMC deste usuário e apresente na tela.
o Exceção: divisão por zero.
 */
public class Questao8 {
    public static void main(String[] args) {
        String nome;
        double peso, altura, imc;
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o nome:");
        nome = leitor.next();
        
        try{
            System.out.println("Digite o peso:");
            peso = leitor.nextDouble();
            System.out.println("Digite a altura:");
            altura = leitor.nextDouble();
            
            if(peso < 0 || altura<0){
                throw new InputMismatchException("Peso e altura devem ser positivos");
            }
            if(altura == 0){
                throw new ArithmeticException("altura não deve ser 0");
            }//Meu NetBeans não apresenta erro quando a altura é 0, ele apenas diz que o imc é Infinity
            // por isso eu lancei esse erro separado
            
            imc = peso/Math.pow(altura,2);
            System.out.println("Seu IMC é " + imc);
        }catch(ArithmeticException e){
            System.out.println(e.toString());
        }catch(InputMismatchException r){
            System.out.println(r.toString());
        }
    }
}