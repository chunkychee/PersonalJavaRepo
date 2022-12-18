package pastProj.polymorphism.fruits;

public class pineapple extends juicer {
int games;
int balls;
int basket;

    pineapple() {
        super(1,5);
    }
    pineapple(int games , int balls , int basket){
        super(4,9);
        this.games = games;
        this.balls = balls;
        this.basket = basket;
    }
    public void crushFruits(){
        System.out.println("lol");
    }
}

