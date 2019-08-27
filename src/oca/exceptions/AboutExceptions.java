package oca.exceptions;

import java.io.IOException;

public class AboutExceptions {

    public static void main(String[] args) {

        Exception myException = new Exception();
        Throwable throwable = new Throwable();
        Throwable myThrowable = new Exception();

        // incompatible types
        // Exception ex = new Throwable();

        System.out.println( myException instanceof Throwable ); // true
        System.out.println( throwable instanceof Exception ); // false

        System.out.println( myThrowable instanceof Throwable ); // true
        System.out.println( myThrowable instanceof Exception ); // true

        Throwable err = new Error();
        Throwable ex = new Exception();

        //
        Throwable exIO = new IOException();

        System.out.println(exIO instanceof Exception);
        System.out.println(exIO instanceof Error);
        System.out.println(exIO instanceof Throwable);

        //
        System.out.println(exIO instanceof Object);

        System.out.println(new Integer(8) instanceof Object);

//         System.out.println(new Integer(8) instanceof Exception);








    }
}
