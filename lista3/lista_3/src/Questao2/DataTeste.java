/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao2;

/**
 *
 * @author cliente
 */
public class DataTeste {
    public static void main(String[] args){
    //    2. Crie uma classe em Java chamada Data que inclui três informações como variáveis de instância – mês
    //(int), dia (int) e ano (int). A classe deve ter métodos get e set para cada variável e um construtor que
    //inicializa as variáveis e assume que os valores fornecidos são corretos. Forneça um método displayData
    //que exibe o dia, o mês e o ano separados por barras normais ( / ). Escreva um aplicativo de teste chamado
    //DataTeste que demonstra as capacidades da classe Data.
        Data data1 = new Data( 4,12, 2022);
        
        data1.displayData();
        
    }
}
