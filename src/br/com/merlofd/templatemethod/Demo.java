package br.com.merlofd.templatemethod;

public class Demo {
    public static void main (String Args []){
        Trabalhador bombeiro = new Bombeiro();
        bombeiro.executar();

        Trabalhador policial = new Policial();
        policial.executar();

        Trabalhador programadorJava = new Programador();
        programadorJava.executar();
    }

}
