package oop.airport;

/**
 * Created by Bekbolat on 03.02.2017.
 */
public class AirCompany {
    private String companyName;
    private int planesNumber;
    private int workersNumber;


    public AirCompany(String companyName, int planesNumber, int workersNumber) {
        this.companyName = companyName;
        this.planesNumber = planesNumber;
        this.workersNumber = workersNumber;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getPlanesNumber() {
        return planesNumber;
    }

    public void setPlanesNumber(int planesNumber) {
        this.planesNumber = planesNumber;
    }

    public int getWorkersNumber() {
        return workersNumber;
    }

    public void setWorkersNumber(int workersNumber) {
        this.workersNumber = workersNumber;
    }
}

