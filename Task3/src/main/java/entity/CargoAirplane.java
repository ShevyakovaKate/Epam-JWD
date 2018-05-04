package entity;

public class CargoAirplane extends Airplane {
    int carryingCapacity;

    public int getCarryingCapacity() {
        return carryingCapacity;
    }

    public void setCarryingCapacity(int carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CargoAirplane that = (CargoAirplane) o;

        return carryingCapacity == that.carryingCapacity;
    }

    @Override
    public int hashCode() {
        return carryingCapacity;
    }

    @Override
    public String toString() {
        return "CargoAirplane{" +
                "carryingCapacity=" + carryingCapacity +
                ", name=" + name +
                ", rangeOfFlight=" + rangeOfFlight +
                ", fuelConsumption=" + fuelConsumption +
                '}';
    }
}
