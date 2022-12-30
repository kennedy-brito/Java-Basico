/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao5;

/**
 *
 * @author LabII-10
 */
public class Teste {
    public static void main(String[] args) {
        Operario f1 = new Operario("Matheus", "Rua ceara",
                "(89)11111-1111", 0, 2000);
        
        f1.setValorProducao(2000);
        
        System.out.println("O operário " + f1.getNome() + " trabalha no setor de código " + 
                f1.getCodigoSetor());
        
        System.out.println("Seu salário base é de R$" + f1.getSalarioBase());
        
        System.out.println("Sua produçao foi de R$" + f1.getValorProducao());
        
        System.out.println("Sua comissão foi de R$" + f1.getComissao());
        
        System.out.println("Pagando " + f1.getImposto() +"% de imposto, seu salário fica R$" 
                + f1.calcularSalario());
    }
}
