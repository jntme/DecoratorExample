package ch.jntme.bfh.se.decoratorexample;

public class TallCoffee extends Beverage {

    @Override
    public double getPrice() {
        return 2.00;
    }

    @Override
    public String getName() {
        return "Tall Coffee";
    }

}
