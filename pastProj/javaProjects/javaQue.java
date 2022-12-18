package pastProj.javaProjects;

import java.util.Scanner;
public class javaQue {

    //write a Java method to count all vowels in a string.
    //Input the string: w3resource
    //Expected Output
    //Number of Vowels in the string: 4

    static int counter = 0;
    static char a,e,i,o,u;
    static char letter;

    static void vowelDetector() {
        switch (letter) {
            case 'a', 'e', 'i', 'o', 'u' -> {
                System.out.println(letter);
                counter += 1;
            }
            default -> {
            }
        }
    }
    public static void main(String[] args) {

        int index = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("input a string");
        String inputString = input.next();

        for(int i = 0; i < inputString.length(); i++){
            letter = inputString.charAt(index);
            vowelDetector();
            index++;
        }
        System.out.println("there are a total of " + counter + " vowels");


    }
}

