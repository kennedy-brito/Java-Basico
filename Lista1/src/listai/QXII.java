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
public class QXII {
    public static void main(String[] args) {
//      O IMC – Índice de Massa Corporal é um critério da Organização Mundial de
//      Saúde para dar uma indicação sobre a condição de peso de uma pessoa 
//      adulta. A fórmula é IMC = peso / ( altura ) 2 Elabore um algoritmo que
//      leia o peso e a altura de um adulto e mostre sua condição de acordo com 
//       a tabela abaixo.
//      |1 IMC em adultos | Condição
//      |Abaixo de 18,5   | Abaixo do peso
//      |Entre 18,5 e 25  | Peso normal
//      |Entre 25 e 30    | Acima do peso
//      |Acima de 30      | obeso
        Scanner reader = new Scanner(System.in);
        double weight, heigth, result;
        
        System.out.println("Digite a altura:");
        heigth = reader.nextDouble();
        System.out.println("Digite o peso:");
        weight = reader.nextDouble();
        
        result = weight/heigth;
        
        if (result<18.5){
            System.out.println("Abaixo do peso");
        }else{ 
            if(result < 25){
                System.out.println("Peso normal");
            }else{
                if(result<30){
                    System.out.println("Acima do peso");
                }else{
                    System.out.println("Obeso");
                }
            }
        }
        //questão concluída    

    }
}
