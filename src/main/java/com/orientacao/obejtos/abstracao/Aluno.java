package com.orientacao.obejtos.abstracao;

public class Aluno extends Pessoa{

    private int matricula;

    public Aluno(String nome, int matricula) {
        super(nome);
        this.matricula = matricula;
    }


    @Override
    public void exibirDetalhes() {
        System.out.println("Aluno: " + nome + "Matricula: " + matricula);
    }
}
