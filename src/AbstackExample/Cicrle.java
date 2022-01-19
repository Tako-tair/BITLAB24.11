package AbstackExample;

public class Cicrle extends Shape{
     int radius;
     public Cicrle(){}

     public Cicrle(int radius){
         this.radius = radius;
     }

    @Override
    public void getPerimetr() {
        System.out.println(radius + radius);
    }

    @Override
    public void getVolume() {
        System.out.println(radius*radius);
    }
}
