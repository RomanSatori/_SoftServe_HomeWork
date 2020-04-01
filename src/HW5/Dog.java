package HW5;

public class Dog implements Animal {
    String name;

    public Dog(String name){
        this.name = name;
    }
    public void setName (String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String voice() {
        return "woof";
    }

    @Override
    public String feed() {
        return "dog feed meet";
    }
}
