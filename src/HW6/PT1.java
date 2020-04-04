package HW6;

import java.util.*;
import java.util.List;

public class PT1 {
    public static void main(String[] args){
        List <Integer> myCollection = new ArrayList<>();

        for (int i = 0; i < 10; i++){
            myCollection.add((int) (Math.random() * 30));
        }
        System.out.println("myCollection: "+myCollection);

        List <Integer> newCollection = new ArrayList<>();
        for (int i = 5; i < myCollection.size(); i++){
            newCollection.add(myCollection.get(i));
        }
        System.out.println("last 5 numbers "+newCollection);

        myCollection.add(2, 1);
        System.out.println("position 2"+" "+" elements: "+ myCollection.get(2));
        myCollection.add(8, -3);
        System.out.println("position 8"+" "+" elements: "+ myCollection.get(8));
        myCollection.add(5, -4);
        System.out.println("position 5"+" "+" elements: "+ myCollection.get(5));
        System.out.println("after insert"+myCollection);

        Iterator<Integer> it = myCollection.iterator();
        while (it.hasNext()) {
            if (it.next() >= 20) {
                it.remove();
            }
        }
        System.out.println("numbers <20: "+myCollection);

        Collections.sort(myCollection);
        System.out.println("After sort: "+myCollection);
    }


}

