package pastProj.javaProjects;

import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;
import java.text.NumberFormat;

public class testingCode {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double payment;
        payment = input.nextDouble();
        while (payment < 0 || payment > Math.pow(10, 9)) {//1,000,000,000
            payment = input.nextDouble();
        }
        String paymentUS = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        String paymentCHINA = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        String paymentFRANCE = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
        String paymentINDIA = NumberFormat.getCurrencyInstance(new Locale("en","in")).format(payment);


        System.out.println("US: " + paymentUS + " \n"+
                           "India: " + paymentINDIA +" \n"+
                           "China: " + paymentCHINA +" \n"+
                           "France: "+paymentFRANCE);

        }
    }
