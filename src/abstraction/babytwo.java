package abstraction;

public class babytwo extends mainClass {
    int timeToPoop;
    int timeToPlay;


    babytwo(int timeToPoop, int timeToPlay){
        super(timeToPlay);
        this.timeToPoop = timeToPoop;
        this.timeToPlay = timeToPlay;
    }

    @Override
    public void wails() {

    }

    @Override
    public int eat(int a, int b) {
        return 0;
    }

    @Override
    public boolean sleep() {
        return false;
    }

    @Override
    public double play(int b, int c) {
        return 0;
    }
}
