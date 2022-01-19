package Extend4;

public class Swimmer extends Sportsman{
    String style;

    double recordTime;

    public Swimmer() {
    }

    public Swimmer(String fullName, int age, String country, String style, double recordTime) {
        super(fullName, age, country);
        this.style = style;
        this.recordTime = recordTime;
    }
    @Override
    public void play(){
        System.out.println("Full name: "+fullName+", Age: "+age+", Country: "+country+", Style: "+style+",Record time: "+recordTime+", is swimming ");
    }
}
