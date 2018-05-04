package entity;

import java.util.Comparator;

public abstract class Airplane implements Comparator<Airplane> {
    /**Package-level access*/
    String name;
    int rangeOfFlight;
    int fuelConsumption;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRangeOfFlight() {
        return rangeOfFlight;
    }

    public void setRangeOfFlight(int rangeOfFlight) {
        this.rangeOfFlight = rangeOfFlight;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public int compare(Airplane o1, Airplane o2) {
        return o1.fuelConsumption - o2.fuelConsumption;
    }

}
