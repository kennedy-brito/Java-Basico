/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao13;

import Questao12.EnsinoBasico;
import Questao12.EnsinoMedio;
import Questao12.FuncionarioSemEstudo;
import Questao12.Graduado;

/**
 *
 * @author cliente
 */
public class Teste {

    public static void main(String[] args) {
        
        double gastoTotal;
        double gastoMedio = 0;
        double gastoBasico = 0;
        double gastoGraduado = 0;
        
        FuncionarioSemEstudo funcionario[] = new FuncionarioSemEstudo[10];
        
        for (int i = 0; i < 10; i++) {
            if (i < 4) {
                funcionario[i] = new EnsinoBasico(
                            "",
                            "",
                            1);
                
                gastoBasico+= funcionario[i].getRenda();
            } else {
                if (i < 8) {
                    funcionario[i] = new EnsinoMedio(
                            "",
                            "",
                            "",
                            2);
                    gastoMedio+= funcionario[i].getRenda();
                } else {

                    funcionario[i] = new Graduado("",
                            "",
                            "",
                            "",
                            3);
                    gastoGraduado+= funcionario[i].getRenda();
                }
            }
        }
        gastoTotal = gastoBasico + gastoGraduado + gastoMedio;
        System.out.println("O gasto com funcionarios com ensino basico é R$" + gastoBasico);
        System.out.println("O gasto com funcionarios com ensino médio é R$" + gastoMedio);
        System.out.println("O gasto com funcionarios com graduados é R$" + gastoGraduado);
    }
}
