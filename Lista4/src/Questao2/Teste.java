/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao2;

public class Teste {
    public static void main(String[] args) {
        
        Fornecedor f1 = new Fornecedor("Garoto");//Fornecedor com apenas nome
        Fornecedor f2 = new Fornecedor("Lacta", "(99)99999-9999");//Fornecedor com nome e telefone
        Fornecedor f3 = new Fornecedor("Amori"," Teresina", "(88)88888-8888");//Fornecedor com nome, endereço e telefone
        
        //teste dos métodos
        System.out.println("Dados dos Fornecedores:");
        
        System.out.println("Fornecedor 1");
        System.out.println("Nome: " + f1.getNome());
        
        System.out.println("Fornecedor 2");
        System.out.println("Nome: " + f2.getNome());
        System.out.println("Telefone: " + f2.getTelefone());
        
        System.out.println("Fornecedor 3");
        System.out.println("Nome: " + f3.getNome());
        System.out.println("Endereço: " + f3.getEndereco());
        System.out.println("Telefone: " + f3.getTelefone());
        
        f3.setValorCredito(500);
        System.out.println("Credito para " + f3.getNome() +" : " + f3.getValorCredito());
        
        f3.setValorDivida(200);
        System.out.println("Divida: " + f3.getValorDivida());
        
        System.out.println("Saldo: " + f3.obterSaldo());
    }
}
