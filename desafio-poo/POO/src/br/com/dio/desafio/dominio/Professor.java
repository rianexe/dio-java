package br.com.dio.desafio.dominio;

public class Professor extends Pessoa{

    private double salario;
    private String turno;
    private final String disciplina;
    private int qtdAlunos;

    public Professor (String nome, int idade, long cpf, double salario, String turno, String disciplina, int qtdAlunos){
        super(nome, idade, cpf);
        this.disciplina = disciplina;
        this.qtdAlunos = qtdAlunos;
        this.salario = salario;
        this.turno = turno;
    }

    public String getDisciplina(){
        return disciplina;
    }

    public int getQtdAlunos(){
        return qtdAlunos;
    }

    public void setQtdAlunos(int qtdAlunos){
        this.qtdAlunos = qtdAlunos;
    }

    public double getSalario(){
        return salario;
    }

    public void setSalario(double salario){ 
        this.salario = salario; 
    }

    public String getTurno(){
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    @Override
    public void exibirDados(){
        System.out.println(getNome() + ", " + getIdade() + ", " + getCpf() + ", " + getSalario() + ", " + getTurno() + ", " + getDisciplina() + ", " + getQtdAlunos());
    }


}
