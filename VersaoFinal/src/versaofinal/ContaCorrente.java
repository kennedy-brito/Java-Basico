package versaofinal;

import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ContaCorrente extends Conta {
    
    private double taxaDeSaque = 0.30;
    private double taxaDeTransferencia = 0.87;
    
    public ContaCorrente(Cliente cliente) throws ParseException {
        super(cliente);
    }
    // colocar a taxa ao sacar e transferir

    public void sacar(double valor) {
        try {
            if (super.getSaldo() < valor + taxaDeSaque) {
                throw new ContaException("A operação não pode ser feita, o saldo não cobre a taxa de operação!");
            }
            super.sacar(valor + taxaDeSaque);
        } catch (ContaException e) {
            System.out.println(e.toString());
        }
    }
    
    @Override
    public void transferir(double valor, Conta contaDestino) {
        try {
            if ("Corrente".equals(contaDestino.tipo())) {
                if (super.getSaldo() < valor + taxaDeSaque) {
                    throw new ContaException("A operação não pode ser feita, o saldo não cobre a taxa de operação!");
                }
                super.sacar(valor + taxaDeSaque);
                contaDestino.depositar(valor - taxaDeTransferencia);
            }
            super.transferir(valor, contaDestino);
            
        } catch (ContaException e) {
            System.out.println(e.toString());
        }
        
    }
    
    @Override
    public String tipo() {
        return "Corrente";
    }
    
    @Override
    public void imprimirExtrato() {
        try {
            System.out.println("=== Extrato Conta Corrente ===");
            super.imprimirInfosComuns();
            
        } catch (ParseException ex) {
            Logger.getLogger(ContaCorrente.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
