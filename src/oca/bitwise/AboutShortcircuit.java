package oca.bitwise;

public class AboutShortcircuit {

    public static void main(String[] args) {

        int i = 6;

        if (i < 7 & i++ > 60) {
            System.out.println("whoop!");
            System.out.println(i);
        }

        System.out.println(i);

    }
}
