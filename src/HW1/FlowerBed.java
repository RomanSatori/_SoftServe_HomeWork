package HW1;

import java.util.Scanner;

public class FlowerBed {
    public static void main (String[] args){
        int R;
        System.out.println("Enter 'R' = ");
        Scanner sc1 = new Scanner(System.in);
        R = sc1.nextInt();

        System.out.println("S = " + (Math.PI * Math.pow(R, 2)));

        System.out.println("P = " + (2 * Math.PI * R));
    }
}
