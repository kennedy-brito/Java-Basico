/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao6;

/**
 *
 * @author LabII-10
 */
public class Teste {
    public static void main(String[] args) {
        Vendedor f1 = new Vendedor("Carlos", "Rua maranhao",
                "(89)12121-1212", 0, 2000);
        
        f1.setValorVendas(7000);
        
        System.out.println("O vendedor " + f1.getNome() + " trabalha no setor de código " + 
                f1.getCodigoSetor());
        
        System.out.println("Seu salário base é de R$" + f1.getSalarioBase());
        
        System.out.println("Suas vendas somaram R$" + f1.getValorVendas());
        
        System.out.println("Sua comissão foi de R$" + f1.getComissao());
        
        System.out.println("Pagando " + f1.getImposto() +"% de imposto, seu salário fica R$" 
                + f1.calcularSalario());
    }
}
