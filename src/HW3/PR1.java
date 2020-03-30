package HW3;

import java.util.Scanner;

public class PR1 {

    public static void main (String[] args){

        Scanner num1 = new Scanner(System.in);

        int x, y, z, count = 0;

        System.out.println("Write 3 number");
        System.out.println("x = ");
        x = num1.nextInt();
        System.out.println("y = ");
        y = num1.nextInt();
        System.out.println("z = ");
        z = num1.nextInt();

        if ((x % 2) == 0){
            System.out.println("First number is even");
        }
        else if ((x % 1) == 0){
            System.out.println("First number is odd");
            count++;
        }

        if ((y % 2) == 0){
            System.out.println(" 2 number is even");
        }
        else if ((y % 1) == 0){
            System.out.println(" 2 number is odd");
            count++;
        }

        if ((z % 2) == 0){
            System.out.println("3 number is even");
        }

        else if((z % 1) == 0){
            System.out.println("3 number is odd");
            count++;
        }

        System.out.println("number of odd numbers = "+count);
    }
}
