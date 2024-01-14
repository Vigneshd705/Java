import java.io.*;
import java.util.*;
import java.net.*;
public class Server {
    public static void main(String[] args) {
        System.out.println("Server is Started!\nServer is Waiting for a client\n");
        try {
            ServerSocket server=new ServerSocket(9999);
            Socket connection=server.accept();
            ObjectOutputStream output=new ObjectOutputStream(connection.getOutputStream());
            ObjectInputStream input=new ObjectInputStream(connection.getInputStream());
            System.out.println("Server accepted the client request");
            String message;
            while(true){
            message=(String) input.readObject();
            System.out.println("Client: "+ message);
            System.out.print("You: ");
            Scanner scan =new Scanner(System.in);
            String str=scan.nextLine();
            output.writeObject(str);
            }
            // connection.close();
            // output.close();
            // input.close();     
        } catch (IOException | ClassNotFoundException e) {
            // e.printStackTrace();
            System.out.println("Client closed the connection");
        }

    }
    
}
