package HW1;

import java.util.Scanner;

public class PhoneCalls {
    public static void main (String[] args){
        int c1, c2, c3, t1, t2, t3;

        Scanner cost1 = new Scanner(System.in);
        Scanner cost2 = new Scanner(System.in);
        Scanner cost3 = new Scanner(System.in);
        Scanner time1 = new Scanner(System.in);
        Scanner time2 = new Scanner(System.in);
        Scanner time3 = new Scanner(System.in);

        System.out.println("Cost 1 call");
        c1 = cost1.nextInt();

        System.out.println("Cost 2 call");
        c2 = cost2.nextInt();

        System.out.println("Cost 3 call");
        c3 = cost3.nextInt();

        System.out.println("Call duration 1");
        t1 = time1.nextInt();

        System.out.println("Call duration 2");
        t2 = time2.nextInt();

        System.out.println("Call duration 3");
        t3 = time3.nextInt();

        int sum = t1 + t2 + t3;

        System.out.println("______________________________________________________");

        System.out.println(c1 + " uah in " + t1 + " min = " + (c1 * t1));
        System.out.println(c1 + " uah in " + t2 + " min = " + (c1 * t2));
        System.out.println(c1 + " uah in " + t3 + " min = " + (c1 * t3));
        System.out.println(c1 + " uah in " + sum + " min = " + (c1 * sum));

        System.out.println("______________________________________________________");

        System.out.println(c2 + " uah in " + t1 + " min = " + (c2 * t1));
        System.out.println(c2 + " uah in " + t2 + " min = " + (c2 * t2));
        System.out.println(c2 + " uah in " + t3 + " min = " + (c2 * t3));
        System.out.println(c2 + " uah in " + sum + " min = " + (c2 * sum));

        System.out.println("________________________________________________________");

        System.out.println(c3 + " uah in " + t1 + " min = " + (c3 * t1));
        System.out.println(c3 + " uah in " + t2 + " min = " + (c3 * t2));
        System.out.println(c3 + " uah in " + t3 + " min = " + (c3 * t3));
        System.out.println(c3 + " uah in " + sum + " min = " + (c3 * sum));
    }
}
