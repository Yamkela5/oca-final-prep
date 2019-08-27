package oca.date_time;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalUnit;

public class AboutPeriod {

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();

        DateTimeFormatter fancyDateFormatter = DateTimeFormatter.ofPattern("dd MMM yyyy");
        System.out.println(fancyDateFormatter.format(today));

        Period ocaPrepPeriod = Period.parse("P-3M4D");

        System.out.println(fancyDateFormatter.format(today.plus(ocaPrepPeriod)));;

        Period.parse("P1Y5m89d");
        Period.parse("p1y1m1d");

        System.out.println(Period.between(today, LocalDate.parse("2019-12-25")));
        System.out.println(Period.parse("p1w"));

        // what is the date of 37 days ago from today

        System.out.println(LocalDate.now().minus(Period.parse("P37d")));;

        // what is the date in 53 months and 9 days from now
        System.out.println(LocalDate.now().plus(Period.parse("P53M9D")));;

        // what is the date of 13 years 17 months 41 days ago
        System.out.println(LocalDate.now().minus(Period.parse("P13Y17M41D")));;



//        System.out.println(today);




//        Period thePeriod = Period.parse("P-7y-7m+3d");
//        System.out.println(today.minus(thePeriod));
//        System.out.println(today.plus(thePeriod));

//        Period between = Period.between(LocalDate.now(), LocalDate.parse("2019-09-12"));
//        System.out.println(Period.parse("P3m23d").multipliedBy(7));
//        System.out.println(Period.parse("P3m23d").multipliedBy(7));

//        System.out.println(between.multipliedBy(7).getMonths());


    }
}
