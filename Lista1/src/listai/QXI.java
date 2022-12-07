/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listai;

import java.util.Scanner;

/**
 *
 * @author cliente
 */
public class QXI {
    public static void main(String[] args) {
        //Escreva um algoritmo que receba dois números e execute as operações abaixo, de acordo com a escolha do
        //usuário.
        
        //|Opções  |  Operação
        //|  1     |  Média aritmética entre dois números
        //|  2     |  Diferença do maior pelo menor número
        //|  3     |  Produto entre os números digitados
        //|  4     |  Divisão do primeiro pelo segundo
        
        //Se a opção for inválida, o algoritmo deve mostrar uma mensagem de erro e terminar a sua execução. Lembre-
        //se de que, na opção número 4, o segundo número deve ser diferente de zero.
        
        int i;
        double x, y, result = 0;//x, y, media, diferença, produto, divisão, resultado
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Digite dois números:");
        x = reader.nextDouble();
        y = reader.nextDouble();
        
        System.out.println("Opções:");
        System.out.println("1. Média aritmética entre dois números");
        System.out.println("2. Diferença do maior pelo menor número");
        System.out.println("3. Produto entre os números digitados");
        System.out.println("4. Divisão do primeiro pelo segundo");
        i = reader.nextInt();
        
        switch(i){
            case 1:
                result = (x+y)/2.0;
                break;
            case 2:
                result = (x<y)? y-x : x-y;
                break;
            case 3:
                result = x*y;
                break;
            case 4:
                if(y!=0){
                    result = x/y;
                }else{
                    System.out.println("não existe divisão por 0");
                }
        }
        System.out.println(result);
        
        //questão concluída
    }
}
