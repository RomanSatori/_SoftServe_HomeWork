package HW5;

public class Main_Person {
    public static void main(String[] args){
        Person person[] = {
                new Teacher(10, 20),
                new Cleaner(10, 15),
                new Student()
        };

        for (Person p: person){
            p.print();
        }

        for (Person p: person){
            if (p instanceof Staff){
                System.out.println(((Staff)p).salary());
            }
        }
    }
}

