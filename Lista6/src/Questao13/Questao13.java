/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao13;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author cliente
 */
/*
1- Identificar onde pode ocorrer erros
2- Tratar esses erros, usando try-catch
3- Informar ao usuário qual erro ocorreu
4- Obrigar o usuário a informar um valor correto
*/
public class Questao13 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Eu sei dividir");

        while (true) {
            try {
                dividir();
                /*SE OCORRER ERRO O QUE ESTA ABAIXO NÃO OCORRE*/
                break;
            } catch (ArithmeticException e) {
                System.out.println("<ERRO!> Não é possivel divisões por 0(zero)!");
            } catch (InputMismatchException e) {
                System.out.println("<ERRO!> por favor, digite um número inteiro!");
            } catch (Exception e){
                System.out.println(e.toString());
            }
        }
    }

    static void dividir() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o primeiro valor");
        int x = teclado.nextInt();
        
        System.out.println("Informe o segundo valor");
        int y = teclado.nextInt();

        double r = x / y;
        System.out.println("O resultado da divisão é:" + r);

    }
}
