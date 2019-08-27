package oca.date_time;

import oca.statics.AboutStaticFields;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;


interface DoStuff {
    void go(String name);
}

public class AboutReadingDateInAndWriteItOut {

    public void go(DoStuff d ) {
        d.go("Gogo");
    }


    public static void main(String[] args) {

        DoStuff dd = (name) -> System.out.println("go go " + name);

        new AboutReadingDateInAndWriteItOut().go(dd);

        // LocalDate
        DateTimeFormatter sourceFormat =  DateTimeFormatter.ofPattern("dd MMM yyyy");
        DateTimeFormatter targetFormat =  DateTimeFormatter.ofPattern("dd MMMM yyyy");

        // read the date in in this format

        // "17 Mar 2013 23:23:12"
//        LocalDate.parse("17 Mar 2013");

        // write out - "17 March 2013"

        LocalDate theDate = LocalDate.parse("17 Mar 2013", sourceFormat);
        boolean isBefore =  theDate.isBefore(LocalDate.parse("12 Mar 2013", sourceFormat));
        System.out.println(isBefore);

        System.out.println(Period.ofYears(2).getYears());



//        System.out.println(targetFormat.format());

        dateTime();
    }


    public static void dateTime() {
        // LocalDateTime.parse("2007-12-03T10:15:30");
        // LocalDateTime.parse("12-01-2017T12:37:57");
    }

    public static void time() {
        LocalTime.parse("10:15:30");
        // LocalDateTime.parse("12-01-2017T12:37:57");
    }

}
