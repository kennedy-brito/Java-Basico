/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao12;


public class EnsinoMedio extends EnsinoBasico{
    private String escolaMedio;

    public EnsinoMedio(String escolaMedio, String escola, String nome, int codigoFuncional) {
        super(escola, nome, codigoFuncional);
        super.setRenda(super.getRenda()*1.50);
        this.escolaMedio = escolaMedio;
    }

    public String getEscolaMedio() {
        return escolaMedio;
    }

    public void setEscolaMedio(String escolaMedio) {
        this.escolaMedio = escolaMedio;
    }

    
    
}
