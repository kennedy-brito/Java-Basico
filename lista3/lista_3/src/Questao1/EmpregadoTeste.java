package Questao1;

import javax.swing.JOptionPane;

public class EmpregadoTeste {
    
    public static void main(String[] args) {
//        1. Crie uma classe em Java chamada Empregado que inclui três partes de informações como variáveis de
//instância – nome (String), sobrenome (String) e um salário mensal (double). A classe deve ter um
//construtor, métodos get e set para cada variável de instância. Escreva um aplicativo de teste chamado
//EmpregadoTeste que cria dois objetos Empregado e exibe o salário anual de cada objeto. Então dê a cada
//Empregado um aumento de 10% e exiba novamente o salário anual de cada Empregado.
        
        //Teste se JOptionPane funciona na declaração do construtor
        Empregado emp1 = new Empregado(JOptionPane.showInputDialog("Digite o nome do primeiro empregado: "),
                JOptionPane.showInputDialog("Digite o sobre nome do primeiro empregado: "), 
                Double.parseDouble(JOptionPane.showInputDialog("Digite o salário do primeiro empregado: ", 00.00)));
        
        Empregado emp2 = new Empregado("", "", 0);
        
        //teste dos SET's usando JOprionPane
        emp2.setNome(JOptionPane.showInputDialog("Digite o nome do segundo empregado:"));
        emp2.setSobreNome(JOptionPane.showInputDialog("Digite o sobre nome do segundo empregado:"));
        emp2.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Digite o salário do segundo empregado:", 00.00)));
        
        //teste dos GET's
        JOptionPane.showMessageDialog(null, "O Empregado " + emp1.getNome() + " " + emp1.getSobreNome() + " tem salário anual de R$" + (12*emp1.getSalario()) );
        JOptionPane.showMessageDialog(null, "O Empregado " + emp2.getNome() + " " + emp2.getSobreNome() + " tem salário anual de R$" + (12*emp2.getSalario()) );
        
        //função que aumenta o salário
        emp1.aumentoSalario();
        emp2.aumentoSalario();
        
        //novo salario
        JOptionPane.showMessageDialog(null, "O Empregado " + emp1.getNome() + " " + emp1.getSobreNome() + " tem novo salário anual de R$" + (12*emp1.getSalario()) );
        JOptionPane.showMessageDialog(null, "O Empregado " + emp2.getNome() + " " + emp2.getSobreNome() + " tem novo salário anual de R$" + (12*emp2.getSalario()) );
        
    }
    
}
