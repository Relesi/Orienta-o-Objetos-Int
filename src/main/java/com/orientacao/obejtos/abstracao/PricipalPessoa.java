package com.orientacao.obejtos.abstracao;

public class PricipalPessoa {
    public static void main(String[] args) {
         Pessoa pessoa1 = new Aluno("Jose", 909090);
         Pessoa pessoa2 = new Professor("Maria", "Arquitetura");

         pessoa1.exibirDetalhes();
         pessoa2.exibirDetalhes();
    }
}
