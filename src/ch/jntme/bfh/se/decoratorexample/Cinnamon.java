package ch.jntme.bfh.se.decoratorexample;

public class Cinnamon extends BeverageDecorator {

    public Cinnamon(Beverage article) {
        super(article);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + .5;
    }

    @Override
    public String getName() {
        return super.getName() + ", Cinnamon";
    }
}
