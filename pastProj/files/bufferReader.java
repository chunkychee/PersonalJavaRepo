package pastProj.files;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class bufferReader {
    public static void main(String[] args){

            try{

                BufferedReader reader = new BufferedReader(new FileReader("javaProjects/output.txt"));
               String line;
                while((line = reader.readLine()) != null) {
                    System.out.println(reader.readLine());
                }
                reader.close();
    }catch (IOException e){
        e.printStackTrace();
    }

    }
}
