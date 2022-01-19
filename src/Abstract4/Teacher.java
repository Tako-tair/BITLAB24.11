package Abstract4;

public class Teacher extends User {
    String nickname;
    String status;
    String[] subject = new String[10];
    int index = 0;

    public Teacher(){}

    public Teacher(int id, String login, String password, String nickname, String status, String[] subject, int index) {
        super(id, login, password);
        this.nickname = nickname;
        this.status = status;
        this.subject = subject;
        this.index = index;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String[] getSubject() {
        return subject;
    }

    public void setSubject(String[] subject) {
        this.subject = subject;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void addSubject(String subjects){
        subject[index] = subjects;
        index++;
    }

    public String getData(){
        return id + " " + login + " " + password + " " + nickname + " " + status;
    }
}
