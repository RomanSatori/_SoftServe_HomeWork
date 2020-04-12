package HW7;

import java.util.Scanner;

public class PT2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter surname: ");
        String surname = scanner.nextLine();
        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        System.out.println("Enter patronymic");
        String patronymic = scanner.nextLine();


        System.out.println(surname + " "
                + name.substring(0, 1) + ". "
                + patronymic.substring(0, 1)+".");
        System.out.println(name);
        StringBuilder sb = new StringBuilder(name);
        sb.append(" "+surname+" ");
        sb.append(patronymic);
        System.out.println(sb);
    }
}
