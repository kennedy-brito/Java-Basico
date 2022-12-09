package Questao8;

import Questao2.Data;

public class Funcionario {
    
    private String nome;
    private String matricula;
    private double salario ;
    private Data admissao = new Data(0,0,0);
    private String CPF;
    
    public double calcularImposto(){
        double imposto = this.salario*0.11;
        
        if(this.salario>2500){
            imposto= imposto + (this.salario - 2500)*0.125;
        }
        return imposto;
    }
    
    public double calcularGanhoLiquidoMensal(){
        
        double liquido = this.salario - calcularImposto();
        return liquido;
    }
    
    public double calcularGanhoLiquidoAnual(){
        
        return 12*calcularGanhoLiquidoMensal();
    }
    
    
    public double calcularGanhoBrutoAnual(){
        return 12*this.salario;
    }
    
    public void receberAumento(double aumento){
        this.salario += this.salario*aumento/100;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void getAdmissao() {
        admissao.displayData();
    }

    public void setAdmissao(int dia, int mes, int ano) {
        this.admissao.setDia(dia);
        this.admissao.setMes(mes);
        this.admissao.setAno(ano);
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    
}
