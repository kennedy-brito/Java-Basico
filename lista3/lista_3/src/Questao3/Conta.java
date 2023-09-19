/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao3;

/**
 *
 * @author cliente
 */
public class Conta {
    public double saldo = 0;
    public String tipo = "Corrente";
    
    //inicia com o tipo padrão(Corrente)
    public Conta(double saldo) {
        this.saldo = saldo;
    }
    
    //inicia com outros tipos(Poupança)
    public Conta(double saldo, String tipo) {
        this.saldo = saldo;
        this.tipo = tipo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public boolean depositar(double valor){
        //encerra a operação se o tipo é corrente e o valor é superior a 1000, ou se o valor é negativo
        if((this.tipo.equals("Corrente") && valor>1000) || valor < 0 ){
            return false;
        }
        this.saldo = saldo + valor;
        return true;
        
    }    
    
    public boolean sacar(double valor){
        if(valor > saldo || valor < 0 ){
            return false;
        }
        this.saldo = saldo - valor;
        return true;
        
    }
    
    public boolean tranferir(double valor, Conta contaDestino){
        //se não é Corrente, significa que é poupança, e poupança pode transferir somente para poupança
        if((!this.tipo.equals("Corrente") && contaDestino.getTipo().equals("Corrente"))
                || valor < 0 
                || valor > this.saldo){
            return false;
        }
        contaDestino.setSaldo(contaDestino.getSaldo() + valor);
        this.saldo = saldo - valor;
        return true;
        
    }
}
