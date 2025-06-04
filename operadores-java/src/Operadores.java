public class Operadores {
    public static void main(String[] args) throws Exception {
        System.out.println("Operadores em Java");

        // Exemplo concatenação de Strings
        String nomeCompleto = "LINGUAGEM" + " JAVA";
        System.out.println(nomeCompleto);

        int numero1 = 10;       // ou +10
        int numero2 = 20;
        System.out.println("Soma: " + (numero1 + numero2)); // Exemplo de soma com concatenação

        numero1 = -numero1; // Negação do número
        System.out.println("Número Negativo: " + numero1); 

        numero1 = numero1 * -1; // Volta ao valor positivo
        System.out.println("Número Positivo: " + numero1); 

        numero1++; // Incrementa 1
        System.out.println("Número Incrementado: " + numero1);

        numero1--; // Decrementa 1
        System.out.println("Número Decrementado: " + numero1);

        boolean valor = true;
        System.out.println(!valor); // Exemplo de negação lógica

        int a = 6;
        int b = 8;

        String resultado = a == b ? "verdadeiro" : "falso"; // Operador ternário
        System.out.println("Resultado do operador ternário: " + resultado);
        /* Atribuição =
           EX: 
           String nome = "João";
           int idade = 30;
           double peso = 70.5;
           char sexo = 'M';
           Date dataNascimento = new Date();
         */
        
        /* Operadores
              Aritméticos: +, -, *, /, %
              EX:
              int soma = 5 + 3; // 8
              int subtracao = 5 - 3; // 2
              int multiplicacao = 5 * 3; // 15
              int divisao = 5 / 3; // 1 (divisão inteira)
              double divisaoReal = 5.0 / 3.0; // 1.666...
              int resto = 5 % 3; // 2 (resto da divisão)

              caso + utilizado em variáveis do tipo String, ele irá concatenar as strings
         */
         
        /* Operadores Unários
              Unários: +, -, ++, --
              EX:
              int numero = 5;
              int positivo = +numero; // 5
              int negativo = -numero; // -5
              numero++; // Incrementa 1 (6)
              numero--; // Decrementa 1 (5)
              ! operador lógico de negação
         */
        
        /* Operadores Relacionais
            Condicionais: ==, !=, >, <, >=, <=
            EX:
            int a = 5;
            int b = 10;
            boolean igual = (a == b); // false
            boolean diferente = (a != b); // true
            boolean maior = (a > b); // false
            boolean menor = (a < b); // true
            boolean maiorOuIgual = (a >= b); // false
            boolean menorOuIgual = (a <= b); // true
        */

        /* Operadores Lógicos
            Lógicos: && (E), || (OU), ! (NÃO)
            EX:
            boolean condicao1 = true;
            boolean condicao2 = false;
            boolean resultadoE = condicao1 && condicao2; // false
            boolean resultadoOu = condicao1 || condicao2; // true
            boolean resultadoNao = !condicao1; // false
        */

        }
}
