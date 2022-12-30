/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao1;

import java.util.Scanner;

/**
 *
 * @author cliente
 */
public class Teste {
    public static void main(String[] args) {
        Funcionario funcionarios[] = new Funcionario[3];
        Scanner reader = new Scanner(System.in);
        
        String nome;
        String matricula;
        Double salarioBase = 1000.00;//salario base sera considerado R$1000,00
        Double gastoSalario = 0.0;
        for(int i = 0; i<3; i++){
            switch(i){
                case 0:
                    System.out.println("Digite o nome do gerente: ");
                    nome = reader.nextLine();
                    System.out.println("Digite a matricula do gerente: ");
                    matricula = reader.nextLine();
                    funcionarios[i] = new Gerente(nome, matricula, salarioBase);
                    
                    gastoSalario = funcionarios[i].calculaSalario();
                    break;
                case 1:
                    System.out.println("Digite o nome do assistente: ");
                    nome = reader.nextLine();
                    System.out.println("Digite a matricula do assistente: ");
                    matricula = reader.nextLine();
                    funcionarios[i] = new Assistente(nome, matricula, salarioBase);
                    
                    gastoSalario = funcionarios[i].calculaSalario();
                    break;
                case 2:
                    System.out.println("Digite o nome do gerente: ");
                    nome = reader.nextLine();
                    System.out.println("Digite a matricula do gerente: ");
                    matricula = reader.nextLine();
                    System.out.println("Digite a comissão do vendedor: ");
                    //testando o Scanner dentro do construtor
                    funcionarios[i] = new Vendedor(nome, matricula, salarioBase, reader.nextDouble());
                    
                    gastoSalario = funcionarios[i].calculaSalario();
                    break;
            }
        }
        System.out.println("O gerente tem salario de R$" + funcionarios[0].calculaSalario());
        System.out.println("O assistente tem salario de R$" + funcionarios[1].calculaSalario());
        System.out.println("O vendedor tem salario de R$" + funcionarios[2].calculaSalario());
        System.out.println("O gasto total com o salário é de R$" + gastoSalario);
    }
}
