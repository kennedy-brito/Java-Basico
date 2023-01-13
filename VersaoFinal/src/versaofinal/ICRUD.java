package versaofinal;

import java.util.List;

public interface ICRUD {

    boolean criarConta(Cliente cliente, String tipo) ;

    boolean deletarContaPorNumero(int numero);

    List<Conta> listarContas();

    boolean alterarConta(Cliente cliente, int numero, String tipo);

}
