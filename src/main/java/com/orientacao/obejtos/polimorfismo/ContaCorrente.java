package com.orientacao.obejtos.polimorfismo;

public class ContaCorrente extends Pessoa {

    private int codigoBancarioContaCorrente;

    public ContaCorrente(String nome, int codigoBancarioContaCorrente) {
        super(nome);
        this.codigoBancarioContaCorrente = codigoBancarioContaCorrente;
    }


    public void status() {
        System.out.println("Meu nome é: " + nome +  "e meu codigo bancário de conta corrente é: "
                + codigoBancarioContaCorrente);
    }
}
