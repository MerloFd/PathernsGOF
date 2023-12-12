package br.com.merlofd.builder;

public class Demo {
    //onde o padrão de projeto age, ele esconde a estrutura de burguer
    //mais coesão e facilidade de alteração

    public static void main(String[] args) {
        //Gerente gerente = new Gerente(new CheeseBurgerBuilder());

        Gerente gerente = new Gerente();
        gerente.setBuilder(new CheeseBurgerBuilder());
        Burger burger = gerente.buildBurger();
        burger.print();

        //não precisa mais desse gerente1, pois o gerente ja faz o mesmo trampo com o método setter
        //Gerente gerente1 = new Gerente(new VeganBurgerBuilder());
        gerente.setBuilder(new VeganBurgerBuilder());
        Burger burger1 = gerente.buildBurger();
        burger1.print();
    }
}
