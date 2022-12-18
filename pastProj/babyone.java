package pastProj;

public class babyone extends mainClass {
int a;
int b;
int c;
int sum;
double playtime;
    babyone(int timeToCry) {
        super(timeToCry);
    }

    @Override
    public void wails() {
        System.out.println("han weeps" + timeToCry + "times today");
    }

    @Override
    public int eat(int a, int b) {
        return a + b;
    }

    @Override
    public boolean sleep() {
        return true;
    }

    @Override
    public double play(int b, int c) {
        playtime = b + c;
         return playtime;
    }
}
