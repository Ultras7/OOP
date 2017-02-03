package oop.people;

/**
 * Created by Bekbolat on 03.02.2017.
 */
public abstract class People {
    private int number;
    private int age;
    private float mass;

    public People(int number, int age, float mass) {
        this.number = number;
        this.age = age;
        this.mass = mass;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getMass() {
        return mass;
    }

    public void setMass(float mass) {
        this.mass = mass;
    }
}

