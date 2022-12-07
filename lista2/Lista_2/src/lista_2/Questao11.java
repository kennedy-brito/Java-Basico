package lista_2;

public class Questao11 {
    public static void main(String[] args){
//    11. Declare uma matriz 5 x 5. Preencha com 1 a diagonal principal e com 0 os demais elementos. Escreva, ao
//final, a matriz obtida.
        int[][] matriz = new int[5][5];
        for(int i =0; i < matriz.length; i++){
            for(int j =0 ; j<matriz[0].length ; j++){
                matriz[i][j] = (i == j)? 1 : 0 ;
                
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
