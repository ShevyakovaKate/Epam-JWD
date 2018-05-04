package entity;

import java.util.ArrayList;
import java.util.List;

public class Airport {
    private List<Airplane> airplanes;

    public Airport() {
        airplanes = new ArrayList<>();
    }

    public List<Airplane> getAirplanes() {
        return airplanes;
    }

    public void setAirplanes(List<Airplane> airplanes) {
        this.airplanes = airplanes;
    }

    public void addAirplane(Airplane airplane) {
        airplanes.add(airplane);
    }

    @Override
    public String toString() {
        return "Airport{" +
                "airplanes=" + airplanes +
                '}';
    }
}
