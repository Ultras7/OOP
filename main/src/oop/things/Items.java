package oop.things;

/**
 * Created by Ulan on 03.02.2017.
 */
public class Items {
    public float weight;
    public int volume;

    public Items(float weight, int volume) {
        this.weight = weight;
        this.volume = volume;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
