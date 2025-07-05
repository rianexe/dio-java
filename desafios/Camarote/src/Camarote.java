import java.util.Scanner;

public class Camarote {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int tamanhoDaFila = leitor.nextInt();
        int pessoasNoCamarote = 0;

        while (tamanhoDaFila > 0 ){
          if(tamanhoDaFila % 2 != 0){
            pessoasNoCamarote++;
          }
          tamanhoDaFila--;
        }

        System.out.print(pessoasNoCamarote + " pessoas no camarote");
    }
}
