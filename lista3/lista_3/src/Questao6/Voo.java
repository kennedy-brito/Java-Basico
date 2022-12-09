package Questao6;

import Questao2.Data;
import javax.swing.JOptionPane;


public class Voo {
    private int numeroVoo;
    private Data data = new Data(0,0,0);
    private int vaga = 100;
    private int[] cadeiras = new int[100]; 
    
    public Voo(int numeroVoo, int dia, int mes, int ano) {
        this.numeroVoo = numeroVoo;
        data.setDia(dia);
        data.setMes(mes);
        data.setAno(ano);
        //inicia todas as cadeira livres com 0
        for(int i =0; i < 100; i++){
            this.cadeiras[i] = 0;
        }
    }
    
    public int vagas(){
        return vaga;
    }
    public int getVoo(){
        return this.numeroVoo;
    }
    public int proximoLivre(){
    int i = 0;
    
    //valor 1 se já estiver ocupada
    while(this.cadeiras[i]==1){
        i++;
    }
    
    return i+1;
    }
    
    public boolean ocupa(int i){
        
        if(verifica(i) && this.vaga > 0){
            this.cadeiras[i] = 1;
            this.vaga = this.vaga - 1;
            JOptionPane.showMessageDialog(null, "Cadeira ocupada com sucesso");
            return true;
        }else{
            JOptionPane.showMessageDialog(null,"Cadeira ja ocupada");
            return false;
        }
    }
    
    public boolean verifica(int i){
        
        if(this.cadeiras[i] != 1){
            JOptionPane.showMessageDialog(null,"A Cadeira " + (i+1) + " está livre");
            return true;
            
        }else{
            JOptionPane.showMessageDialog(null,"A Cadeira " + (i+1) + " está ocupada");
            return false;
        }
    }
    
}
