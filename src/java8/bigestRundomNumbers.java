package com.company.java8;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class bigestRundomNumbers {
    public static void main(String[] args){
        List <Integer> numbers =  Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        IntSummaryStatistics stats = numbers.stream().mapToInt((x)->x).summaryStatistics();
        System.out.println(" "+stats.getMax());
    }
}
