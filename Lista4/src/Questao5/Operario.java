/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao5;

import Questao3.Funcionario;

public class Operario extends Funcionario{
    
    private double valorProducao;
    private double comissao; //comissão é de 5% do valor produzido
    
    @Override
    public double calcularSalario(){
        return comissao + super.calcularSalario();
    }
    
    /*não faz sentido colocar o valor produzido pelo funcionario na hora do cadastro dele
        pois ele ainda não iniciou o trabalho
    */
    public Operario(String nome, String endereco, String telefone, int codigoSetor, double salarioBase) {
        super(nome, endereco, telefone, codigoSetor, salarioBase);
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao() {
        this.comissao = this.valorProducao*5/100;
    }

    public double getValorProducao() {
        return valorProducao;
    }

    public void setValorProducao(double valorProducao) {
        this.valorProducao = valorProducao;
        setComissao();
    }
    
    
}
