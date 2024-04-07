package com.orientacao.obejtos.heranca;

public class Aluno extends Pessoa {

    private int matricula;

    public Aluno(String nome, int matricula) {
        super(nome);
        this.matricula = matricula;
    }

    public void detalhesAluno() {
        System.out.println("Matricula: " + matricula);
    }

}
