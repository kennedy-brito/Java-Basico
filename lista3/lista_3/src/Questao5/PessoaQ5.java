package Questao5;

public class PessoaQ5 {
//5. Alterar o programa do exercício 1 para substituir o método ajustaDataDeNascimento por uma construtora.
    
    private int idade;
    private int dia;
    private int mes;
    private int ano;
    private String nome;

    public PessoaQ5(int dia, int mes, int ano){
    
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    
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
    
    
}
