/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao14;

/**
 *
 * @author cliente
 */
public class Questao14 {
     public static void main(String[] args) {
        Conta minhaConta = new Conta();
        try{
         
        minhaConta.deposita(100);
        minhaConta.setLimite(100);
        minhaConta.saca(1000);   
        }catch (Exception e){
            System.out.println(e.toString());
        }
    }
}
