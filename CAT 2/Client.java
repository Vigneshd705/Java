import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try {
            Socket clientConnection = new Socket(InetAddress.getLocalHost(), 9999);
            ObjectOutputStream output = new ObjectOutputStream(clientConnection.getOutputStream());
            ObjectInputStream input = new ObjectInputStream(clientConnection.getInputStream());
            String str = new String();
            Scanner scan = new Scanner(System.in);
            String message = new String();
            while (true) {
                System.out.print("You: ");
                str = scan.nextLine();
                if (str.toLowerCase().equals("over")) {
                    clientConnection.close();
                    output.close();
                    input.close();
                    exit(0);
                }
                output.writeObject(str);
                message = (String) input.readObject();
                System.out.println("Server: " + message);
            }

        } catch (IOException | ClassNotFoundException e) {
            // e.printStackTrace();
        }

    }

    private static void exit(int i) {
    }
}
