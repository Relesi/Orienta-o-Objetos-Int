package com.orientacao.obejtos.heranca;

public class Pessoa {

    protected String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public void detalhesPessoa() {
        System.out.println("Nome: " + nome);
    }
}
