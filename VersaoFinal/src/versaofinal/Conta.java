package versaofinal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.text.MaskFormatter;

public abstract class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 1;
    private final double LIMITE = 1000;
    private static int SEQUENCIAL = 1;
    private final SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
    private MaskFormatter mascara;

    private int agencia;
    private int numero;
    private double saldo;
    private Cliente cliente;
    private String historico = "";
    private Date data;

    public Conta(Cliente cliente) throws ParseException {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
//        mascara = new MaskFormatter("###.###.###-##");
//        mascara.setValidCharacters("0123456789");
//        mascara.setValueContainsLiteralCharacters(false);
    }

    @Override
    public void sacar(double valor) {
        try {
            if (saldo < valor) {
                throw new ContaException("Saldo insuficiente!\n");
            }
            if (valor > LIMITE) {
                throw new ContaException("Limite ultrapassado!\n");
            }
            saldo -= valor;
            data = new Date();
            historico += "\n" + formatoData.format(data) + ": Saque de R$" + valor;
        } catch (ContaException e) {
            System.out.println(e.toString());
        }
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
        data = new Date();
        historico += "\n" + formatoData.format(data) + ": Deposito de R$" + valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        try {
            if (saldo < valor) {
                throw new ContaException("Saldo insuficiente!\n");
            }
            if (valor > LIMITE) {
                throw new ContaException("Limite ultrapassado!\n");
            }
            this.sacar(valor);
            contaDestino.depositar(valor);
            data = new Date();
            historico += "\n" + formatoData.format(data) + ": Transferencia de R$" + valor
                    + " para a conta " + contaDestino.numero;
        } catch (ContaException e) {
            System.out.println(e.toString());
        }
    }

    @Override
    public String tipo() {
        return "";
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
    
    
    public String imprimirInfos() throws ParseException {
        return "Titular: " + this.cliente.getNome()
                + "\nCPF: " + this.cliente.getCPF()
                + "\nAgencia: " + this.agencia
                + "\nNumero: " + this.numero;
    }

    protected void imprimirInfosComuns() throws ParseException {
        System.out.println("\nTitular: " + this.cliente.getNome());
        System.out.println("\nCPF: " + this.cliente.getCPF());
        System.out.println("Agencia: " + this.agencia);
        System.out.println("Numero: " + this.numero);
        System.out.println(String.format("Saldo: %.2f", this.saldo));
        System.out.println("===================");
        System.out.println(historico);
        System.out.println("===================");

    }
}
