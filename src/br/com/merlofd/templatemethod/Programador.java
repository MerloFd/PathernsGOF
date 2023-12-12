package br.com.merlofd.templatemethod;

public class Programador extends Trabalhador{
    @Override
    protected void descansar() {
        System.out.println("Indo beber café pra codar mais um pouco...");
    }

    @Override
    protected void trabalhar() {
        System.out.println("Codando em Java papai");
    }
}
