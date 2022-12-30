/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao11;

/**
 *
 * @author cliente
 */
public class EnsinoMedio extends EnsinoBasico{
    private String escolaMedio;

    public EnsinoMedio(String escolaMedio, String escola, String nome, int codigoFuncional) {
        super(escola, nome, codigoFuncional);
        this.escolaMedio = escolaMedio;
    }

    public String getEscolaMedio() {
        return escolaMedio;
    }

    public void setEscolaMedio(String escolaMedio) {
        this.escolaMedio = escolaMedio;
    }

    
    
}
