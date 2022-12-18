import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.*;
import java.util.ArrayList;

public class readcsv {
    public static void main(String[] args) {

        String file = "C:\\Book1.csv";
        BufferedWriter write;
        BufferedReader read;
        String line = "";

        try{
            read = new BufferedReader(new FileReader(file));
            while((line = read.readLine()) !=null){

            }
        }
        catch(Exception e){

        }
    }
}
