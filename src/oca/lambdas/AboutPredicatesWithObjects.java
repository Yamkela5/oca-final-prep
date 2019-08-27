package oca.lambdas;


import java.util.function.Predicate;

class Apple {
    private String color;
    private double price;
    private int weight;

    public Apple(String color, double price, int weight) {
        this.color = color;
        this.price = price;
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return String.format("Color: %s Price: %.2f Weight: %s", color, price, weight);
    }
}

public class AboutPredicatesWithObjects {

    static void filter(Predicate<Apple> pred, Apple[] apples) {
        for(Apple apple : apples) {
            if (pred.test(apple)) {
                System.out.println(apple);
            }
        }
    }

    public static void main(String[] args) {

        Apple[] apples = {new Apple("Red", 2.44, 67),
            new Apple("Green", 5.44, 78),
            new Apple("Yellow", 6.44, 34),
            new Apple("Red", 1.44, 71),
            new Apple("Green", 4.564, 27),
            new Apple("Red", 6.44, 45)
        };

        // find all the green apples
        Predicate<Apple> printGreenApples = (apple) -> apple.getColor().equals("Green");

        filter(printGreenApples, apples);

        System.out.println("----------------");
        // print Apples Cheaper Than R5.50;
        Predicate<Apple> printApplesCheaperThan550;

        filter((apple) -> apple.getPrice() < 5.5, apples);
        System.out.println("----------------");

        Predicate<Apple> lessThan7 = (apple) -> apple.getPrice() < 7;
        Predicate<Apple> lessThan5 = (apple) -> apple.getPrice() < 5;
        Predicate<Apple> isGreen = (apple) -> apple.getColor().equals("Green");

        // print all the green apples cheaper than R5.00
        filter(lessThan5.or(isGreen), apples);




    }


}
