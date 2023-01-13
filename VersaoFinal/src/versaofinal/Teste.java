package versaofinal;

import Crud.CRUD;
import ContaSrc.Cliente;

public class Teste {

    static CRUD crud = new CRUD();

    public static void main(String[] args) {

        popularArray();
        listarCliente();
        System.out.println("#################");
        crud.deletarContaPorNumero(1);
        System.out.println("----p1----");
        listarCliente();
        System.out.println("----p2----");
        alterarCliente();
        listarCliente();
    }

    public static void alterarCliente() {
        Cliente cliente3 = new Cliente("Paulo Coelho", "123789654");

//        cliente3.setNome("Paulo Coelho");
//        cliente3.setCpf("123789654");
        crud.alterarConta(cliente3, 3, "Poupanca");
    }

    public static void popularArray() {

        Cliente cliente = new Cliente();
        Cliente cliente2 = new Cliente();
        Cliente cliente3 = new Cliente();

        cliente.setNome("Venilton");
        cliente.setCPF("123456789");
        crud.criarConta(cliente, "Corrente");

        cliente2.setNome("José");
        cliente2.setCPF("987654321");
        crud.criarConta(cliente2,"Poupanca");

        cliente3.setNome("Paulo");
        cliente3.setCPF("123789654");
        crud.criarConta(cliente3,"Corrente");

    }

    public static void listarCliente() {

        crud.listarContas();

       

    }
}
