package pastProj.polymorphism.fruits;


public class juicer {
    public int addFruits;
    public int sumOfFruits;
    public int a;
    public int b;

    juicer(int addFruits, int sumOfFruits) {
        this.addFruits = addFruits;
        this.sumOfFruits = sumOfFruits;

    }
    public int crushFruit(int a, int b){
        return a+b;
    }

    }