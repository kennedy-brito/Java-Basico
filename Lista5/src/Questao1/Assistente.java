/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao1;

/**
 *
 * @author cliente
 */
public class Assistente extends Funcionario{

    public Assistente(String nome, String matricula, double salarioBase) {
        super(nome, matricula, salarioBase);
    }
    
    @Override
    public double calculaSalario(){
        return super.getSalarioBase();
    }
}
