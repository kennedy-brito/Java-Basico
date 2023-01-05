/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao14;

/**
 *
 * @author cliente
 */
public class Conta {
    private double saldo = 0;
    private double limite = 0;

    public void deposita(double valor) {
        setSaldo(valor);
    }

    public void saca(double valor) {
        try{
            if(saldo > valor && valor < limite){
                System.out.println("Saque concluido");
                this.saldo-=valor;
            }else{
                if(saldo<valor){
                    System.out.println("saldo insuficiente");
                    throw new ContaExcecao();
                }else{
                    System.out.println("Valor acima do limite");
                    throw new ContaExcecao();
                }
            }
        }catch(ContaExcecao e){
            System.out.println(e.toString());
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {

        this.saldo += saldo;

    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
}
