package pastProj.cakeMaking;
import java.util.Scanner;

public class CakeSize {

    String cakeSize;
    boolean cakeSizeConfirm = true;


    public void getMakingOfCake() {
        do {

            Scanner input = new Scanner(System.in);
            System.out.println("enter your cake size");
            cakeSize = input.next().toUpperCase();


            if (cakeSize.equalsIgnoreCase("s")) {
                System.out.println("you have entered " + cakeSize);
                cakeSizeConfirm = false;

            } else if (cakeSize.equalsIgnoreCase("m")) {
                System.out.println("you have entered " + cakeSize);
                cakeSizeConfirm = false;

            } else if (cakeSize.equalsIgnoreCase("l")) {
                System.out.println("you have entered " + cakeSize);
                cakeSizeConfirm = false;

            } else {
                System.out.println("only S,M,L");


            }

        }while(cakeSizeConfirm);
        System.out.println("pass");
        setFlavourofCake();
    }

    private void setFlavourofCake(){
        String cakeFlavourConfirm = null;
        String cakeFlavour;
        Scanner inputFlavour = new Scanner(System.in);

        do {
            System.out.println("enter only 1 flavour: banana,chocolate,strawberry");
            cakeFlavour = inputFlavour.next();
            switch (cakeFlavour) {
                case "banana":
                    System.out.println("you have selected banana");
                    cakeFlavourConfirm = cakeFlavour;
                    break;
                case "chocolate":
                    System.out.println("you have selected chocolate");
                    cakeFlavourConfirm = cakeFlavour;
                    break;
                case "strawberry":
                    System.out.println("you have selected strawberry");
                    cakeFlavourConfirm = cakeFlavour;
                    break;
                default:
                    System.out.println("enter only 1 of that 3 flavour.");
                    break;
            }
        }while(!cakeFlavourConfirm.equals(cakeFlavour));
        System.out.println("making " + cakeFlavourConfirm + " cake!");
                
        }
        
    }
