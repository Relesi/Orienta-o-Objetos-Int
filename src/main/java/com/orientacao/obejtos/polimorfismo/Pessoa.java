package com.orientacao.obejtos.polimorfismo;

public class Pessoa {

    protected String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public void status() {
        System.out.println("Meu nome é: " + nome);
    }
}
