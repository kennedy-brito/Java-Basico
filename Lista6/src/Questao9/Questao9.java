/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao9;

/**
 *
 * @author cliente
 */
public class Questao9 {
    public static void main(String[] args) {
        int[] x = new int[10];
        for (int i = 0; i < x.length; i++) {
            x[i] = i;
        } // laço para preencher o array
        try {
            for (int i = 0; i <= x.length; i++) {
                System.out.println(x[i]);
            } // laço para mostrar o array
             //esse laço possui erro de indice maior que o tamanho do vetor  
        }catch(IndexOutOfBoundsException e){
            System.out.println(e.toString() );
        }
    }
}
