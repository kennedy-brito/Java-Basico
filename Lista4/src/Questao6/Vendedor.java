/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao6;

import Questao3.Funcionario;

/**
 *
 * @author LabII-10
 */
public class Vendedor extends Funcionario{
    private double valorVendas;
    private double comissao; //comissão é de 3% do valor produzido
    
    @Override
    public double calcularSalario(){
        return comissao + super.calcularSalario();
    }
    
    /*não faz sentido colocar o valor vendido pelo funcionario na hora do cadastro dele
        pois ele ainda não iniciou o trabalho
    */
    public Vendedor(String nome, String endereco, String telefone, int codigoSetor, double salarioBase) {
        super(nome, endereco, telefone, codigoSetor, salarioBase);
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao() {
        this.comissao = this.valorVendas*3/100;
    }

    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
        setComissao();
    }
    
}
