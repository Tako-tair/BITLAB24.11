package AbstackExample;

public class Square extends Shape{
    int line;
    String name;
    public Square(){}

    public Square(int line){
        this.line = line;
    }

    @Override
    public void getPerimetr() {
        System.out.println(line+ line);
    }

    @Override
    public void getVolume() {
        System.out.println(line*line);
    }
}
