package Questao10;

import Questao7.Animal;
import Questao7.Cachorro;
import Questao7.Cavalo;
import Questao7.Preguica;

public class Zoologico {
    public static void main(String[] args) {
        Animal animal[] = new Animal[10];
        
        for(int i = 0; i < 10; i++){
            if(i%2==0){
                animal[i] = new Cachorro();
            }else{
                if(i%3==0){
                    animal[i] = new Cavalo();
                }else{
                    animal[i] = new Preguica();
                }
            }
        }
        
        for(int i =0; i<10; i++){
            animal[i].emitirSom();
            animal[i].correr();
            System.out.println();
        }
    }
}
