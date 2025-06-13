public class Main {

    public static void main(String[] args) throws Exception {

        //Utilizando métodos criados na classe Calculadora
        System.out.println("Usando a calculadora...");
        Calculadora.soma(10,15);
        Calculadora.subtracao(5,2);
        Calculadora.multiplicacao(9,6);
        Calculadora.divisao(0,2);

        //Emprestimo
        System.out.println("Empréstimo de...");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 10);

        //Mensagem
        System.out.println("Mensagens do dia...");
        Mensagem.obterMensagem(5);
        Mensagem.obterMensagem(12);
        Mensagem.obterMensagem(18);
        Mensagem.obterMensagem(0);
        Mensagem.obterMensagem(30);

    }
}
