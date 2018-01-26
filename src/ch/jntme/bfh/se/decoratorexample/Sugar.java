package ch.jntme.bfh.se.decoratorexample;

public class Sugar extends BeverageDecorator {


    public Sugar(Beverage article) {
        super(article);
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
