package javaProjects;

import java.util.Scanner;
import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input NumOfNums: ");
        int index = 0;
        int NumOfNums = input.nextInt();
        int[] Array = new int[NumOfNums];


        for (; NumOfNums >= Array.length - (index +1); NumOfNums--) {
                Array[index] = (NumOfNums - (NumOfNums - index));
                index++;
            System.out.println(Arrays.toString(Array));
        }



    }
}
