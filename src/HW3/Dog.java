package HW3;

public class Dog {
    String name;
    int age;

    public enum Breed{
        AKITA, BEAGLE, PUG
    }
    public Breed breed;
    public Dog(String name, int age, Breed breed){
    this.name = name;
    this.age = age;
    this.breed = breed;
    }


    void displayInfo(){
        System.out.printf("Name: %s \n age: %s \t breed: %s \t", name, age, breed+"\n");
        System.out.println(" ");
    }

    public static void main(String[] args){
    Dog dog1 = new Dog("Moisha", 2, Breed.AKITA);
    dog1.displayInfo();
    Dog dog2 = new Dog("Moisha", 1, Breed.PUG);
    dog2.displayInfo();
    Dog dog3 = new Dog("Morgan", 3, Breed.BEAGLE);
    dog3.displayInfo();


    if ((dog1.name.equals(dog2.name)) || (dog1.name.equals(dog3.name)) || (dog2.name.equals(dog3.name))){
        System.out.println("Two dogs with the same name\n");
    }
    else{
        System.out.println("Other");
    }

    if (dog1.age > dog2.age && dog1.age > dog3.age){
        System.out.println("Dog: "+dog1.name+" "+dog1.breed +" is oldest dog");
    }
    else if (dog2.age > dog1.age && dog2.age > dog3.age){
        System.out.println("Dog: "+dog2.name+" "+dog2.breed+" is oldest dog");
    }
    else {
        System.out.println("Dog: "+dog3.name+" "+dog3.breed+" is oldest dog");
    }
    }
}
