package AP_assignment;

import pastProj.javaProjects.Array;

import java.io.*;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
import java.util.Random;
import java.io.File;


public class ClientHandler implements Runnable {

    public static ArrayList<ClientHandler> clientHandlers = new ArrayList<>();
    public static ArrayList<Integer> IDHolder = new ArrayList<>();
    public static ArrayList<String> WordsHolder = new ArrayList<>();
    public static ArrayList<Character> Wordarray = new ArrayList<>();
    private Socket socket;
    private BufferedWriter write;
    private BufferedReader read;
    File FileReader;
    private Random num, word;
    private Integer ClientID;
    private String dash;
    private String chosenWord;


    public ClientHandler(Socket socket) { //receive clients upon connecting to JAVA server
        try {
            this.socket = socket;
            this.write = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            this.read = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            this.num = new Random();
            do {
                ClientID = num.nextInt(999999999);
            } while (IDHolder.contains(ClientID));
            IDHolder.add(ClientID);
            String msgClientID = String.valueOf(ClientID);
            write.write("SEVER: Connected Your ID is " + ClientID);
            write.newLine();
            FileReader = new File("C:/3to4words.txt"); //change the file path
            Scanner scan = new Scanner(FileReader);
            while (scan.hasNextLine()) {
                WordsHolder.add(scan.nextLine());
            }
            chosenWord = WordsHolder.get(num.nextInt(225));
            for (int i = 0; i <= chosenWord.length() - 1; i++) {
                Wordarray.add(chosenWord.charAt(i));
            }
            System.out.println(chosenWord);
            if (chosenWord.length() == 4) {
                dash = "_";
            } else {
                dash = "";
            }
            clientHandlers.add(this);
            //broadcastMessage("SERVER: " + ClientID + "has entered the chat");
        } catch (Exception e) {
            closeEverything(socket, read, write);
        }
    }

    @Override
    public void run() {
        String messageFromClient;
        String cleanMessage;
        while (socket.isConnected()) {
            try {
                write.write("Guess the given word: " + Wordarray.get(0) + "__" + dash);
                write.flush();
                write.newLine();
                Scanner scan = new Scanner(socket.getInputStream());
                messageFromClient = scan.nextLine();
                cleanMessage = messageFromClient.replace("Client:","");
                if (cleanMessage.equalsIgnoreCase(chosenWord)) {
                    write.write("Congrats! 1 point for you!");
                } else {
                    write.write("Guess again!");
                }
                write.flush();
                write.newLine();
            } catch (IOException ignored) {

            }
        }
    }

    public void broadcastMessage(String msg) {
        for (ClientHandler client : clientHandlers) {
            try {
                if (!client.ClientID.equals(ClientID)) {
                    client.write.write(msg);
                    client.write.newLine();
                    client.write.flush();
                }
            } catch (IOException e) {
                //closeEverything(socket, read, write);
            }
        }
    }

    public void FareWellClient() {
        clientHandlers.remove(this);
        broadcastMessage("SERVER: " + ClientID + "has left the chat");
    }

    public void closeEverything(Socket sockett, BufferedReader readd, BufferedWriter writee) {
        FareWellClient();
        try {
            if (sockett != null) {
                sockett.close();
            }
            if (readd != null) {
                readd.close();
            }
            if (writee != null) {
                writee.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}



