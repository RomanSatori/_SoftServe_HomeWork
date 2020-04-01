package HW5;

public class Eagle extends FlyingBird {
    public static final boolean layEggs = false;

    public Eagle(String feathers){
        System.out.println("Eagle lay eggs: "+Eagle.layEggs);
        this.feathers = feathers;
        super.fly();
        System.out.println("------------------------------------");
    }



}
