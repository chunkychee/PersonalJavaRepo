package abstraction;

public abstract class mainClass {
    int timeToCry;

    mainClass(int timeToCry){
        this.timeToCry = timeToCry;
    }

    public abstract void wails();
    public abstract int eat(int a, int b);
    public abstract boolean sleep();
    public abstract double play(int b ,int c);


    public static void main(String[] args) {
        mainClass[] main = {new babyone(3)};

        mainClass han = new babyone(5);
        babytwo hantwo = new babytwo(1,3);
        han.wails();
        System.out.println(han.eat(9,1));
        System.out.println(han.sleep());
        System.out.println(han.play(4,1));
        System.out.println();
    }
}