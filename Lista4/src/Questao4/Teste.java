/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao4;

/**
 *
 * @author LabII-10
 */
public class Teste {
    public static void main(String[] args) {
        Administrador f1 = new Administrador("Matheus", "Rua ceara",
                "(89)11111-1111", 0, 2000, 1000);
        
        System.out.println("O administrador " + f1.getNome() + " trabalha no setor de código " + 
                f1.getCodigoSetor());
        
        System.out.println("Seu salário base é de R$" + f1.getSalarioBase());
        
        System.out.println("Sua ajuda de custo é de R$" + f1.getAjudaDeCusto());
        
        System.out.println("Pagando " + f1.getImposto() +"% de imposto, seu salário fica R$" 
                + f1.calcularSalario());
    }
}
