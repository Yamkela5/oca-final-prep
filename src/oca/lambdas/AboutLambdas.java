package oca.lambdas;

import java.util.function.Function;
import java.util.function.Predicate;

//@FunctionalInterface
//interface Func<T> {
//    T ff (T t);
//
//    default Func<T> and(Func<T> t) {
//        return this.ff
//    }
//
//    default void or() {
//        // return t();
//    }
//
//}




public class AboutLambdas {
    public static void main(String[] args) {

        Function<String, Integer> doIt = (name) -> name.length();
        Function<Integer, String> check = (len) -> len > 6 ? "long" : "short";

        Predicate<String> biggerThanFive = (name) -> name.length() > 5;
        Predicate<String> startsWithA = (name) -> name.startsWith("A");

        biggerThanFive.and(startsWithA).test("Andre");

        System.out.println(check.compose(doIt).apply("Andre"));

        String username = "Andre";

        if (biggerThanFive.negate().test(username)) {
            System.out.println("not bigger than 5");
        }

//        Func<String> d = (name) -> name.toUpperCase();
//        Func<String> dd = (name) -> name.toUpperCase();
//
//        d.and(dd);


    }
}
