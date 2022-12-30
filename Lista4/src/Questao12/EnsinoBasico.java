/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao12;


public class EnsinoBasico extends FuncionarioSemEstudo{
    private String escola;

    public EnsinoBasico(String escola, String nome, int codigoFuncional) {
        super(nome, codigoFuncional);
        super.setRenda(super.getRenda()*1.10);
        this.escola = escola;
    }

    public String getEscola() {
        return escola;
    }

    public void setEscola(String escola) {
        this.escola = escola;
    }
    
    
}
