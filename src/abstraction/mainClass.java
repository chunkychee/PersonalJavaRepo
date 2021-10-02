package abstraction;

public abstract class mainClass {
    protected int timeToCry;

    mainClass(){

    }

    mainClass(int timeToCry){
        this.timeToCry = timeToCry;
    }

    public abstract void wails();
    public abstract int eat(int a, int b);
    public abstract boolean sleep();
    public abstract double play(int b ,int c);


    public static void main(String[] args) {
        mainClass[] main = new mainClass[0];

        mainClass han = new babyone(5);
        babytwo hantwo = new babytwo(1,3);
        han.wails();
        System.out.println(han.eat(9,1));
        System.out.println(han.sleep());
        System.out.println(han.play(4,1));
        System.out.println();
    }
}