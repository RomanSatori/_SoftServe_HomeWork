package HW9;

public class PT3 implements Runnable {
    private String message;

    public PT3(String message) {
        this.message = message;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(message);
        }
    }
}
