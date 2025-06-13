public class Calculadora {
    //Declaração dos métodos, tem que ser fora do método main
    //Desenvolvimento de métodos para um sistema de calculadora simples
    
    public static void soma(double numero1, double numero2){
        double resultado = numero1 + numero2;
        System.out.println("O resultado da soma é: " + resultado);
    }
    
    public static void subtracao(double numero1,double numero2){
        double resultado = numero1 - numero2;
        System.out.println("O resultado da subtração é: " + resultado);
    }

    public static void multiplicacao(double numero1,double numero2){
        double resultado = numero1 * numero2;
        System.out.println("O resultado da multiplicação é: " + resultado);
    }

    public static void divisao(double numero1,double numero2){
        if (numero2 != 0){
            double resultado = numero1 / numero2;
            System.out.println("O resultado da divisão é: " + resultado);
        } else {
            System.out.println("Divisão por zero.");
        }
    }
}
