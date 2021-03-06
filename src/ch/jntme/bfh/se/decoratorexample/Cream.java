package ch.jntme.bfh.se.decoratorexample;

public class Cream extends BeverageDecorator {

    public Cream(Beverage article) {
        super(article);
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
