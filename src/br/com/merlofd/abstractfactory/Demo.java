package br.com.merlofd.abstractfactory;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        Customer cliente = new Customer("A", true);
        Factory factory = getFactory(cliente);
        Car car = factory.create(cliente.getGradeRequest());
        car.startEngine();
    }
    public static String leitura(String prompt) {
        System.out.println(prompt);
        Scanner s = new Scanner(System.in);
        return s.nextLine();
    }
    private static Factory getFactory(Customer cliente) {
        if (cliente.hasCompanyContract()) {
            return new ContratosFactory();
        } else {
            return new SemContratosFactory();
        }
    }
}
