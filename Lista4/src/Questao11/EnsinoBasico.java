/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao11;

/**
 *
 * @author LabII-10
 */
public class EnsinoBasico extends FuncionarioSemEstudo{
    private String escola;

    public EnsinoBasico(String escola, String nome, int codigoFuncional) {
        super(nome, codigoFuncional);
        this.escola = escola;
    }

    public String getEscola() {
        return escola;
    }

    public void setEscola(String escola) {
        this.escola = escola;
    }
    
    
}
