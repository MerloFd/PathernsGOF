package br.com.merlofd.builder;

public class Gerente {

    BurgerBuilder builder;

    //public Gerente(BurgerBuilder builder){
    //    this.builder = builder;
    //}

    //mesma função do constructor, porém agora ele cria o hamburguer pelo setter, sem ter que mudar o obj
    public void setBuilder(BurgerBuilder builder) {
        this.builder = builder;
    }

    public Burger buildBurger() {
        builder.buildBun();
        builder.buildMeat();
        builder.buildSalad();
        builder.buildCheese();
        builder.buildSauce();
        return builder.build();
    }
}
