package Crud;

import ContaSrc.ContaPoupanca;
import ContaSrc.Conta;
import ContaSrc.ContaCorrente;
import ContaSrc.Cliente;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import versaofinal.Teste;

public class CRUD implements ICRUD {

    public static List<Conta> listaContas = new ArrayList<Conta>();

    /**
     *
     * @param cliente
     * @param tipo
     * @return
     */
//    @Override
    public static boolean criarConta(Cliente cliente, String tipo) {

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
    
//    @Override
    public static boolean deletarContaPorNumero(int numero) {

        try {
            
            for (Conta conta : listaContas) {
                int c = listaContas.indexOf(conta);
                if (conta.getNumero() == numero) {
                    int escolha = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir essa conta?\n " + conta.imprimirInfos());
                    if(escolha == 0){
                        listaContas.remove(conta);
                        break;
                    }else{
                        JOptionPane.showMessageDialog(null, "Operação Cancelada");
                    }
                }else{
                    if(c == (listaContas.size()-1)){
                        JOptionPane.showMessageDialog(null, "Conta não encontrada!");
                    }
                }
                
            }
            
        } catch (Exception e) {
            return false;

        }

        return true;
    }
    
    public static String acessarContaPorNumero(int numero) {
        
        try {
            
            for (Conta conta : listaContas) {
                int c = listaContas.indexOf(conta);
                if (conta.getNumero() == numero) {
                    return conta.imprimirInfos();
                }else{
                    if(c == (listaContas.size()-1)){
                        JOptionPane.showMessageDialog(null, "Conta não encontrada!");
                    }
                }
                
            }
            
        } catch (Exception e) {
            return "";

        }
        return "";
    }
//    @Override
    public static List<Conta> listarContas() {
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

//    @Override
    public static boolean alterarConta(Cliente cliente, int numero, String tipo) {

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
