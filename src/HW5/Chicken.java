package HW5;

public class Chicken extends NonFlyingBird {
    public static final boolean layEggs = true;

    public Chicken (String feathers, String name){
        name = "Chicken";
        System.out.println(name+" lay eggs "+Chicken.layEggs+" "+feathers);
        feathers = "red";
        super.fly();
        System.out.println("-------------------------");
    }
}
