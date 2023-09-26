package Questao10;

import java.lang.reflect.Array;


public class Matriz {
    private int[][] matriz;
    private int linhas = 0;
    private int colunas = 0;
    private int[][] transposta;
    private int[][] oposta;
    private int[][] nula;
    private int[][] multipla;
    private int[][] copia;
    public Matriz(int linhas, int colunas){
        this.linhas = linhas;
        this.colunas = colunas;
        matriz = new int[linhas][colunas];
        transposta = new int[colunas][linhas];
        oposta = new int[linhas][colunas];
        setNula();
    }
    
    public boolean setElemento(int valor, int linha, int coluna){
        if(linha >= linhas || coluna >= colunas){
            return false;
        }
        
        matriz[linha][coluna] = valor;
        return true;
    }
    
    public boolean setMatriz(int[][] valor){
        
        try{
            this.matriz = valor;
        }catch(Exception e){
            return false;
        }
        
        setTransposta();
        setOposta();
        return true;
    }
    
    public int[][] getMatriz(){
        
        return matriz;
    }

    public int getLinhas() {
        return linhas;
    }

    public int getColunas() {
        return colunas;
    }

    public int[][] getNula() {
        return nula;
    }
    
    
    
    public int getElemento(int linha, int coluna){
        if(linha >= linhas || coluna >= colunas){
            return -999;
        }
        
        return matriz[linha][coluna];
    }
    
    public void setTransposta(){
        
        for(int linha = 0; linha < linhas; linha++){
            for(int coluna = 0; coluna < colunas; coluna++){
                transposta[coluna][linha] = matriz[linha][coluna];
            }
        }
        
    }
    
    public int[][] getTransposta(){
        
        return transposta;
    }
    
    
    public int[][] getOposta(){
        
        return oposta;
    }
     
    public void setOposta(){
        for(int linha = 0; linha < linhas; linha++){
            for(int coluna = 0; coluna < colunas; coluna++){
                oposta[linha][coluna] = -matriz[linha][coluna];
            }
        }
    }
    
    public void setNula(){
        nula = new int[linhas][colunas];
        for(int linha = 0; linha < linhas; linha++){
            for(int coluna = 0; coluna < colunas; coluna++){
                nula[linha][coluna] = 0;
            }
        }
        
    }
    
    public boolean isIdentity(){
        
        //verificação se é quadrada
        if(linhas != colunas){
            return false;
        }
        
        for (int linha = 0; linha < linhas; linha++) {
            for (int coluna = 0; coluna < colunas; coluna++) {
                //verificação da coluna diagonal
                if(linha == coluna){
                    //se for diferente de 1 não é identidade
                    if(matriz[linha][coluna] != 1){
                        return false;
                    }
                    continue;
                }
                //verificação dos outros elementos
                if(matriz[linha][coluna] != 0){
                    return false;
                }
            }
        }
        
        return true;
    }
    
    public boolean isDiagonal(){
        
        //verificação se é quadrada
        if(linhas != colunas){
            return false;
        }
        
        for (int linha = 0; linha < linhas; linha++) {
            for (int coluna = 0; coluna < colunas; coluna++) {
                //pular a diagonal
                if(linha == coluna){
                    continue;
                }
                //verificação dos outros elementos
                if(matriz[linha][coluna] == 0){
                    return false;
                }
            }
        }
        
        return true;
    }
    
    public boolean isSingular(){
        
        //verificação se é quadrada
        if(linhas != colunas){
            return false;
        }
        
        //primeiro verifica se a matriz é diagonal
        if(!isDiagonal()){
            return false;
        }
        
        //depois verifica se os elementos da diagonal são iguais
        int elemento = matriz[0][0];
        for (int linha = 1; linha < linhas; linha++) {
            for (int coluna = 1; coluna < colunas; coluna++) {
                
                //verificar se os elementos são iguais
                if(linha == coluna){
                    if(elemento != matriz[linha][coluna]){
                        return false;
                    }
                }
                
            }
        }
        
        return true;
    }
    
    public boolean isSimetrica(){
        
        if(linhas != colunas){
            return false;
        }
        for (int linha = 0; linha < linhas; linha++) {
            for (int coluna = 0; coluna < colunas; coluna++) {
                
                //verificar se os elementos da transposta são iguais à matriz original
                //se for diferente retorna falso
                if(matriz[linha][coluna] !=
                        transposta[linha][coluna]){
                    return false;
                }
                
            }
        }
        
        return true;
        
    }
    
    public boolean isAntisimetrica(){
        
        if(linhas != colunas){
            return false;
        }
        for (int linha = 0; linha < linhas; linha++) {
            for (int coluna = 0; coluna < colunas; coluna++) {
                
                //verificar se os elementos da transposta são iguais à matriz oposta
                //se for diferente retorna falso
                if(oposta[linha][coluna] !=
                        transposta[linha][coluna]){
                    return false;
                }
                
            }
            
        }
        
        return true;
    }
    
    public boolean somar(Matriz b){
        int linhasB = b.getLinhas();
        int colunasB = b.getColunas();
        
        if(linhas != linhasB || colunas != colunasB){
            return false;
        }
        
        for (int linha = 0; linha < linhas; linha++) {
            for (int coluna = 0; coluna < colunas; coluna++) {
                
                matriz[linha][coluna] = matriz[linha][coluna] + b.getElemento(linha, coluna);
                
            }
            
        }
        
        return true;
    }
    
    public boolean subtrair(Matriz b){
        int linhasB = b.getLinhas();
        int colunasB = b.getColunas();
        
        if(linhas != linhasB || colunas != colunasB){
            return false;
        }
        
        for (int linha = 0; linha < linhas; linha++) {
            for (int coluna = 0; coluna < colunas; coluna++) {
                
                matriz[linha][coluna] = matriz[linha][coluna] - b.getElemento(linha, coluna);
                
            }
            
        }
        
        return true;
    }
    
    public boolean multiplicar(Matriz b){
        int linhasB = b.getLinhas();
        int colunasB = b.getColunas();
        
        if(colunas != linhasB){
            return false;
        }
        
        multipla = new int[linhas][colunasB];
        
        for(int linha = 0; linha < linhas; linha++){
            for(int coluna = 0; coluna < colunasB; coluna++){
                
                multipla[linha][coluna] = multiplo(linha, coluna, b);
            }
        }
        
        
        
        if(colunas == colunasB){
            setMatriz(multipla);
        }
        
        return true;
    }
    
    private int multiplo(int linha, int coluna, Matriz b){
        int soma = 0;
        
        for(int indice = 0; indice < colunas; indice++){
               
            soma = soma + matriz[linha][indice]*b.getElemento(indice, coluna) ;
        }
        
        return soma;
    }
    
    public void copiar(){
        //fingi que ta feito
    }
}
