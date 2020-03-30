package HW4;

import java.util.Scanner;

public class Employee_Main {
    public static void main(String[] args){
        Employee employee1 = new Employee("Vanya", 1, 200);
        Employee employee2 = new Employee("Jora", 1, 150);
        Employee employee3 = new Employee("Petya", 1, 300);
        Employee employee4 = new Employee("Vasya", 2, 250);
        Employee employee5 = new Employee("Taras", 2, 350);

       Employee employees[] = {employee1, employee2, employee3, employee4, employee5};

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the number of department: ");
        int department_number = reader.nextInt();

        System.out.println("Employees by department number: ");
        outputEmployeesByDepartment(department_number, employees);

        System.out.println("Arranged employees by salary: ");
        arrangeEmployeesBySalary(employees);

        for (Employee e: employees){
            System.out.println(e);
        }

    }

    public static void outputEmployeesByDepartment(int department_number, Employee[] employees){
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment_number() == department_number){
                System.out.println(i);
            }
        }
    }

    public static void arrangeEmployeesBySalary(Employee[] employees){
        for (int k = 0; k < employees.length - 1; k++){
            for (int i = 0; i <employees.length - 1 ; i++ ){
                if(employees[i].getSalary() < employees[i + 1].getSalary()){
                    Employee temp = employees [i + 1];
                    employees[i + 1] = employees[i];
                    employees[i] = temp;
                }
            }
        }
    }

}
