package extendTaskSix;

public class User {
        protected String name;
        protected String surname;
        public User(){}
        public User(String name, String surname){
            this.name = name;
            this.surname = surname;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSurname() {
            return surname;
        }

        public void setSurname(String surname) {
            this.surname = surname;
        }

        public void getData(){
            System.out.print("Parameters of user: " + name + " " + surname);

        }
    }
