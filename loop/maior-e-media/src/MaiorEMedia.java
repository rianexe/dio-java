import java.util.Scanner;
//leitura de 5 numeros, identificação do maior e média entre eles

public class MaiorEMedia {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int numero;
        int maior = 0;
        int soma = 0;

        int count = 0;
        do {
            System.out.println("Insira o número: ");
            numero = scan.nextInt();           
            if(numero > maior) maior = numero;
            soma = soma + numero;
            count++;
        } while(count < 5);

        soma = soma / 5;

        System.out.println("Maior número citado: " + maior);
        System.out.println("Média: " + soma);
        
    }
}
