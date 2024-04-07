package com.orientacao.obejtos.abstracao;

abstract class Pessoa {

    protected String nome;

    // Construtor
    public Pessoa(String nome ) {
        this.nome = nome;
    }

    // Método abstrato que sera impletado na subclasse
    public abstract void exibirDetalhes();
}
