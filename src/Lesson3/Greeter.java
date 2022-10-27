package Lesson3;

public class Greeter implements Runnable {
    private String greeting;
    public static final int reps = 8;
    private static final int delay = 100;

    public Greeter(String greeting){
        this.greeting = greeting;
    }

    @Override
    public void run() {
        for(int i = 1; i<reps; i++){
            System.out.println(i + " " + greeting);
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
