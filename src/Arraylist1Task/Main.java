package Arraylist1Task;

import Gui1.Player;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Players> players = new ArrayList<>();
        double avg = 0;
        int index = 0;
        int sum = 0;
        Players p1 = new Players("Mike", 120000.122, 21);
        Players p2 = new Players("Jake", 130000.122, 22);
        Players p3 = new Players("Brad", 140000.122, 23);
        Players p4 = new Players("Tom", 150000.122, 24);
        Players p5 = new Players("Zhandos", 160000.122, 25);
        Players p6 = new Players("Abilay", 170000.122, 26);
        Players p7 = new Players("Dias", 180000.122, 27);
        Players p8 = new Players("Askar", 190000.122, 28);
        Players p9 = new Players("Messi", 200000.122, 29);
        Players p10 = new Players("Roland", 210000.122, 30);

        players.add(p1);
        players.add(p2);
        players.add(p3);
        players.add(p4);
        players.add(p5);
        players.add(p6);
        players.add(p7);
        players.add(p8);
        players.add(p9);
        players.add(p10);
        for (int i = 0; i < players.size(); i++) {
            sum += players.get(i).getAge();
            avg += players.get(i).getPrice();
            index++;
        }
        System.out.println("Age: " + sum);
        System.out.println("Price: " + avg/players.size());
    }
}
