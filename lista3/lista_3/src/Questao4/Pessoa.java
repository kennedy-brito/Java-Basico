package Questao4;

public class Pessoa {
//    Criar a classe Pessoa com as seguintes características:
//• atributos: idade e dia, mês e ano de nascimento, nome da pessoa
//• métodos:
//o o calculaIdade(), que recebe a data atual em dias, mês e anos e calcula e armazena no atributo idade a idade atual da pessoa
//o o informaIdade(), que retorna o valor da idade
//o o informaNome(), que retorna o nome da pessoa
//o o ajustaDataDeNascimento(), que recebe dia, mês e ano de nascimento como parâmetros e
//preenche nos atributos correspondentes do objeto.
//
//• Criar dois objetos da classe Pessoa, um representando Albert Einstein (nascido em 14/3/1879) e o
//outro representando Isaac Newton (nascido em 4/1/1643)
//• Fazer uma classe principal que instancie os objetos, inicialize e mostre quais seriam as idades de
//Einstein e Newton caso estivessem vivos.
    private int idade;
    private int dia;
    private int mes;
    private int ano;
    private String nome;

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void calculaIdade(int dia, int mes, int ano){
        if((dia >= this.dia && this.mes == mes ) || mes > this.mes ){
            this.idade = ano - this.ano;
         
        }else{
            this.idade = ano - this.ano - 1;
        }
        
    }
    
    public int informaIdade(){
        return this.idade;
    }
    
    public String informaNome(){
        return this.nome;
    }
    
    public void ajustaDataDeNascimento(int dia, int mes, int ano){
    
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
}
