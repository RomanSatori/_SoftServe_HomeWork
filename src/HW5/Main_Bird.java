package HW5;

public class Main_Bird {
    public static void main (String[] args) {
        Bird bird[] = {
                new Eagle("Brown"),
                new Penguin("Black & White", "Penguin"),
                new Swallow("Black", "Swallow"),
                new Chicken("Red", "Chicken")
        };
        for (Bird b: bird)
        b.fly();


    }
}
