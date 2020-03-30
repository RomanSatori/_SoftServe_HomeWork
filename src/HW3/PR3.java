package HW3;

import java.util.Scanner;

public class PR3 {
   public enum Continent{
       ASIA, AUSTRALIA, SOUTH_AMERICA, NORTH_AMERICA, EUROPE, AFRICA
   }


    public static void main(String[] args){
        Continent continent;
        continent = Continent.ASIA;
        String country;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of country: ");
        country = sc.nextLine();

        switch (country) {
            case "China": case "India": case "Pakistan":
                continent = Continent.ASIA; break;
            case "Australia":
                continent = Continent.AUSTRALIA; break;
            case "France": case "Switzerland": case "Germany":
                continent = Continent.EUROPE; break;
            case "USA": case "Canada": case "Mexico":
                continent = Continent.NORTH_AMERICA; break;
            case "Brazil": case "Argentina": case "Peru":
                continent = Continent.SOUTH_AMERICA; break;
            case "Nigeria": case "Egypt": case "Algeria":
                continent = Continent.AFRICA; break;
            default:
                System.out.println("No this continent");
                System.exit(0);
        }
        System.out.println(continent.name());

    }
}
