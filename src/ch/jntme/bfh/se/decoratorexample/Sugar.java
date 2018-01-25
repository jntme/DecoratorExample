package ch.jntme.bfh.se.decoratorexample;

public class Sugar extends Beverage {

    Beverage beverage = null;

    public Sugar(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double getPrice() {
        return beverage.getPrice() + 0.1;
    }

    @Override
    public String getName() {
        return beverage.getName() + ", Sugar";
    }
}
