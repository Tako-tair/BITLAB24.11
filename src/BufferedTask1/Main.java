package BufferedTask1;

import com.sun.rmi.rmid.ExecPermission;
import com.sun.webkit.dom.DocumentFragmentImpl;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("PRESS [1] TO ADD USERS\n"+
                    "PRESS [2] TO LIST USERS\n"+
                    "PRESS [3] TO DELETE USERS\n"+
                    "PRESS [4] TO EXIT");
            int n = scanner.nextInt();
            switch (n){
                case 1:
                    System.out.print("Write id: ");
                    int id = scanner.nextInt();
                    System.out.print("Write login: ");
                    String login = scanner.next();
                    System.out.print("Write pass: ");
                    String pass = scanner.next();
                    User user = new User(id,login,pass);
                    ArrayList<User> users = getUsersList();
                    users.add(user);
                    saveUsersList(users);
                    break;
                case 2:
                    ArrayList<User> userList = getUsersList();
                    for (int i = 0; i < userList.size(); i++) {
                        System.out.println((i+1) + ": " + userList.get(i).toString());
                    }
                    break;
                case 3:
                    ArrayList<User> delUsers = getUsersList();
                    for (int i = 0; i < delUsers.size(); i++) {
                        System.out.println((i+1) + ": " + delUsers.get(i).toString());
                    }
                    System.out.println("______________________________________________");
                    System.out.print("Insert id: ");
                    int index = scanner.nextInt();
                    delUsers.remove(index-1);
                    saveUsersList(delUsers);
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }
    public static ArrayList<User> getUsersList(){
        ArrayList<User> list = new ArrayList<>();
        try{
            BufferedReader br = new BufferedReader(new FileReader("memory.txt"));
            String line = "";
            while ((line = br.readLine()) != null){
                int id = Integer.parseInt(line);
                String login = br.readLine();
                String pass = br.readLine();
                list.add(new User(id,login,pass));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }

    public static void saveUsersList(ArrayList<User> users){
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("memory.txt"));
            for (int i = 0; i < users.size(); i++) {
                bw.write(users.get(i).getId() + "\n");
                bw.write(users.get(i).getLogin() + "\n");
                bw.write(users.get(i).getPassword() + "\n");
            }
            bw.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }


}
