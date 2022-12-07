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
public class QXIII_c {
    public static void main(String[] args) {
//      Faça três algoritmos que leiam dois números N e M, some todos os números inteiros no intervalo de N até
//      M e mostre o resultado obtido.
//      a) Resolva usando o WHILE.
//      b) Resolva usando o DO_WHILE.
//      c) Resolva usando o FOR.
        int aux, n, m, sum = 0;
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Digite dois números:");
        n = reader.nextInt();
        m = reader.nextInt();
        
        if(n>m){
            aux = n;
            n = m;
            m = aux;
        }    
        
        for( ;n<=m;n++){
            sum+=n;
        };
        
        System.out.println("resultado = " + sum);
        //letra C concluída
        
    }

}
