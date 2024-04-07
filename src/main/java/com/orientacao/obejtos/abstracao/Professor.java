package com.orientacao.obejtos.abstracao;

public class Professor extends Pessoa {

    private String disciplina;

    // Construtor
    public Professor(String nome, String disciplina) {
        super(nome);
        this.disciplina = disciplina;
    }


    // Implementacao do método abstrado
    @Override
    public void exibirDetalhes() {
        System.out.println("Professor: " + nome + ", Disciplina: " + disciplina);
    }
}
