package pastProj.polymorphism.animals;

public class dog extends animal {
    double jumps;
    double pants;
    double workout;

    dog(String hairy) {
        super(hairy);
    }


    public void poop() {
        System.out.println("dogPoop");
    }

    public void bark() {
        System.out.println("woof");
    }

    public double timesToJump(double jumps, double pants) {
        return jumps + pants;
    }

    public double timesOfMeal(double jumps, double workout){
        return jumps + workout;
    }
}
