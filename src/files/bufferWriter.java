package files;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class bufferWriter {
    public static void main(String[] args) {

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
            writer.write("writing to a file");
            writer.write("\nwriting into a test doc");
            String[] names = {"ben","jerry","han"};
            for(int i = 0; i<=names.length-1; i++){
                writer.write(" " + names[i]);

            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
