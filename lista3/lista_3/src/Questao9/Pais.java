package Questao9;

public class Pais {

    private String nome;
    private String capital;
    private double area;
    private String[] vizinhos;
    
    public Pais(String nome, String capital, double area) {
        this.nome = nome;
        this.capital = capital;
        this.area = area;
    }

    public String getNome() {
        return nome;
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

    public String[] getVizinhos() {
        return vizinhos;
    }

    public void setVizinhos(String[] vizinhos) {
        int qtdPaises = vizinhos.length;
        int index = 0;
        
        //iniciando o vetor com o tamanho correto
        this.vizinhos = new String[qtdPaises];
        
        //Inserindo os paises exceto os paises repetidos ou se o pais é vizinho de se próprio
        for(String pais : vizinhos){
            this.vizinhos[index] = pais;
                
            index++;
        }
    
    }
    
    public String[] verificarVizinhosComuns(Pais outro){
        String[] fronteiraOutro = outro.getVizinhos();
        String[] comuns = new String[this.vizinhos.length];
        int index = 0;
        for(String pais : this.vizinhos){
            for(String outroPais : fronteiraOutro){
                if(pais.equals(outroPais)){
                    comuns[index] = pais;
                    index++;
                    break;
                }
            }
        }
        return comuns;
    }
    
}
