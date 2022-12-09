package Questao4;

public class PessoaTeste {
    public static void main(String[] args){
    
//• Criar dois objetos da classe Pessoa, um representando Albert Einstein (nascido em 14/3/1879) e o
//outro representando Isaac Newton (nascido em 4/1/1643)
//• Fazer uma classe principal que instancie os objetos, inicialize e mostre quais seriam as idades de
//Einstein e Newton caso estivessem vivos.
        Pessoa einstein = new Pessoa();
        Pessoa newton = new Pessoa();
        
        einstein.ajustaDataDeNascimento(14, 3, 1879);
        einstein.setNome("Albert Einstein");
        
        newton.ajustaDataDeNascimento(4, 1, 1643);
        newton.setNome("Isaac Newton");
        
        newton.calculaIdade(4, 12, 2022);
        einstein.calculaIdade(4, 12, 2022);
        
        System.out.println("A idade de " + newton.informaNome() + " nos dias de hoje seria " + newton.informaIdade());
        System.out.println("A idade de " + einstein.informaNome() + " nos dias de hoje seria " + einstein.informaIdade());
    }
}
