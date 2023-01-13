package versaofinal;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class CRUD implements ICRUD {

    List<Conta> listaContas = new ArrayList<Conta>();

    @Override
    public boolean criarConta(Cliente cliente, String tipo) {

        try {
            Conta conta;
            if ("Corrente".equals(tipo)) {
                conta = new ContaCorrente(cliente);
            } else {
                conta = new ContaPoupanca(cliente);
            }

            listaContas.add(conta);
            JOptionPane.showMessageDialog(null,conta.imprimirInfos());

        } catch (Exception e) {
            return false;

        }

        return true;
    }
    
    @Override
    public boolean deletarContaPorNumero(int numero) {

        try {

            for (Conta conta : listaContas) {

                if (conta.getNumero() == numero) {
                    listaContas.remove(conta);

                }
            }

        } catch (Exception e) {
            return false;

        }

        return true;
    }

    @Override
    public List<Conta> listarContas() {
        for (Conta conta : listaContas) {
            try {
                JOptionPane.showMessageDialog(null,conta.imprimirInfos());
            } catch (ParseException ex) {
                Logger.getLogger(Teste.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("--------------------");

        }

        return listaContas;

    }

    @Override
    public boolean alterarConta(Cliente cliente, int numero, String tipo) {

        try {

            for (Conta conta1 : listaContas) {

                if (conta1.getNumero() == numero) {
                    listaContas.remove(conta1);
                    if ("Corrente".equals(tipo)) {
                        criarConta(cliente, tipo);
                    } else {
                        criarConta(cliente,tipo);
                    }

                }

            }

        } catch (Exception e) {
            return false;

        }

        return true;

    }

}
