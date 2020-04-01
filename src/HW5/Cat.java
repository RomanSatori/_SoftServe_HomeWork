package HW5;

public class Cat implements Animal {
    String name;

    public Cat (String name){
        this.name = name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String voice() {
        return "meu";
    }

    @Override
    public String feed() {
        return "cat feed fish";
    }


}
