package oop.model.planes;

public abstract class Plane implements Comparable<Plane> {
    private String name;
    private int seatsNumber;
    private int overallWeight;
    private int maxDistance;
    private int fuelCapacity;

    public Plane(String name, int seatsNumber, int overallWeight, int maxDistance, int fuelCapacity) {
        this.name = name;
        this.seatsNumber = seatsNumber;
        this.overallWeight = overallWeight;
        this.maxDistance = maxDistance;
        this.fuelCapacity = fuelCapacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSeatsNumber() {
        return seatsNumber;
    }

    public void setSeatsNumber(int seatsNumber) {
        this.seatsNumber = seatsNumber;
    }

    public int getOverallWeight() {
        return overallWeight;
    }

    public void setOverallWeight(int overallWeight) {
        this.overallWeight = overallWeight;
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "name='" + name + '\'' +
                ", seatsNumber=" + seatsNumber +
                ", overallWeight=" + overallWeight +
                ", maxDistance=" + maxDistance +
                ", fuelCapacity=" + fuelCapacity +
                '}';
    }

    public String toStringForFuel() {
        return "Plane{" +
                "name='" + name + '\'' +
                ", fuelCapacity=" + fuelCapacity +
                '}';
    }

    @Override
    public int compareTo(Plane comparePlane) {
        int compareDistance = ((Plane) comparePlane).getMaxDistance();

        return this.getMaxDistance() - compareDistance;
    }
}