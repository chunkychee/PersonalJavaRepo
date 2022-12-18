package AP_assignment;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;


//2 types of stream: char streams(usually text files the other is byte stream usually img or binary files

/*-----------------------------------------------
-OutputStreamWriter and InputStreamwriter are both bridges from Byte Stream to CHAR stream
-flushing  a steam forces any buffered bytes to be written. a buffer will only flush if full, UNLESS forced through code


-----------------------------------------------*/
public class SocketProgrammingCLIENT {

    public static void main(String[] args) {
        Socket socket = null;
        InputStreamReader inputStream = null;
        OutputStreamWriter outputWriter = null;
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;

        try{
            socket = new Socket("localhost",1234);
            inputStream = new InputStreamReader(socket.getInputStream());
            outputWriter = new OutputStreamWriter(socket.getOutputStream());

            bufferedReader = new BufferedReader(inputStream);
            bufferedWriter = new BufferedWriter(outputWriter);

            Scanner scan = new Scanner(System.in);
            while(true){
                String msgToSend = scan.nextLine();
                bufferedWriter.write(msgToSend);
                bufferedWriter.newLine();
                bufferedWriter.flush();

                System.out.println("server has " + bufferedReader.readLine());

                if(msgToSend.equalsIgnoreCase("bye"))
                    break;
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try{
                if(socket != null) {
                    socket.close();
                }
                if(inputStream != null) {
                    inputStream.close();
                }
                if(outputWriter != null) {
                    socket.close();
                }
                if(bufferedReader != null) {
                    socket.close();
                }
                if(bufferedWriter != null) {
                    socket.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}
