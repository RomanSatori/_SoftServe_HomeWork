package HW2;

import java.time.LocalDate;
import java.util.Scanner;

public class Person {
    private String firstName;
    int age;
    private String lastName;
    private int birthYear;
    Scanner sc1 = new Scanner(System.in);


    public Person(){

    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }


    public void input(){
        System.out.println(" Name: ");
        firstName = sc1.nextLine();
        System.out.println(" Surname: ");
        lastName = sc1.nextLine();
        System.out.println(" birth year: ");
        birthYear = sc1.nextInt();
    }
    public int getAge(){
        LocalDate localDate = LocalDate.now();
        age =  localDate.getYear() - birthYear;
        System.out.println("age: "+age);
        return age;

    }

    public void output(){
        System.out.println(" Name: "+ firstName
                            + ", Surname: "+lastName
                            + ", birth year: "+birthYear
                            + ", age: "+getAge());
    }

        public void changeName(String fn, String ln){
        firstName = fn;
        lastName = ln;
            System.out.println("first name: "+fn+"last name: "+ln);
        }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthYear=" + birthYear+
                '}';
    }
}
