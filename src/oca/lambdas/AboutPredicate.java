package oca.lambdas;

import java.util.function.Predicate;

public class AboutPredicate {

    public static void filter(Predicate<Integer> filterFunc, int[] numbers) {
        System.out.println("------------");
        for(int n : numbers) {
            if (filterFunc.test(n)) {
                System.out.print(n);
                System.out.print(" ");
            }
        }
        System.out.println();
        System.out.println("------------");

    }

    public static void main(String[] args) {

        String names[] = {"Richard", "Nathri", "Lunga", "Ziyanda", "Vusi"};

        int numbers[] = {345,87,123,543,123,765,424};

        Predicate<String> namesShorterThanSix = (name) -> name.length() < 6;
        Predicate<Integer> lessThan400 = (number) -> number < 400;

        for(String name: names) {
            if (namesShorterThanSix.test(name)){
                System.out.println(name);
            }
        }
        System.out.println();
        System.out.println("------------");

        for(int n : numbers) {
            if (lessThan400.test(n)) {
                System.out.print(n);
                System.out.print(" ");
            }

        }

        System.out.println("------------");



        filter(lessThan400, numbers);
        filter((n) -> n < 100 , numbers);

    }
}
