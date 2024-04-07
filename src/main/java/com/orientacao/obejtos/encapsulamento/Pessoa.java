package com.orientacao.obejtos.encapsulamento;

public class Pessoa {

    // Campos privados (encapsulados)
    private String nome;
    private int idade;

    // Contrutor
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Métodos públicos para acessar e modificar campos encapsulados

    // Método para acessar nome
    public String getNome() {
        return nome;
    }

    // Método para modificar nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método para acessar idade
    public int getIdade() {
        return idade;
    }

    // Método para modifivar idade
    public void setIdade(int idade) {
        this.idade = idade;
    }

    // Método publico para ultilizar os campos encapsulados
    public void detalhes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}
