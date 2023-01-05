/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao12;

/**
 *
 * @author cliente
 */
public class Questao12 {
    public static void main(String[] args) {
        System.out.println("Inicio do main");
        metodo1();
        System.out.println("fim do main");
        
    }
    public static void metodo1(){
        System.out.println("Inicio do metodo1");
        metodo2();
        System.out.println("Fimn do medoto1");
    }
    static void metodo2(){
        System.out.println("Incio do metodo2");
        int[] array = new int[10];
        
        for(int i = 0; i <= 15; i ++){
            try{
            array[i] = i;
            System.out.println(i);
            }catch (ArrayIndexOutOfBoundsException e ){
                System.out.println("<Erro> tamanho do vetor foi ultrapasado ");
            }
            
        }
        System.out.println("Fim do metodo2");
    }
}
