package HW5;

public class Cleaner extends Staff {
    public static final String TYPE_PERSON = "Cleaner";
    private int workHours;
    private int salaryPerHour;

    public Cleaner(int workHours, int salaryPerHour){
        setSalaryPerHour(salaryPerHour);
        setWorkHours(workHours);
        System.out.println(Cleaner.TYPE_PERSON);
    }

    @Override
    public int salary() {
        return getWorkHours() * getSalaryPerHour();
    }

    @Override
    public void print() {
        System.out.println("I am a cleaner.");
    }

    public int getWorkHours() {
        return workHours;
    }

    public int getSalaryPerHour() {
        return salaryPerHour;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public void setSalaryPerHour(int salaryPerHour) {
        this.salaryPerHour = salaryPerHour;
    }
}
