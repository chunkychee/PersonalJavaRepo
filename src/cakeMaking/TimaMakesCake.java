package cakeMaking;
import java.util.Scanner;

public class TimaMakesCake {  //flour //sugar //butter //flavor,choc,banana,strawberry //
    String cakeSize;
    String cakeSizeConfirm;

    public void MakingOfCake() {
        do {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your cake size");
        String cakeSize = input.next();
        this.cakeSize = cakeSize;
        System.out.println("you have entered " + cakeSize);

            switch (cakeSize) {
                case "s":
                    System.out.println("s");
                    cakeSizeConfirm = "s";
                    break;
                case "m":
                    System.out.println("m");
                    cakeSizeConfirm = "m";
                    break;
                case "l":
                    System.out.println("l");
                    cakeSizeConfirm = "l";
                    break;
                default:
                    System.out.println("s,m,l only");
            }
        }while (!cakeSize.equals(cakeSizeConfirm));

    }


    public static void main(String[] args) {
          TimaMakesCake Tima = new TimaMakesCake();
          Tima.MakingOfCake();

    }

}
