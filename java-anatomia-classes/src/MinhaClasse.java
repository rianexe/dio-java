public class MinhaClasse {
    //PascalCase

    /*Anotações da aula de Anatomia de Classes

          Declaração inválida de variaveis:

          int numero&um = 1;            -caractere invalido
          int 1numero = 1;              -numero no comeco
          int numero um = 1;            -espaço no meio
          int long = 1;                 -palavra reservada
          
          Declaração válida:

          int numero$um = 1;
          int numero1 = 1;
          int numeroum = 1;
          int longo = 1;
          int numero_1 = 1;

           String meuNome = "Rian";
            int anoFabricacao = 2004;
            boolean verdadeira = true;
            boolean falsa = false;
        */     

    public static void main(String[] args) {   
        System.out.println ("Aula - Anatomia de Classes");
        
        String primeiroNome = "Rian";
        String segundoNome = "Rodrigues";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome){
        //camelCase
        return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);
        //concat - concatenar
    }
}
