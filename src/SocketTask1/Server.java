package SocketTask1;

import com.sun.xml.internal.ws.api.model.MEP;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try{
            ServerSocket server = new ServerSocket(1989);
            Socket socket = server.accept();
            System.out.println("Client connected");

            ObjectInputStream inStream = new ObjectInputStream(socket.getInputStream());
            MessageData m;
            while ((m = (MessageData)inStream.readObject()) != null){
                System.out.println(m.toString());
            }

        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
