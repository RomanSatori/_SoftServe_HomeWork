package HW4;

import java.util.Scanner;

public class HW1 {
    public static void main(String[] args){
        int monthDays[] = {31, 28, 31, 30, 31, 30,
                                31, 31, 30, 31, 30, 31};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of month: ");
        int number = sc.nextInt();
        number--;
        System.out.println("days in this month: "+monthDays[number]);

    }
}
