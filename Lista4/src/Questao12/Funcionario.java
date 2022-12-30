/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao12;

import Questao11.FuncionarioSemEstudo;

/**
 *
 * @author cliente
 */
public class Funcionario extends FuncionarioSemEstudo{
    private double rendaTotal = 1000;

    public Funcionario(String nome, int codigoFuncional) {
        super(nome, codigoFuncional);
    }

    public double getRendaTotal() {
        return rendaTotal;
    }

    public void setRendaTotal(double rendaTotal) {
        this.rendaTotal = rendaTotal;
    }
    
}
