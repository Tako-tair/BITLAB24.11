package Extend4;

public class OlympicGames {
    String city;
    int year;
    Sportsman sportsmansList[];
    static int adder = 0;

    public OlympicGames() {}

    public OlympicGames(String city, int year) {
        this.city = city;
        this.year = year;
    }

    public Sportsman[] getSportsmansList() {
        return sportsmansList;
    }

    public void setSportsmansList(Sportsman[] sportsmansList) {
        this.sportsmansList = sportsmansList;
    }

    public void city() {
        System.out.println("Country of OlympicGames: "+city+", Year: "+year );
    }

}
