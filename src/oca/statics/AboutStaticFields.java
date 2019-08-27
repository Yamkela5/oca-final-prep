package oca.statics;

import oca.exceptions.AboutStaticMethods;

public class AboutStaticFields {

    public int cnt = 0;

    public static int counter = 0;

    public int count() {
        return counter;
    }

    public AboutStaticFields(){
        counter++;
//        System.out.println(counter);
    }

    public void value() {
        System.out.println(counter);
    }


    public static void main(String[] args) {

        System.out.println(counter);   // 0
        AboutStaticFields f1 = new AboutStaticFields();
        AboutStaticFields f2 = new AboutStaticFields();
        AboutStaticFields f3 = new AboutStaticFields();

        f1.value();
        f2.value();
        f3.value();

        AboutStaticFields.counter = 7;
        f1.value();
        new AboutStaticFields();
        f2.value();
        f3.value();

//        System.out.println(counter);   // 3

    }


}
