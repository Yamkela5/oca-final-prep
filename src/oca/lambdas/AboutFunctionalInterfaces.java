package oca.lambdas;

@FunctionalInterface
interface Operation {
    int op(int a, int b);
}

public class AboutFunctionalInterfaces {

    public static int doThis(Operation ops, int a, int b) {
        return ops.op(a,b);
    }

    public static void main(String[] args) {

        Operation add = (a, b) -> a+b;
        Operation minus = (a, b) -> a-b;

        System.out.println(add.op(1,2));;
        System.out.println(minus.op(1,2));;

        System.out.println(doThis(add, 9, 17));    // 26
        System.out.println(doThis(minus, 9, 17));  // -8
        System.out.println(doThis((x,y) -> x*y*2, 5, 3));  // 30



    }
}
