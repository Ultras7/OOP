package oop.model.people;

public abstract class Person {
    private String name;
    private int mass;
    private Role role;

    enum Role {
        CREW,
        PASSENGER
    }


    public Person(String name, int mass, Role role) {
        this.name = name;
        this.mass = mass;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", mass=" + mass +
                '}';
    }
}