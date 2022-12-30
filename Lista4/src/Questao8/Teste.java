/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao8;

import Questao7.Animal;
import Questao7.Cachorro;
import Questao7.Cavalo;
import Questao7.Preguica;

/**
 *
 * @author LabII-10
 */
public class Teste {
    
    public static void barulho(Animal a){
        a.emitirSom();
    }
    
    public static void main(String[] args) {
        Animal cachorro = new Cachorro() ;
        Animal cavalo = new Cavalo() ;
        Animal preguica = new Preguica() ;
        
        barulho(cachorro);
        barulho(cavalo);
        barulho(preguica);
        
        
    }
}
                                