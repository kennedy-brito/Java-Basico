package ContaSrc;

import javax.swing.JOptionPane;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public String tipo() {
        return "Poupança";
    }

    @Override
    public void imprimirExtrato() {
        JOptionPane.showMessageDialog(null, "=== Extrato Conta Poupança ===\n"
                + super.imprimirInfos()
                + super.imprimirHistorico());
    }
}
