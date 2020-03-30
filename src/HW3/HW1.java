package HW3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class HW1 {
    public enum HTTP{
        OK, CREATED, ACCEPTED, NO_CONNECT, PARTIAL_CONNECT, MULTI_STATUS
    }

    public static void main(String[] args){
        float x, y, z;
        Scanner num = new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        x = num.nextFloat();
        y = num.nextFloat();
        z = num.nextFloat();

        System.out.println( x >= -5 && x <= 5 && y >=-5 && y<=5 && z>=-5 && z<=5);

        if (x>y && x>z){
            System.out.println("x - max: "+x);
        }
        else if (y>x && y>z){
            System.out.println("y - max: "+y);
        }
        else if (z>x && z>y){
            System.out.println("z - max: "+z);
        }

        if (x<y && x<z){
            System.out.println("x - min: "+x);
        }
        else if (y<x && y<z){
            System.out.println("y - min: "+y);
        }
        else if (z<y && z<x){
            System.out.println("z - min: "+z);
        }


        int error;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter http error code: (200, 201, 202, 204, 206, 207)");
        error = sc.nextInt();

        switch (error){
            case 200:
                System.out.println("HTTP 200 status_code - "+HTTP.OK);
                break;
            case 201:
                System.out.println("HTTP 201 status_code - "+HTTP.CREATED);
                break;
            case 202:
                System.out.println("HTTP 202 status_code - "+HTTP.ACCEPTED);
                break;
            case 204:
                System.out.println("HTTP 204 status_code - "+HTTP.NO_CONNECT);
                break;
            case 206:
                System.out.println("HTTP 206 status_code - "+HTTP.PARTIAL_CONNECT);
                break;
            case 207:
                System.out.println("HTTP 207 status_code - "+HTTP.MULTI_STATUS);
                break;
            default:
                System.out.println("No this error");
        }

    }
}
