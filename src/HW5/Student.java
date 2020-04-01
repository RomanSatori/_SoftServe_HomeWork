package HW5;

public class Student extends Person {
    public static final String TYPE_PERSON = "Student";

    public Student(){
        System.out.println(Student.TYPE_PERSON);
    }

    @Override
    public void print() {
        System.out.println("I am a Student.");
    }
}
