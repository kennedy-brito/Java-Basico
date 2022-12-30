/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao5_Ultima;

import java.util.Scanner;

/**
 *
 * @author cliente
 */
public class Teste {
    public static void main(String[] args) {
        Figura obj = null;
        
        Scanner reader = new Scanner(System.in);
        int opc;
        double x, y;
        do{
            System.out.println("Calcular a área de qual figura?"
                    + "\n1. Quadrado"
                    + "\n2. Retângulo"
                    + "\n3. Triângulo"
                    + "\n4. Losango"
                    + "\n5. Fim");
            opc = reader.nextInt();
            switch(opc){
                case 1:
                    System.out.println("Digite o lado do quadrado:");
                    obj = new Quadrado(reader.nextDouble());
                    System.out.println("Resultado: " + obj.area());
                    break;
                case 2:
                    System.out.println("Digite a base do retangulo:");
                    x = reader.nextDouble();
                    System.out.println("Digite a altura do retangulo:");
                    y = reader.nextDouble();
                    obj = new Retangulo(x, y);
                    System.out.println("Resultado: " + obj.area());
                    break;
                case 3:
                    System.out.println("Digite a base do triangulo:");
                    x = reader.nextDouble();
                    System.out.println("Digite a altura do triangulo:");
                    y = reader.nextDouble();
                    obj = new Triangulo(x, y);
                    System.out.println("Resultado: " + obj.area());
                    break;
                case 4:
                    System.out.println("Digite a diagonal maior:");
                    x = reader.nextDouble();
                    System.out.println("Digite a diagonal menor:");
                    y = reader.nextDouble();
                    obj = new Losango(x, y);
                    System.out.println("Resultado: " + obj.area());
                    break;
                default:
                    break;
            }
            
        }while(opc!=5);
        
    }
}
