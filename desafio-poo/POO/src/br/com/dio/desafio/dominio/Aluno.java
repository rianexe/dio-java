package br.com.dio.desafio.dominio;

public class Aluno extends Pessoa{

    private final String curso;
    private final int id;
    private int serie;

    public Aluno (String nome, int idade, long cpf, String curso, int id, int serie){
        super(nome, idade, cpf);
        this.curso = curso;
        this.id = id;
        this.serie = serie;
    }

    public String getCurso(){
        return curso;
    }

    public int getId(){
        return id;
    }

    public int getSerie(){
        return serie;
    }

    public void setSerie(int serie){
        this.serie = serie;
    }

    @Override
    public void exibirDados(){
        System.out.println(getNome() + ", " + getIdade() + ", " + getCpf() + ", " + getCurso() + ", " + getId() + ", " + getSerie());
    }

}
