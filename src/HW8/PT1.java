package HW8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PT1 {
    public static void main(String[] args) {
        PT1 main = new PT1();

        int a = 0;
        int b = 0;
        try {
            BufferedReader number = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("a = ");
            a = Integer.parseInt(number.readLine());
            System.out.print("b = ");
            b = Integer.parseInt(number.readLine());
            System.out.println("S = " + main.squareRectangle(a, b));
        } catch (IOException | NumberFormatException e) {
            System.out.println("Write only positive number");
        }

    }

    public int squareRectangle(int a, int b) throws NumberFormatException {
        if ((a >= 0) && (b >= 0)) {
            return a * b;
        } else {
            throw new NumberFormatException();
        }

    }
}
