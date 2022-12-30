/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao11;

/**
 *
 * @author cliente
 */
public class Graduado extends EnsinoMedio{
    private String universidade;

    public Graduado(String universidade, String escolaMedio, String escola, String nome, int codigoFuncional) {
        super(escolaMedio, escola, nome, codigoFuncional);
        this.universidade = universidade;
    }

    public String getUniversidade() {
        return universidade;
    }

    public void setUniversidade(String universidade) {
        this.universidade = universidade;
    }
    
}
