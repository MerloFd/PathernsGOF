package br.com.merlofd.templatemethod;

public class Policial extends Trabalhador{

    @Override
    protected void descansar() {
        System.out.println("Indo dormir!");
    }

    @Override
    protected void trabalhar() {
        System.out.println("Trabalhando como Policial");
    }
}
