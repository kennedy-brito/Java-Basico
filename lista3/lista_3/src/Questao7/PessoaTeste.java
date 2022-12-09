package Questao7;

import javax.swing.JOptionPane;

public class PessoaTeste {
    
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa(JOptionPane.showInputDialog("Digite o nome da pessoa: "),
                Double.parseDouble(JOptionPane.showInputDialog("Digite altura da pessoa: ")),
                Double.parseDouble(JOptionPane.showInputDialog("Digite o peso da pessoa: ")),
                JOptionPane.showInputDialog("Digite o sexo da pessoa: "));
        
        pessoa1.calcularImc();
        JOptionPane.showMessageDialog(null, "Nome: " + pessoa1.getNome());
        JOptionPane.showMessageDialog(null, "Sexo: " + pessoa1.getSexo());
        JOptionPane.showMessageDialog(null, "Altura: " + pessoa1.getAltura() + " metros");
        JOptionPane.showMessageDialog(null, "peso: " + pessoa1.getPeso() + "KG");
        
        JOptionPane.showMessageDialog(null, pessoa1.toString());
    }
}
