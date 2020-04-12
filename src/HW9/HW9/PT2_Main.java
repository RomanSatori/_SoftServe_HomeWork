package HW9;

public class PT2_Main {
    public static void main(String[] args) throws InterruptedException {
        Runnable run1 = new PT2(5, 2000, "Hello World");
        Thread th1 = new Thread(run1);
        Runnable run2 = new PT2(5, 3000, "Peace in the peace");
        Thread th2 = new Thread(run2);

        th1.start();
        th2.start();

        th1.join();
        th2.join();

        System.out.println("My name is Roman");
    }
}
