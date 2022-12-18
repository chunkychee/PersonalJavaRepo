package pastProj.polymorphism.fruits;

public class apple extends pineapple {
      int boys;
     int girls;

    apple(){
        super(1,4,3);
    }

    apple(int boys, int girls){
        super();
        this.boys = boys;
        this.girls = girls;

    }
}
