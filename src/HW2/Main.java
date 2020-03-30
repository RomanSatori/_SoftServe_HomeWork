package HW2;

public class Main {
    public static void main (String[] args){
        Employee employee1 = new Employee("Vanya", 10, 12);
        Employee employee2 = new Employee("Andriy", 15, 16);
        Employee employee3 = new Employee("Alex", 12, 12);
        employee1.changeRate(5);

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);
        System.out.println("total sum= "+Employee.totalSum);
    }
}
