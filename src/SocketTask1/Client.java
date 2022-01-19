package SocketTask1;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Date;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Insert your name");
        String name = in.next();
        try{
            Socket socket = new Socket("127.0.0.1",1989);
            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
            while(true){
                System.out.println("PRESS [1] TO SEND MESSAGE");
                System.out.println("PRESS [0] TO EXIT");
                int choose = in.nextInt();
                if(choose == 1) {
                    System.out.print("Insert message text: ");
                    String mess = in.next();
                    System.out.println("...............................");
                    MessageData m = new MessageData(name, mess, new Date());
                    outputStream.writeObject(m);
                }else {
                        System.exit(0);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
