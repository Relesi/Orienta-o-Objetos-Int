package com.orientacao.obejtos.heranca;

public class Professor extends Pessoa {

   private String disciplina;

   public Professor(String nome, String disciplina) {
       super(nome);
       this.disciplina = disciplina;
   }

   public void detalhesProfessor() {
       System.out.println("Disciplina: " + disciplina);
   }

}
