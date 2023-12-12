package br.com.merlofd.abstractfactory;

public class SemContratosFactory extends Factory {
    @Override
    Car retrieveCar(String requestedGrade) {
        if("A".equals(requestedGrade)){
            return new Chevrolet(100, "", "");
        } else if ("B".equals(requestedGrade)){
            return new Volksvagen(100, "","");
        } else {
            return null;
        }
    }
}
