package TrabalhoFinal;

import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) throws ParseException {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        try {
            System.out.println("=== Extrato Conta Poupança ===");
            super.imprimirInfosComuns();
        } catch (ParseException ex) {
            Logger.getLogger(ContaPoupanca.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
