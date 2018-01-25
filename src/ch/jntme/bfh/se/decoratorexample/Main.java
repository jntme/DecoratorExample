package ch.jntme.bfh.se.decoratorexample;

public class Main {

    public static void main(String[] args) {

        Beverage b1 = new Sugar(new Cream(new SmallCoffee()));
        System.out.println("Items: " + b1.getName());
        System.out.println("Price: " + b1.getPrice());

        Beverage b2 = new Sugar(new Cream(new TallCoffee()));
        System.out.println("Items: " + b2.getName());
        System.out.println("Price: " + b2.getPrice());
    }
}
