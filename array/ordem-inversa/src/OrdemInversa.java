import java.util.Scanner;
//criando vetor de 6 numeros, e exibindo na ordem inversa

public class OrdemInversa {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int[] vetor = {12,-2,3,74,50,26};       //-> vetor de 6 elementos, porém a posição dos elementos vai de 0 a 5
        int count = 0;

        System.out.print("Exibindo vetor: ");
        while(count < (vetor.length)){        //length retorna o tamanho do array
            System.out.print(vetor[count] + " ");
            count++;    
        }

        System.out.print("\nExibindo vetor inverso: ");
        for(int i = (vetor.length - 1); i >= 0; i--) {
            System.out.print(vetor[i] + " ");
        }
    }
}
