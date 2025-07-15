package br.com.dio.desafio.dominio;

public abstract class Pessoa {
    private final String nome;
    private int idade;
    private final long cpf;

    public Pessoa(String nome, int idade, long cpf){
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public long getCpf(){
        return cpf;
    }

    public abstract void exibirDados();    
}
