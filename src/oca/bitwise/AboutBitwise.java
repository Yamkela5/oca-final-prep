package oca.bitwise;

public class AboutBitwise {
    public static void main(String[] args) {

        int a = 5;
        int b = 10;

        boolean condition1 = a > 10;
        boolean condition2 = b < 20;

        if ( condition1 ^ condition2) {
            System.out.println("go!");
        } else {
            System.out.println("no go!");
        }

        int i = 16;

        i ^= 7;

        System.out.println(i);

        int y = 16;
        System.out.println(y & 15);

        int value1 = 6;
        int value2 = 5;
        int result = value1 & value2;

        System.out.println(result);


    }
}
