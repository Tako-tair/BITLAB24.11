package Thread2;

public class Fire extends Thread{

    @Override
    public void run() {
        try{
            for (int i = 0; i < 10; i++) {
                int x = (int) (Math.random() * 500) -100;
                int y = (int) (Math.random() * 500) -100;
                Main.mainFrame.label.setLocation(x,y);
                Thread.sleep(100);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
