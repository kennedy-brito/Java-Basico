/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao15;
/**
 *
 * @author cliente
 */
public class ContaExcecao extends Exception {
    
    public String toString(double saldo) {
        return "<ERRO> saque cancelado\n"
                + "O saldo da conta é " + saldo;
        //aqui é exibido o saldo
    }
}
