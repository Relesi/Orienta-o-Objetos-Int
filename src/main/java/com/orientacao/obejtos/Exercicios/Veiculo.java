package com.orientacao.obejtos.Exercicios;

// Desenvolva um sistema simples em Java para controlar informações básicas sobre veículos.

public class Veiculo {
    private String marca;
    private String modelo;
    private int ano;
    private String cor;

    public Veiculo(String marca, String modelo, int ano, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
    }

    public void exibirDetalhes() {
        System.out.println("Marca" + marca);
        System.out.println("Modelo" + modelo);
        System.out.println("Ano" + ano);
        System.out.println("Cor" + cor);
    }
}
