/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao4;

import Questao3.Funcionario;

public class Administrador extends Funcionario{
    
    private double ajudaDeCusto;
    
    @Override
    public double calcularSalario(){
        return this.ajudaDeCusto + super.calcularSalario();
    }
    public Administrador(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double ajudaDeCusto) {
        super(nome, endereco, telefone, codigoSetor, salarioBase);
        this.ajudaDeCusto = ajudaDeCusto;
    }

    public double getAjudaDeCusto() {
        return ajudaDeCusto;
    }

    public void setAjudaDeCusto(double ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }
    
}
