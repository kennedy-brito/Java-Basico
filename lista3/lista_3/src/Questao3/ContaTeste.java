/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao3;

public class ContaTeste {
    public static void main(String[] args){
//• Crie duas contas, uma do tipo “Corrente” e outra do tipo “Poupança” com um saldo inicial qualquer.
    Conta corrente = new Conta(0); 
    Conta poupanca = new Conta(0, "Poupança"); 
    
    //• Tente depositar R$ 1.500,00 reais na conta corrente. falha
        System.out.println("Depositar R$1.500,00 na corrente");
        if(corrente.depositar(1500)){
            System.out.println("Operação concluída");
        }
        else{
            System.out.println("Operação cancelada");
        }
        System.out.println("");
        
    //• Tente depositar R$ 1.500,00 reais na conta poupança. conclui
        System.out.println("Depositar R$1.500,00 na poupança");
        if(poupanca.depositar(1500)){
            System.out.println("Operação concluída");
        }
        else{
            System.out.println("Operação cancelada");
        }
        System.out.println("");
        
    //• Deposite R$ 98,52 na conta poupança. conclui
        System.out.println("Depositar R$98,52 na poupança");
        if(poupanca.depositar(98.52)){
            System.out.println("Operação concluída");
        }
        else{
            System.out.println("Operação cancelada");
        }
        System.out.println("");
        
    //• Tente sacar R$ 100,00 da poupança. conclui
        System.out.println("Sacar R$100,00 na poupança");
        if(poupanca.sacar(100)){
            System.out.println("Operação concluída");
        }
        else{
            System.out.println("Operação cancelada");
        }
        System.out.println("");
        
    //• Transfira R$ 1.800,00 da corrente para a conta poupança. falha        
        System.out.println("Transferir R$1.800,00 da corrente para a poupança");
        if(corrente.tranferir(1800, poupanca)){
            System.out.println("Operação concluída");
        }
        else{
            System.out.println("Operação cancelada");
        }
        System.out.println("");
        
    //• Transfira R$ 700,00 da poupança para a conta corrente. falha
        System.out.println("Transferir R$700,00 da poupança para a corrente");
        if(poupanca.tranferir(700, corrente)){
            System.out.println("Operação concluída");
        }
        else{
            System.out.println("Operação cancelada");
        }
        System.out.println("");
        
    //• Saque R$ 1.000,00 da corrente. falha
        System.out.println("Sacar R$1.000 da corrente");
        if(corrente.sacar(1000)){
            System.out.println("Operação concluída");
        }else{
            System.out.println("Operação cancelada");
        }
    }
}
