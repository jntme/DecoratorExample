package ch.jntme.bfh.se.decoratorexample;


public class SmallCoffee extends Beverage {
    @Override
    public double getPrice() {
        return 1.00;
    }

    @Override
    public String getName() {
        return "Small Coffee";
    }
}
