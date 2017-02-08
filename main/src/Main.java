import oop.model.AirCompany;
import oop.model.planes.*;

import java.util.ArrayList;

public class Main {

    private static final int SEATS_NUMBER_BOEING = 223;
    private static final int SEATS_NUMBER_AIRBUS_320 = 156;
    private static final int SEATS_NUMBER_AIRBUS_321 = 188;
    private static final int SEATS_NUMBER_EMBRAER = 103;

    private static final int OVERALL_WEIGHT_BOEING = 70000;
    private static final int OVERALL_WEIGHT_AIRBUS_320 = 50000;
    private static final int OVERALL_WEIGHT_AIRBUS_321 = 60000;
    private static final int OVERALL_WEIGHT_EMBRAER = 40000;

    private static final int MAX_DISTANCE_BOEING = 11000;
    private static final int MAX_DISTANCE_AIRBUS_320 = 6100;
    private static final int MAX_DISTANCE_AIRBUS_321 = 5950;
    private static final int MAX_DISTANCE_EMBRAER = 4500;

    private static final int FUEL_CAPACITY_BOEING = 30000;
    private static final int FUEL_CAPACITY_AIRBUS_320 = 20000;
    private static final int FUEL_CAPACITY_AIRBUS_321 = 25000;
    private static final int FUEL_CAPACITY_EMBRAER = 17000;

    private static final String COMPANY_NAME = "UlanCompany";
    private static final String ALL_PLANES_SEATS_NUMBER = "Общая вместимость самолетов авиакомпании = ";
    private static final String ALL_PLANES_OVERALL_WEIGHT = "Общая грузоподъемность самолетов авиакомпании = ";
    private static final String SORT_PLANES_OF_DISTNACE = " \n Сортировка самолетов по дистаниции перелета: ";
    private static final String RANGE_PLANES_BY_FUEL = " \n Диапазон самолетов по топливу: ";

    private static final int FUEL_MIN = 20000;
    private static final int FUEL_MAX = 27000;

    public static void main(String[] args) {
        ArrayList<Plane> planes = new ArrayList<Plane>();
        planes.add(new Airbus(PlanesName.AIRBUS_A320.toString(),SEATS_NUMBER_AIRBUS_320, OVERALL_WEIGHT_AIRBUS_320, MAX_DISTANCE_AIRBUS_320,FUEL_CAPACITY_AIRBUS_320));
        planes.add(new Boeing(PlanesName.BOEING_747.toString(),SEATS_NUMBER_BOEING , OVERALL_WEIGHT_BOEING, MAX_DISTANCE_BOEING,FUEL_CAPACITY_BOEING ));
        planes.add(new Airbus(PlanesName.AIRBUS_A321.toString(),SEATS_NUMBER_AIRBUS_321, OVERALL_WEIGHT_AIRBUS_321,MAX_DISTANCE_AIRBUS_321,FUEL_CAPACITY_AIRBUS_321));
        planes.add(new Embraer(PlanesName.EMBRAER_190.toString(),SEATS_NUMBER_EMBRAER, OVERALL_WEIGHT_EMBRAER,MAX_DISTANCE_EMBRAER,FUEL_CAPACITY_EMBRAER));

        for (Plane plane : planes) {
            System.out.println(plane.toString());
        }

        AirCompany ulanAir = new AirCompany(COMPANY_NAME, planes);

        System.out.println(ALL_PLANES_SEATS_NUMBER + ulanAir.allSeatsCount());

        System.out.println(ALL_PLANES_OVERALL_WEIGHT + ulanAir.allOverallWeight());

        System.out.println(SORT_PLANES_OF_DISTNACE);
        ArrayList<Plane> sortedPlane = (ArrayList<Plane>) ulanAir.sortByDistance();
        for (int c = 0; c < sortedPlane.size(); c++) {
            System.out.println(c+1 + " " + sortedPlane.get(c).toString());
        }
        System.out.println(RANGE_PLANES_BY_FUEL);
        for (Plane plane: ulanAir.findByFuel(FUEL_MIN, FUEL_MAX)) {
            System.out.println(plane.toStringForFuel());
        }
    }
}
