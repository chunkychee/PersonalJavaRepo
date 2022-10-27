package pastProj.javaProjects;

import java.util.Scanner;
import java.util.Arrays;
public class cardType {

    public static void main(String[] args) {
        int i;
        int numOfTypeCards;
        int counter = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("input the number of types of cards");
        numOfTypeCards = input.nextInt();
        int[] cardArray = new int[numOfTypeCards];
        System.out.println("input the pre-determine amt of cards");

        for (i = 0; i <numOfTypeCards; i++) {
            int inputcard = input.nextInt();
            if (inputcard % 2 == 0) {
                cardArray[i] = inputcard;
            } else {
                inputcard+=1;
                cardArray[i] = inputcard;
                counter+=1;
            }
            System.out.println(Arrays.toString(cardArray));
            System.out.println(counter);
        }
    }
}
