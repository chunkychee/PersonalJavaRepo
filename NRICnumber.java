import java.io.*;
import java.util.Random;
import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class NRICnumber {

    static ArrayList<String> icdigit = new ArrayList<>();

    static ArrayList<String> stringic = new ArrayList<>();
    static Random random, fivedigit;

    public static void ic() {
        int num, rand, temp;
        random = new Random();
        for (int i = 0; i < 5000; i++) {
            do {
                int randomInt = random.nextInt(99);
                temp = randomInt;
            } while (temp < 25);
            String s = "S" + String.valueOf(temp);
            stringic.add(s);
         }
    }

    public static void restIC() {
        fivedigit = new Random();
        String fivenum;
        String addfivenum;
        int addnumber;
        int addnumberr;
        int addnumberrr;
        int addnumberrrr;
        for (int i = 0; i < 5000; i++) {
            Integer fiveint = fivedigit.nextInt(99999);
            if (fiveint.toString().length() == 4) {
                addnumber = fivedigit.nextInt(9);
                fivenum = fiveint + String.valueOf(addnumber);
                String Q = fivenum + "D";
                icdigit.add(Q);
            } else if (fiveint.toString().length() == 3) {
                addnumber = fivedigit.nextInt(9);
                addnumberr = fivedigit.nextInt(9);
                fivenum = fiveint + String.valueOf(addnumber) + String.valueOf(addnumberr);
                String Q = fivenum + "D";
                icdigit.add(Q);
            } else if (fiveint.toString().length() == 2) {
                addnumber = fivedigit.nextInt(9);
                addnumberr = fivedigit.nextInt(9);
                addnumberrr = fivedigit.nextInt(9);
                fivenum = fiveint + String.valueOf(addnumber) + String.valueOf(addnumberr) + String.valueOf(addnumberrr);
                String Q = fivenum + "D";
                icdigit.add(Q);
            } else if (fiveint.toString().length() == 1) {
                addnumber = fivedigit.nextInt(9);
                addnumberr = fivedigit.nextInt(9);
                addnumberrr = fivedigit.nextInt(9);
                addnumberrrr = fivedigit.nextInt(9);
                fivenum = fiveint + String.valueOf(addnumber) + String.valueOf(addnumberr) + String.valueOf(addnumberrr) + String.valueOf(addnumberrrr);
                String Q = fivenum + "D";
                icdigit.add(Q);
            } else {
                String Q = fiveint + "D";
                icdigit.add(Q);
            }

        }
    }

    public static void main(String[] args) {
        ic();
        restIC();
        for (int i = 0; i < icdigit.size(); i++) {
            String two = String.valueOf(stringic.get(i));
            String one = String.valueOf(icdigit.get(i));
            String onetwo = two + one;
            System.out.println(onetwo);


        }

    }

}

