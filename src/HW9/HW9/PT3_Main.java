package HW9;

public class PT3_Main {
    public static void main(String[] args)  {
        Runnable run1 = new PT3("Thread 1");
        Thread th1 = new Thread(run1);
        Runnable run2 = new PT3("Thread 2");
        Thread th2 = new Thread(run2);
        Runnable run3 = new PT3("Thread 3");
        Thread th3 = new Thread(run3);

        th1.start();
        th2.start();

        try {
            th1.join();
            th2.join();
            th3.start();
        }catch (InterruptedException ex){
            System.out.println(ex);
        }
    }
}
