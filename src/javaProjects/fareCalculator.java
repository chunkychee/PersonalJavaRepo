package javaProjects;
import java.util.Scanner;

/*The NYC transit system has three regular fare options:
-Pay-per-ride (single ride): $2.75
-7-day Unlimited Rides: $33.00
-30-day Unlimited Rides: $127.00
-determines the best fare option for someone visiting New York City who plans to use the NYC transit system
-show how much the user would be paying per day using that particular scheme */

public class fareCalculator {

    public static void main(String[] args) {
        int numOfDaysTravelling;
        int numOfTimeTravelling;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("how many days would you be using the subway?");
            numOfDaysTravelling = input.nextInt();
            System.out.println(input + "days");
            System.out.println("how many times do you travel approximately in that " + numOfDaysTravelling + " days?");
            numOfTimeTravelling = input.nextInt();

        } while (true);


    }
}
