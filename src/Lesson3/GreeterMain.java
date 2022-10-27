package Lesson3;

public class GreeterMain {
    public static void main(String[] args) {
        Runnable r1 = new Greeter("lol");
        Runnable r2 = new Greeter("bitch");

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        r1.run();
        r2.run();

    }
}
