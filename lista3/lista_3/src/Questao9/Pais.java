package Questao9;

import java.util.ArrayList;
import java.util.Scanner;

public class Pais {

    private String nome;
    private String capital;
    private double area;
    //letra d usando vetores
    private String[] fronteiras;
    private int qtdFronteiras = 0;
    
    //letra d usando listas
    private ArrayList<String> paisesFronteira = new ArrayList<String>();

    public Pais(String nome, String capital, double area) {
        this.nome = nome;
        this.capital = capital;
        this.area = area;
    }

    public String getNome() {
        return nome;
    }

    public int getQtdFronteiras() {
        return qtdFronteiras;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
    
    //letra b
    public boolean equals(final Pais outro){
        if( 
                this.nome.equals(outro.getNome()) && 
                this.capital.equals(outro.getCapital())
                ){
            return true;
        }
        return false;
    }
        
    //letra d usando vetores
    public void addFronteiras(){
        Scanner lerTeclado = new Scanner(System.in);

        //lendo a quantidade de paises a serem adicionados
        System.out.println("Quantos paises fazem fronteira com este pais?");
        int qtdPaises = lerTeclado.nextInt();
        lerTeclado.nextLine();//precisa dessa linha para consumir a quebra de linha
        
        String pais;
        fronteiras = new String[qtdPaises];
        //lendo o pais e o adicionando
        for (int i = 0; i < qtdPaises; i++) {
            pais = lerTeclado.nextLine();

            fronteiras[i] = pais;
            qtdFronteiras++;
        }
    }
    //letra d usando listas
    public void addPaisesFronteira(String pais) {
        paisesFronteira.add(pais);
       
    }
    
    //letra e
    public String[] getFronteiras(){
        return fronteiras;
    }
    
    public ArrayList<String> getPaisesFronteira() {

        return paisesFronteira;
    }
    
    //letra F
    public String[] fronteirasJuntas(Pais outro){
        //pega o número máximo de fronteiras possíveis
        String[] fronteirasJuntas = new String[qtdFronteiras];
        int qtdFronteirasJuntas = 0;
        
        //pega o vetor com as fronteiras do outro país
        String[] fronteirasOutro = outro.getFronteiras();
        
        //percorre o vetor de fronteiras deste país
        for(String pais : fronteiras){
            
            //percorre o vetor de fronteiras do outro país
            for(String outroPais : fronteirasOutro){
                //verifica se os dois países são iguais
                if(pais.equals(outroPais)){
                    fronteirasJuntas[qtdFronteirasJuntas] = pais;
                    qtdFronteirasJuntas++;
                }
            }
        }
        return fronteirasJuntas;
    }
    
    public ArrayList<String> fronteirasConjuntas(Pais outro){
        ArrayList<String> fronteirasConjuntas = new ArrayList<>();
        
        //pega a lista de paises que fazem fronteira com o outro país
        ArrayList<String> fronteirasOutro = outro.getPaisesFronteira();
        
        //verifica se na lista de Fronteiras do outro país há algum país que faz fronteira com este
        for(String pais : paisesFronteira){
            for(String outroPais : fronteirasOutro){
                if(outroPais.equalsIgnoreCase(pais)){
                    //se possuir adiciona na lista de fronteiras conjuntas
                    if(fronteirasConjuntas.add(pais)){
                        System.out.println(pais + " faz fronteira com os 2");
                    };
                }
            }
        }
        
        return fronteirasConjuntas;
    }
    
}
