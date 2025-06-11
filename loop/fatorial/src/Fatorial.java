import java.util.Scanner;

public class Fatorial {
//exercicio com fatorial
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int fatorial;
        int multiplicacao = 1;

        System.out.println("Escolha um número para fatorar: ");
        fatorial = scan.nextInt();

        System.out.print(fatorial +"! = ");
        for (int i = fatorial ; i >= 1 ; i-- ){
            multiplicacao = multiplicacao * i;

        }

        System.out.println(multiplicacao);
    }
}
