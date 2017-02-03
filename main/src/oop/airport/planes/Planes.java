package oop.airport.planes;

/**
 * Created by Ulan on 02.02.2017.
 */
public class Planes {
    private String name;
    private String airportStay;
    private String airportToGo;
    private int index;
    private int planeWeight;
    private int s;
    private int workersnumber;
    private int clientsnumber;
    private float fuelWeight;

    public Planes(String name, String airportStay, String airportToGo, int index, int planeWeight, int s, int workersnumber, int clientsnumber, float fuelWeight) {

        this.name = name;
        this.airportStay = airportStay;
        this.airportToGo = airportToGo;
        this.index = index;
        this.planeWeight = planeWeight;
        this.s = s;
        this.workersnumber = workersnumber;
        this.clientsnumber = clientsnumber;
        this.fuelWeight = fuelWeight;
    }

    public Planes() {

    }

    public String getName() {
        return name;
    }

    public String setName(String name) {
        this.name = name;
        return name;
    }

    public String getAirportStay() {
        return airportStay;
    }

    public void setAirportStay(String airportStay) {
        this.airportStay = airportStay;
    }

    public String getAirportToGo() {
        return airportToGo;
    }

    public void setAirportToGo(String airportToGo) {
        this.airportToGo = airportToGo;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getPlaneWeight() {
        return planeWeight;
    }

    public void setPlaneWeight(int planeWeight) {
        this.planeWeight = planeWeight;
    }

    public int getS() {
        return s;
    }

    public void setS(int s) {
        this.s = s;
    }

    public int getWorkersnumber() {
        return workersnumber;
    }

    public void setWorkersnumber(int workersnumber) {
        this.workersnumber = workersnumber;
    }

    public int getClientsnumber() {
        return clientsnumber;
    }

    public void setClientsnumber(int clientsnumber) {
        this.clientsnumber = clientsnumber;
    }

    public float getFuelWeight() {
        return fuelWeight;
    }

    public void setFuelWeight(float fuelWeight) {
        this.fuelWeight = fuelWeight;
    }
}