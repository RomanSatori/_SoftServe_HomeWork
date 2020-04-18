package com.company.java8;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class dayOfTheWeek {
    public static void main(String[] args){
        LocalDate today = LocalDate.now();
        LocalDate nextWeek = today.plus(1, ChronoUnit.WEEKS);
        System.out.println(nextWeek);
        LocalDate lastMonday = today.minus(12, ChronoUnit.DAYS);
        System.out.println(lastMonday);
    }
}
