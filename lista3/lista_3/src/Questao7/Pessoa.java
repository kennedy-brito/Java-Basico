package Questao7;

public class Pessoa {
    private String nome;
    private double altura;
    private double peso;
    private String sexo;
    private double imc;

    public Pessoa(String nome, double altura, double peso, String sexo) {
        this.nome = nome;
        this.altura = altura;
        this.peso = peso;
        this.sexo = sexo;
    }
    
    @Override
    public String toString(){
        
        String s;
        
        if(this.imc <= 18.5){
            s = "está abaixo do peso normal";
        }else{
            if(this.imc <= 25){
                s = "está com peso normal";
            }else{
                if(this.imc <= 30){
                    s = "está acima do peso normal";
                }else{
                    s = "está com obesidade";
                }
            }
        }
        
        return "A pessoa " + this.nome + " " + s;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    public void calcularImc(){
        this.imc = peso/Math.pow(altura,2);
    }
    
    
}
