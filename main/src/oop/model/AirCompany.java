package oop.model;

import oop.model.planes.Plane;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AirCompany {
    private String companyName;
    private List<Plane> planes;

    public AirCompany(String companyName, List<Plane> planes) {
        this.companyName = companyName;
        this.planes = planes;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public List<Plane> getPlanes() {
        return planes;
    }

    public void setPlanes(List<Plane> planes) {
        this.planes = planes;
    }


    public int allSeatsCount() {
        int allSeatsCount = 0;
        for (Plane plane : planes) {
            allSeatsCount += plane.getSeatsNumber();
        }
        return allSeatsCount;
    }


    public int allOverallWeight() {
        int allOverallWeight = 0;
        for (Plane plane : planes) {
            allOverallWeight += plane.getOverallWeight();
        }
        return allOverallWeight;
    }

    public List<Plane> sortByDistance() {
        Collections.sort(planes);
        return planes;
    }

    public ArrayList<Plane> findByFuel(int fuelMin, int fuelMax){
        ArrayList<Plane> suitablePlanes = new ArrayList<>();
        for (Plane plane: planes){
            if(plane.getFuelCapacity() >= fuelMin && plane.getFuelCapacity() <= fuelMax){
                suitablePlanes.add(plane);
            }
        }
        return suitablePlanes;
    }
}


