package oop.airport;

/**
 * Created by Bekbolat on 03.02.2017.
 */
public class Airport {
    private int distance;
    static final String PLACE1 = "Astana";
    static final String PLACE2 = "Almata";
    static final String PLACE3 = "Karaganda";
    static final String PLACE4 = "Moscow";
    static final String PLACE5 = "New York";
    static final String PLACE6 = "Prague";
    static final String PLACE7 = "Rome";
    static final String PLACE8 = "Barcelona";
    static final String PLACE9 = "Paris";
    static final String PLACE10 = "Minsk";


    public Airport(int distance) {
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }
}