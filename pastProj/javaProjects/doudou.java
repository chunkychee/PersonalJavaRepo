package pastProj.javaProjects;

import java.io.*;
import java.util.Scanner;
public class doudou {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("javaProjects/output.txt"));
            String words = input.nextLine();
            writer.write(words);
            writer.close();
            Scanner scan = new Scanner((Readable) writer);
        } catch(IOException e) {
            e.printStackTrace();
            }
        }
    }