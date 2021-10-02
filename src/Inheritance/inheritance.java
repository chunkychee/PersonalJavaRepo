package Inheritance;

public class inheritance {

    public static void main(String[] args) {

    chicks chicken = new chicks("chicky" , 5);
    ducklings duck = new ducklings();
    calfs cow = new calfs();

    chicken.chicksCalling();
    chicken.chicksFood();

    duck.ducklingCalling();
    duck.chicksColour();
    System.out.println();

    cow.chicksCalling();
    cow.cowCalling();



    }
}
