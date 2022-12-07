/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listai;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author cliente
 */
public class QII {
    public static void main(String[] args){
//        Tendo como entrada o total vendido por um funcionário no mês de abril,
//        faça um algoritmo que mostre a sua comissão e salário bruto neste mês,
//        sabendo que o seu salário base é R$1.200,00 e sua comissão é de 10%
//        sobre o total vendido.

        float selled, commission, salary, baseSalary; //vendas, comissão, salario e sálario base
        Scanner reader = new Scanner(System.in);
        
        commission = (float) 0.10;
        baseSalary = 1200;
        
        System.out.println("Digite o total de vendas:");
        selled = reader.nextFloat();
        
        commission *= selled;
       
        salary = baseSalary + commission;
        DecimalFormat deci = new DecimalFormat("0.00");
        
        System.out.println("A comissão do funcionário é R$" + deci.format(commission));
        System.out.println("O sálario do funcionário é R$" + deci.format(salary));
        
        //questão concluída
    }
}
