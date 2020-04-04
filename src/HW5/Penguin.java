package HW5;

public class Penguin extends NonFlyingBird {
    public static final boolean layEggs = true;

    public Penguin(String feathers, String name){
        name = "Penguin";
        System.out.println(name);
        System.out.println(name+" lay eggs: "+Penguin.layEggs+" color: "+feathers);
        feathers = "Black & White";
        super.fly();
        System.out.println("------------------------------------");
    }


}
