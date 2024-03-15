package TrabalhoFinal;

import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ContaCorrente extends Conta {
    private double taxaDeSaque = 0.4;
    public ContaCorrente(Cliente cliente) throws ParseException {
        super(cliente);
    }
    // colocar a taxa ao sacar e transferir
    
     public void sacar(double valor) {
        try {
            if(super.getSaldo() < valor + taxaDeSaque){
                throw new ContaException("Saldo não cobre a taxa de operação");
            }
            super.sacar(valor);
        }catch(ContaException e){
            System.out.println(e.toString());
        }
     }
     
    @Override
    public void imprimirExtrato() {
        try {
            System.out.println("=== Extrato Conta Corrente ===");
            super.imprimirInfosComuns();
        } catch (ParseException ex) {
            Logger.getLogger(ContaCorrente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
