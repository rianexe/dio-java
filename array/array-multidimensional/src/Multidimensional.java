import java.util.Random;
//gere e imprima uma matriz M 4x4 com valores aleatorios entre 0-9

public class Multidimensional {
    public static void main(String[] args) throws Exception {
        Random random = new Random();

        int[][] M = new int[4][4];      //[][] <- linha e coluna na ordem

        for (int i = 0; i < M.length; i++){
            for(int j = 0; j < M[i].length; j++){
                M[i][j] = random.nextInt(9);
            }
        }

        System.out.println("Matriz 4x4: ");
        for (int[] linha : M) {                     //foreach para percorrer os numeros da matriz
            for (int coluna : linha) {              //elemento da coluna
                System.out.print(coluna + " ");                
            }
            System.out.println();                   //usado para pular linha           
        }
    }
}
