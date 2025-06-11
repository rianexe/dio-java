import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int tabuada = 0;

        System.out.println("Digite o número da tabuada: ");
        tabuada = scan.nextInt();

        for(int i = 1; i <= 10; i++){
            System.out.println(tabuada + " x " + i + " = " + (tabuada * i));
        }
    }
}
