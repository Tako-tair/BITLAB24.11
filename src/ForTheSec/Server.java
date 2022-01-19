package ForTheSec;


import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[]args) throws IOException, ClassNotFoundException {
        try{
            ServerSocket server=new ServerSocket(2000);
            System.out.println("WAITING FOR A CLIENT");
            Socket socket=server.accept();
            System.out.println("CLIENT CONNECTED");

            ObjectOutputStream outputStream=new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream inStream= new ObjectInputStream(socket.getInputStream());
            String text=" ";
            while ((text=(String)inStream.readObject()) !=null){
                System.out.println(text);
            }
            inStream.close();
            outputStream.close();
            socket.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

