package Extend4;

public class Jymnast extends Sportsman{
    int height;

    int weight;

    String style;

    public Jymnast() {
    }

    public Jymnast(String fullName, int age, String country, int height, int weight, String style) {
        super(fullName, age, country);
        this.height = height;
        this.weight = weight;
        this.style = style;
    }
    @Override
    public void play() {
        System.out.println("Full name: "+fullName+", Age: "+age+", Country: "+country+", Height: "+height+" ,Weight: "+weight+", Style: "+style+" ,is do jumnastic ");
    }
}
