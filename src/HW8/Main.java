package HW8_part2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Plant> plants = new ArrayList<>();
        plants.add(new Plant(1, Color.GREEN, Type.CACTUS));
        plants.add(new Plant(2, Color.RED, Type.ROSE));
        plants.add(new Plant(3, Color.BLUE, Type.CORNFLOWER));
        plants.add(new Plant(4, Color.WHITE, Type.JASMINE));
        plants.add(new Plant(5, Color.BROWN, Type.FUNGI));
        try {
            for (Plant p : plants) {
                System.out.println(p);
                if (p.getColor() == Color.GREEN && p.getType() == Type.FUNGI ){
                    throw new ColorException("fungi can`t be green");
                } else if(p.getColor() == Color.RED && p.getType() == Type.JASMINE){
                    throw new ColorException("jasmin can`t be red");
                } else if (p.getColor() == Color.BLUE && p.getType() == Type.CACTUS){
                    throw new ColorException("Cactus can`t be blue");
                } else if (p.getColor() == Color.BROWN && p.getType() == Type.ROSE || p.getType() == Type.JASMINE){
                    throw new ColorException("ROSE and JASMINE can`t be BROWN");
                }

            }
        } catch (ColorException ce) {
            System.out.println("Check your plant color");
            System.out.println(ce.getMessage());
        } catch (TypeException te){
            System.out.println("Check your plant type");
            System.out.println(te.getMessage());
        }
    }
}
