import java.util.Scanner;
// programa que le um array de 6 caracteres, informando quantas consoantes foram lidas
public class Consoantes {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        String[] consoantes = new String[6];
        int qtdConsoantes = 0;

        int count = 0;
        do {
            System.out.println("Digite a letra: ");
            String letra = scan.next();

            if (!(letra.equalsIgnoreCase("a") |
                    letra.equalsIgnoreCase("e") |
                    letra.equalsIgnoreCase("i") |
                    letra.equalsIgnoreCase("o") |
                    letra.equalsIgnoreCase("u")))
                    {
                        consoantes [count] = letra;
                        qtdConsoantes++;   
                    }
            count++;
        } while(count < consoantes.length);

        System.out.println("Lendo as consoantes inseridas: ");
        for (String consoante : consoantes){
            if (consoante != null){
                System.out.print(consoante + " ");
            }
        }
        System.out.println("Quantidade de consoantes: " + qtdConsoantes);
    }
}
