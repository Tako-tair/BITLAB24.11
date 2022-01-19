package interfaceLecture;

public class UserBeanlmp implements UserBean {
    Users[] users;

    public UserBeanlmp(Users[] users) {
        this.users = users;
    }

    public UserBeanlmp() {}

    public void getAllUsers() {
        System.out.println("Get All Users: ");
        for (int i = 0; i < users.length; i++) {
            System.out.println((i+1) + ": " + users[i]);
        }
    }

    public void getUsersByName(String name) {
        System.out.println("Get Users By Name: ");
        for (int i = 0; i < users.length; i++) {
            if (users[i].name == name){
                System.out.println((i+1) + ": " + users[i].toString());
            }
        }
    }

    public void getUsersBySurname(String surname) {
        System.out.println("Get Users By Surame: ");
        for (int i = 0; i < users.length; i++) {
            if (users[i].surname == surname){
                System.out.println((i+1) + ": " + users[i].toString());
            }
        }
    }
}
