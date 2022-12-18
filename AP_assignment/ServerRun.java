package AP_assignment;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;


public class ServerRun {
    private ServerSocket serversocket;
    private BufferedWriter ConnectedClient;

    public ServerRun(ServerSocket serversocket) {
        this.serversocket = serversocket;
    }
    public void startServer(){
        try{
            while(!serversocket.isClosed()){
                Socket socket = serversocket.accept();
                System.out.println("A new client has been connected");
                ClientHandler client = new ClientHandler(socket);
                Thread thread = new Thread(client);
                thread.start();
             }
        } catch (IOException e) {
        }
    }

    public void closeServer() {
        try {
            if(serversocket != null){
                serversocket.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        ServerSocket serversocket = new ServerSocket(8880);
        ServerRun server = new ServerRun(serversocket);
        server.startServer();
    }
}
