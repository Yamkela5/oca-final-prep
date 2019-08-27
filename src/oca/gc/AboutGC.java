package oca.gc;

class Car {
    @Override
    protected void finalize() throws Throwable {
        System.out.println("To be Garbage Collected");
    }

    public Car friendsCar;
}


public class AboutGC {

    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car();
        Car c3 = new Car();

        c1.friendsCar = c2;
        c2.friendsCar = c3;

        c2 = null;
        c3 = null;

        c1.friendsCar = null;
        System.gc();
        System.out.println("-----");
        c1 = null;
        System.out.println("-----");
        System.gc();
        System.out.println("-----");
        System.gc();
    }

}
