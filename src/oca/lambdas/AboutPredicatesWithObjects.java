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
}

public class AboutPredicatesWithObjects {


    public static void main(String[] args) {

        Apple[] apples = {new Apple("Red", 2.44, 67),
            new Apple("Green", 5.44, 78),
            new Apple("Yellow", 6.44, 34),
            new Apple("Red", 1.44, 71),
            new Apple("Green", 4.564, 27),
            new Apple("Red", 6.44, 45)
        };

        // find all the green apples
        Predicate<Apple> printGreenApples;

        // print Apples Cheaper Than R5.50;
        Predicate<Apple> printApplesCheaperThan550;

        // print all the green apples cheaper than R5.00



    }


}
