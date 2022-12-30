/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao2;

import Questao1.Pessoa;

public class Fornecedor extends Pessoa{
    private double valorCredito = 0;
    private double valorDivida = 0;
    
    public double obterSaldo(){
        return this.valorCredito-this.valorDivida;
    }
    
    public Fornecedor(String nome) {
        super(nome);
    }

    public Fornecedor(String nome, String telefone) {
        super(nome, telefone);
    }

    public Fornecedor(String nome, String endereco, String telefone) {
        super(nome, endereco, telefone);
    }

    public double getValorCredito() {
        return valorCredito;
    }

    public void setValorCredito(double valorCredito) {
        this.valorCredito = valorCredito;
    }

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }
    
    
}
