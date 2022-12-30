/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao3;

/**
 *
 * @author LabII-10
 */
public class Teste {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Joao", "Rua piaui",
                "(89)99999-9999", 0, 1500);
        
        System.out.println("O funcionário " + f1.getNome() + " trabalha no setor de código " + 
                f1.getCodigoSetor());
        
        System.out.println("Seu salário base é de R$" + f1.getSalarioBase());
        
        System.out.println("Pagando " + f1.getImposto() +"% de imposto, seu salário fica R$" 
                + f1.calcularSalario());
    }
}
