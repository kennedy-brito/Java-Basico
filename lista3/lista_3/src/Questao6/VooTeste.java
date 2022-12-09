package Questao6;

import javax.swing.JOptionPane;

public class VooTeste {
    public static void main(String[] args){
        Voo voo1 = new Voo(10201, 4, 12, 2022);
        int cadeira;
        JOptionPane.showMessageDialog(null, "O numero do vôo é " + voo1.getVoo());
        
        //essa linha verifica e avisa se a cadeira está livre, se estiver livre, ocupa ela e informa o número restante de vagas
        cadeira = Integer.parseInt(JOptionPane.showInputDialog("Ocupar qual cadeira?"));
        voo1.ocupa(cadeira-1);
        
        JOptionPane.showMessageDialog(null, "O número de vagas é " + voo1.vagas());
        
        voo1.verifica(cadeira-1);
        
        JOptionPane.showMessageDialog(null, "A próxima cadeira livre é a cadeira de número " + voo1.proximoLivre());
    }
}
