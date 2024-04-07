package com.orientacao.obejtos.polimorfismo;

public class ContaPoupanca extends Pessoa {
    private String codigoBancarioContaPoupanca;

    public ContaPoupanca(String nome, String codigoBancarioContaPoupanca) {
        super(nome);
        this.codigoBancarioContaPoupanca = codigoBancarioContaPoupanca;
    }


    public void status() {
        System.out.println("Meu nome é: " + nome +"e meu codigo bancário de conta poupança é: "
                + codigoBancarioContaPoupanca);
    }
}
