// Aplicativo simples para exibição de dados numa escola, utilizando Abstração, Encapsulamento, Herança e Polimorfismo

import br.com.dio.desafio.dominio.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Visualize os dados das pessoas da escola!");
        Professor Girafales = new Professor("Girafales", 50, 9999999, 2500.00, "Matutino","Português", 20);
        Professor Robson = new Professor("Robson", 42, 12345678, 1500.00, "Noturno", "Matemática", 40);

        Aluno Rian = new Aluno("Rian Rodrigues", 20, 5713675,"Jogos Digitais", 1, 3);
        Aluno Victor = new Aluno("Victor Ponciano", 19, 9764891,"Jogos Digitais", 2, 3);

        System.out.println("\nProfessores:");
        Girafales.exibirDados();
        Robson.exibirDados();

        System.out.println("\nAlunos:");
        Rian.exibirDados();
        Victor.exibirDados();
        
    }
}
