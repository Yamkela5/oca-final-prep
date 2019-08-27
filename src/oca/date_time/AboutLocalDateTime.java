package oca.date_time;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


final class MyClass {

}

//class MyOtherClass extends MyClass {
//
//}

public class AboutLocalDateTime {

    public static void main(String[] args) {

//        new MyClass();

        // gives me the current date
        LocalDate ld = LocalDate.now();
        System.out.println(ld);

        // this will fail!!!
        try {
            System.out.println(LocalDate.parse("2007-1-1"));
        } catch(Exception e) {
            e.printStackTrace();
        }

        // this will pass
        System.out.println(LocalDate.parse("2007-01-01"));

        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd MMMM yyyy");

        System.out.println(LocalDate.parse("17 Feb 2003",
                DateTimeFormatter.ofPattern("dd MMM yyyy")));

        System.out.println(LocalDate.parse("13 January 2003", dateFormat));

        System.out.println(dateFormat.format(ld));



        // watch out for this ...
        // new LocalDate();

//        new LocalTime();

//        new LocalDateTime();





    }

}
