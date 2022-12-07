
package listai;

import java.text.DecimalFormat;
import java.util.Scanner;

public class QI {

    
    public static void main(String[] args){
       /*Elaborar um programa que efetue a apresentação do valor da conversão em
        real de um valor lido em dólar. O programa deve solicitar o valor da 
        cotação do dólar e a quantidade de dólares disponível com o usuário, para
        que seja apresentado o valor em moeda brasileira. 
        */
       float dollar, real, price; //price é a cotação do dollar
       Scanner reader = new Scanner(System.in);
       
       System.out.println("Digite a quantidade de dólares:");
       dollar = reader.nextFloat();
       
       System.out.println("Digite a cotação do dólar:");
       price = reader.nextFloat();
       
       DecimalFormat deci = new DecimalFormat("0.00");
       real = dollar*price;
       
       System.out.println("$" + dollar + " = R$" + deci.format(real) );
       
       //questão concluida
    } 
    
}
