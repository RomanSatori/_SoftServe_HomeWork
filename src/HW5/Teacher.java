package HW5;

public class Teacher extends Staff {
    public static final String TYPE_PERSON = "Teacher";
    private int workHours;
    private int salaryPerHour;
    public Teacher(int workHours, int salaryPerHour){
        setSalaryPerHour(salaryPerHour);
        setWorkHours(workHours);
        System.out.println(Teacher.TYPE_PERSON);
    }

    @Override
    public int salary() {
       return getWorkHours() * getSalaryPerHour();
    }

    @Override
    public void print() {
        System.out.println("I am a teacher");
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public void setSalaryPerHour(int salaryPerHour) {
        this.salaryPerHour = salaryPerHour;
    }

    public int getWorkHours() {
        return workHours;
    }

    public int getSalaryPerHour() {
        return salaryPerHour;
    }
}
