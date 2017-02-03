package oop.airport.planes;

/**
 * Created by Bekbolat on 03.02.2017.
 */
public class Airbus extends Planes {
    Planes airbus319 = new Planes();
    Planes airbus320 = new Planes();
    Planes airbus320neo = new Planes();
    Planes airbus321 = new Planes();

    @Override
    public String setName(String name) {
        super.setName(name);

        return name;
    }

}
