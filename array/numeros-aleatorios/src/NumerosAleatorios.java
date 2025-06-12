import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args) throws Exception {
        Random random = new Random();

        int[] numAleatorios = new int[20];

        for (int i = 0;i < numAleatorios.length; i++){
            int numero = random.nextInt(100);
            numAleatorios[i] = numero;
        }

        System.out.println("Números aleatórios: ");
        for (int numero : numAleatorios){
            System.out.print(numero + " ");
        }

        System.out.println("\nSucessores dos Números aleatórios: ");
        for (int numero : numAleatorios) {
            System.out.print((numero + 1) + " ");
        }

        System.out.println("\nAntecessores dos Números aleatórios: ");
        for (int numero : numAleatorios) {
            System.out.print((numero - 1) + " ");
        }
    }
}
