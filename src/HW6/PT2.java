package HW6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PT2 {
    public static void main(String[] args){
        Map <Integer, String>  employeeMap = new HashMap<>();
       employeeMap.put(1, "John");
       employeeMap.put(2, "Artur");
       employeeMap.put(3, "Denny");
       employeeMap.put(4, "Dmytro");
       employeeMap.put(5, "Roman");
       employeeMap.put(6, "Taras");
       employeeMap.put(7, "Igor");

        System.out.println(employeeMap);

        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        System.out.println("enter ID: ");
        int id = sc.nextInt();

        if (employeeMap.containsKey(id)){
            System.out.println("Name: "+employeeMap.get(id));
        }else{
            System.out.println("I can`t find user with this ID!");
        }

        System.out.println("Write name: ");
        String name = sc2.nextLine();

        if(employeeMap.containsValue(name)){
            for(Map.Entry<Integer, String> entry: employeeMap.entrySet()){
                if (name.equals(entry.getValue())){
                    System.out.println("Name = "+name+", id: "+entry.getKey());
                }
            }
        }else{
            System.out.println("I can`t find user with this ID!");
        }
    }
}
