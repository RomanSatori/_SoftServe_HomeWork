package HW8;

public class Main {
    public static void main(String[] args) {
        try {
            Plant plant[] = {
                    new Plant(1, "WHITE", "MOSSES"),
                    new Plant(2, "GREEN", "ALGAE"),
                    new Plant(3, "BLUE", "CONIFER"),
                    new Plant(4, "white", "FERNS"),
                    new Plant(5, "Green", "oo")
            };

            for (int i = 0; i < plant.length; i++) {
                System.out.println(plant[i]);
            }

        } catch (ColorException | TypeException ex) {
            System.err.println(ex.getMessage());
        }


    }
}