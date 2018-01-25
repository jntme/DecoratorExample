package ch.jntme.bfh.se.decoratorexample;

public abstract class BeverageDecorator extends Beverage {

    Beverage beverage;

    public BeverageDecorator(Beverage article) {
        this.beverage = article;
    }

    @Override
    public double getPrice() {
        return beverage.getPrice();
    }

    @Override
    public String getName() {
        return beverage.getName();
    }
}
