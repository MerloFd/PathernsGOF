package br.com.merlofd.templatemethod;

public abstract class Trabalhador {

    public void executar(){
        iniciarRotina();
        levantar();
        irAoTrabalho();
        trabalhar();
        voltarParaCasa();
        descansar();
    }

    protected abstract void descansar();


    protected abstract void trabalhar();

    private void voltarParaCasa() {
        System.out.println("Voltando pra casa");
    }

    private void irAoTrabalho() {
        System.out.println("Indo trabalhar");
    }

    private void iniciarRotina(){
        System.out.println("Iniciando rotina!");
    }
    private void levantar(){
        System.out.println("Levantando da cama!");
    }

}
