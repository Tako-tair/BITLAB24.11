package extendTaskSix;

import com.sun.crypto.provider.PBEWithMD5AndDESCipher;
import javafx.stage.Stage;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        User[] users = new User[10];
        int index = 0;
        while (true) {
            System.out.println("PRESS [1] ADD USER");
            System.out.println("PRESS [2] TO LIST USERS");
            System.out.println("PRESS [0] TO EXIT");

            int n = scanner.nextInt();
            switch (n){
                case 1:
                    System.out.println("PRESS [1] ADD STUDENT");
                    System.out.println("PRESS [2] ADD STAFF");
                    int n1 = scanner.nextInt();
                    switch (n1){
                        case 1:
                            String name1 = scanner.next();
                            String surname1 = scanner.next();
                            double gpa = scanner.nextDouble();
                            Student student = new Student(name1,surname1,gpa);
                            users[index] = student;
                            index++;
                            break;
                        case 2:
                            String name2 = scanner.next();
                            String surname2 = scanner.next();
                            double salary2 = scanner.nextDouble();
                            Staff staff = new Staff(name2,surname2,salary2);
                            users[index] = staff;
                            index++;
                            break;
                    }
                case 2:
                    System.out.println("PRESS [1] TO LIST STUDENTS");
                    System.out.println("PRESS [2] TO LIST STAFF");
                    int n3 = scanner.nextInt();
                    switch (n3){
                        case 1:
                            for (int i = 0; i < users.length; i++) {
                               if(users[i] instanceof Student)
                                   users[i].getData();
                            }
                        case 2:
                            for (int i = 0; i < users.length; i++) {
                                if(users[i] instanceof Staff)
                                    users[i].getData();
                            }
                    }

                case 0:
                    System.exit(0);
            }
        }
    }
}
