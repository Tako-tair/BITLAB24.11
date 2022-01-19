package ForTheSec;

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner in = new Scanner(System.in);
        try {
            Socket socket = new Socket("127.0.0.1", 2000);
            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream inStream = new ObjectInputStream(socket.getInputStream());
            System.out.println("INSERT YOUR NAME: ");
            String name = in.next();

            while (true) {
                System.out.println("PRESS 1 TO SEND MESSAGE");
                System.out.println("PRESS 0 TO EXIT");
                String choice = in.next();
                if (choice.equals("1")) {
                    System.out.println("Insert message text:");
                    String message = in.next();
                    Date date=new Date();
                    outputStream.writeObject(name + " : " + message+date);// need to add Data!
                }else if(choice.equals("0")){
                    break;
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
