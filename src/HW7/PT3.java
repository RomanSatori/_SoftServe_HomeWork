package HW7;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PT3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5 username: ");
        String username1 = scanner.nextLine();
        System.out.println(checkWithRegExp(username1));
        String username2 = scanner.nextLine();
        System.out.println(checkWithRegExp(username2));
        String username3 = scanner.nextLine();
        System.out.println(checkWithRegExp(username3));
        String username4 = scanner.nextLine();
        System.out.println(checkWithRegExp(username4));
        String username5 = scanner.nextLine();
        System.out.println(checkWithRegExp(username5));
    }
    public static boolean checkWithRegExp(String userNameString) {
        Pattern p = Pattern.compile("^[a-z0-9_-]{3,15}$");
        Matcher m = p.matcher(userNameString);

        return m.matches();
    }
}
