package polymorphism.animals;

public class animal {

    public void eat() {
        System.out.println("munch");
    }

    public void sleep() {
        System.out.println("zzzz");
    }

    public int timesToJump(int jumps, int pants) {
        return jumps + pants;
    }

    public static void main(String[] args) {
        cat kitty = new cat();
        dog doggy = new dog();

        kitty.pounce();
        kitty.poop();
        doggy.sleep();
        kitty.sleep();
        System.out.println(doggy.timesToJump(4.3,3.2));
    }
}
