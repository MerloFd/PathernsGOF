package br.com.merlofd.abstractfactory;

public class ContratosFactory extends Factory{
    @Override
    Car retrieveCar(String requestedGrade) {
        if("A".equals(requestedGrade)){
            return new Tesla(100, "", "");
        } else if ("B".equals(requestedGrade)){
            return new Audi(100,"","");
        } else {
            return null;
        }
    }
}
