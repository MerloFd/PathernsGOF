package br.com.merlofd.observer;

public class TV implements Observer {

    @Override
    public void update(Subject subject) {
        System.out.println("Recebendo a notícia via TV" + subject.toString());
    }

    @Override
    public String toString() {
        return "TV{}";
    }
}