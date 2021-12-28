package javaProjects;

import java.util.Scanner;
public class sadadsa {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s1;
        String s2;
        String s3;
        int num1;
        int num2;
        int num3;
        String tempnum1;
        String tempnum2;
        String tempnum3;
        do {
            s1 = input.nextLine();
            s2 = input.nextLine();
            s3 = input.nextLine();
        } while ((s1.length() > 10) || (s2.length() > 10) || (s3.length() > 10));
        do {
            System.out.println("again");
            num1 = input.nextInt();
            num2 = input.nextInt();
            num3 = input.nextInt();
        } while ((num1 < 0 || num1 > 999) || (num2 < 0 || num2 > 999) || (num3 < 0 || num3 > 999));
        if (num1 < 100) {
            tempnum1 = String.valueOf(num1);
            String.format("%02d", tempnum1);
            System.out.println(s1 + "               " + tempnum1);

        } else if (num2 < 100) {
            tempnum2 = String.valueOf(num2);
            String.format("%02d", tempnum2);
            System.out.println(s1 + "               " + tempnum2);
        } else if (num3 < 100) {
            tempnum3 = String.valueOf(num3);
            String.format("%02d", tempnum3);
            System.out.println(s1 + "               " + tempnum3);
        }
        System.out.println(s1 + "               " + num1);
        System.out.println(s2 + "               " + num2);
        System.out.println(s3 + "               " + num3);
    }
}