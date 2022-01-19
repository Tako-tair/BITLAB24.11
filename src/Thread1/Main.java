package Thread1;

public class Main {
    public static void main(String[] args) {
        Operation o1 = new Operation("a1",10);
        Operation o2 = new Operation("a2",8);
        Operation o3 = new Operation("a3",4);
        Operation o4 = new Operation("a4",3);
        Operation o5 = new Operation("a5",1);
        o1.start();
        o2.start();
        o3.start();
        o4.start();
        o5.start();

    }
}
