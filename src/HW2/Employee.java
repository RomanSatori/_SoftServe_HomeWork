package HW2;

public class Employee {
    private String name;
    private int rate;
    private int hours;
    static double totalSum = 0;

    public Employee(){

    }

    public Employee(String name, int rate) {
        this.name = name;
        this.rate = rate;
    }

    public Employee(String name, int rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
       totalSum += (getSalary()+getBonuses());
    }

    public int getSalary(){
       return rate * hours;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", hours=" + hours +
                ", Salary=" + getSalary() +
                ", Bonuses="+ getBonuses() +
                ", sum by person="+ getTotalSalary() +
                '}';
    }

    public void changeRate(int rate){
        System.out.println("New rate: ");
        this.rate = rate;
    }

    public int getBonuses(){
        return (getSalary() * 10) / 100;
    }


    public int getTotalSalary(){
        return getBonuses() + getSalary();
    }

}


