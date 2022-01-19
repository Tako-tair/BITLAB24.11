package Serializ;

import java.io.*;
import java.util.ArrayList;

public class MethodSeriz {
    public static void savePlayers(ArrayList<Player> players){
        File file = new File("bitlab.data");
        try{
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream outStream = new ObjectOutputStream(fileOutputStream);
            outStream.writeObject(players);
            outStream.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static ArrayList<Player> readPlayers(){
        ArrayList<Player> players = new ArrayList<>();
        try{
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("bitlab.data"));
            players = (ArrayList<Player>) inputStream.readObject();
            inputStream.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return players;
    }
}
