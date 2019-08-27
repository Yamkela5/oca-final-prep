package oca.exceptions;

public class AboutStaticMethods {
    private String name;

    public static void doStuff() {
//        System.out.println(this.name);
        throw new RuntimeException("doStuff failed...");
    }

    public void instanceMethod() {
        System.out.println(this.name);
        doStuff();
    }

    public static void main(String[] args) {

        AboutStaticMethods m = new AboutStaticMethods();
        m.instanceMethod();

    }


}
