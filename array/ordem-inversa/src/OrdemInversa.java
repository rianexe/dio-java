import java.util.Scanner;
//criando vetor de 6 numeros, e exibindo na ordem inversa

public class OrdemInversa {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int[] vetor = new int[6];
        //int[] vetor = {12,-2,3,74,50,26};       //-> vetor de 6 elementos, porém a posição dos elementos vai de 0 a 5
        int count = 0;

        do {
            System.out.println("Digite o número " + (count + 1) + ": ");
            vetor[count] = scan.nextInt();
            count++;
        } while (count < vetor.length);

        System.out.print("Exibindo vetor: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }

        System.out.print("\nExibindo vetor inverso: ");
        for(int i = (vetor.length - 1); i >= 0; i--) {
            System.out.print(vetor[i] + " ");
        }

        scan.close();

    }
}
