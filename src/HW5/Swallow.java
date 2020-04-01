package HW5;

public class Swallow extends FlyingBird {
    public static final boolean layEggs = true;

    public Swallow(String feathers, String name){
        name = "Swallow";
        System.out.println(name+" lay eggs "+Swallow.layEggs+" feathers "+feathers);
        feathers = "Black";
        super.fly();
        System.out.println("------------------------------");
    }


}
