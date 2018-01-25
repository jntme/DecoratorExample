package ch.jntme.bfh.se.decoratorexample;

public class Cream extends Beverage {

    Beverage beverage = null;

    public Cream(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double getPrice() {
        return beverage.getPrice() + 0.5;
    }

    @Override
    public String getName() {
        return beverage.getName() + ", Cream";
    }
}
