package oop.model.planes;

public enum PlanesName {
    BOEING_747("boeing_747"),
    AIRBUS_A320("airbus_a320"),
    AIRBUS_A321("airbus_a321"),
    EMBRAER_190("embraer_190");

    private final String name;

    PlanesName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
