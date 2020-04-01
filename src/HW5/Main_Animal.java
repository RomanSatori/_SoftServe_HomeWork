package HW5;

public class Main_Animal {
    public static void main (String[] args){


        Animal animals[] = {
                new Cat("Murka"),
                new Cat("Vasya"),
                new Cat("John"),
                new Cat("Jora"),
                new Dog("Morgan"),
                new Dog("Snoop"),
                new Dog("Betty"),
                new Dog("Jerry")};

        for (int i = 0; i < animals.length; i++){
            System.out.println(animals[i].voice());
            System.out.println(animals[i].feed());
        }

    }
}
