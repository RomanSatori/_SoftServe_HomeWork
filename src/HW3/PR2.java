package HW3;

import java.util.Scanner;

public class PR2 {
    public static void main (String[] args){
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Language: UA | EN | PL");
        System.out.println("Enter the number of the day of the week: ");
        num = sc.nextInt();
        switch (num){
            case 1:
                System.out.println("Понеділок, Monday, Poniedziałek");
                break;
            case 2:
                System.out.println("Вівторок, Tuesday, Wtorek");
                 break;
            case 3:
                System.out.println("Середа, Wednesday, Środa");
                break;
            case 4:
                System.out.println("Четвер, Thursday, Czwartek");
                break;
            case 5:
                System.out.println("П'ятниця, Friday, Piątek");
                break;
            case 6:
                System.out.println("Субота, Saturday, Sobota");
                break;
            case 7:
                System.out.println("Неділя, Sunday, Niedziela");
                break;
            default:
                System.out.println("No this days");
        }
    }
}
