package HW1;

import java.util.Scanner;

public class InputOutput {
    public static void main (String[] args){
        String name, city;

        System.out.println("What is your name: ");
        Scanner n = new Scanner(System.in);
        name = n.nextLine();

        System.out.println("Where are you live, " + name);
        Scanner c = new Scanner(System.in);
        city = c.nextLine();

        System.out.println("My name is " + name + ", and i live in " + city);
    }
}
