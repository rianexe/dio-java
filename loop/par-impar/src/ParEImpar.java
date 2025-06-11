import java.util.Scanner;
//leitura de N numeros, e quantidade de Pares e Impares

public class ParEImpar {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int qtdNumeros;
        int numero;
        int qtdPares = 0, qtdImpares = 0;

        System.out.println("Quantidade de números: ");
        qtdNumeros = scan.nextInt();

        int count = 0;
        do{
            System.out.println("Digite os números: ");
            numero = scan.nextInt();
                if (numero % 2 == 0){
                    qtdPares++;
                } else{
                    qtdImpares++;
                }
            count++;           
        } while (count < qtdNumeros);
        System.out.println("Pares: " + qtdPares);
        System.out.println("Impares: " + qtdImpares);
    }
}
