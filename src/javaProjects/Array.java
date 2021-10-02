package javaProjects;

import java.util.Scanner;
import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] mathGrade = new int[5];
        int[] mathGrades = {45,23,3,1,31,1,32,23,23,53,12};
        System.out.println(mathGrade.length);
        int length = mathGrades.length;
        System.out.println(length);
        System.out.println(Arrays.toString(mathGrades));


    }
}
