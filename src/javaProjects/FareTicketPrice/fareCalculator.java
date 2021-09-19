package javaProjects.FareTicketPrice;

import java.util.Scanner;


/*The NYC transit system has three regular fare options:
-Pay-per-ride (single ride): $2.75
-7-day Unlimited Rides: $33.00
-30-day Unlimited Rides: $127.00
-determines the best fare option AND
show how much the user would be paying per day using that particular scheme AND
 show them the discount they would be saving */

public class fareCalculator {

    public static void main(String[] args) {

        String[] scheme = new String[3];
        scheme[0] = "pay per trip";
        scheme[1] = "7 day unlimited ride";
        scheme[2] = "30 day unlimited ride";

        int temp;
        setterNgetter setORget = new setterNgetter();
        Scanner input = new Scanner(System.in);
        do {

            do {
                System.out.println("how many days would you be using the subway?");
                temp = input.nextInt();
                if (temp <= 0) {
                    System.out.println("please input a number larger than 0");
                }
            } while (temp <= 0);
            setORget.setDaysTravelling(temp);
            System.out.println(setORget.getDaysTravelling() + "day/days");
            do {
                System.out.println("how many times do you travel approximately in that " + setORget.getDaysTravelling() + " days?");
                temp = input.nextInt();
                if (temp <= 0) {
                    System.out.println("please input a number larger than 0");
                }
            } while (temp <= 0);
            setORget.setTimeTravelling(temp);
            System.out.println("you will be using the subway approximately " + setORget.getTimeTravelling() + " times/times a day for " + setORget.getTimeTravelling() + " days/days");


            if (setORget.getDaysTravelling() <= 7) {
                if (setORget.getTimeTravelling() <= 11) {
                    System.out.println(scheme[0]);
                } else if (setORget.getTimeTravelling() >= 12) {
                    System.out.println(scheme[1]);
                }

            } else if (setORget.getDaysTravelling() > 7) {
                if (setORget.getTimeTravelling() <= 12) {
                    System.out.println(scheme[0]);
                } else if (setORget.getTimeTravelling() > 12) {
                    System.out.println(scheme[1] + " + " + (setORget.getTimeTravelling() - 12) + scheme[0]);
                } else if (setORget.getTimeTravelling() >= 47) {
                    System.out.println(scheme[2]);
                }
            } else if (setORget.getDaysTravelling() >= 30) {
                if (setORget.getTimeTravelling() <= 11) {
                    System.out.println(scheme[0]);
                } else if (setORget.getTimeTravelling() > 12) {
                    System.out.println(scheme[1] + " + " + (setORget.getTimeTravelling() - 12) + scheme[0]);
                } else if (setORget.getTimeTravelling() >= 47) {
                    System.out.println(scheme[2]);
                }
            }

        }while(true);

    }

}
