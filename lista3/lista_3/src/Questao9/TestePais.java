package Questao9;

public class TestePais {

    public static void main(String[] args) {

        //inicia os objetos
        Pais eua = new Pais("Estados Unidos", "Washington", 1000);
        Pais unitedStates = new Pais("Estados Unidos", "Washington", 1000);

        //verifica se os dois países são iguais
        if (unitedStates.equals(eua)) {
            System.out.println("São iguais");
        }
        
        String[] vizinhos = {"mexico", "canada"};
        //colocar os vizinhos
        eua.setVizinhos(vizinhos);
        
        vizinhos[0] = "mexico";
        vizinhos[1] = "brasil";
        unitedStates.setVizinhos(vizinhos);
        
        for(String vizinho : eua.getVizinhos()){
            System.out.println(vizinho + " faz fronteira com " + eua.getNome());
        }
        
        for(String comum : eua.verificarVizinhosComuns(unitedStates)){
            if(comum != null){
                System.out.println(comum);
            }
        }
        
        
    }
}
