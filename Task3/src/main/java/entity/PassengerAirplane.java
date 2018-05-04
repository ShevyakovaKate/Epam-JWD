package entity;

public class PassengerAirplane extends Airplane {
    private int seatingCapacity;

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public void setSeatingCapacity(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PassengerAirplane that = (PassengerAirplane) o;

        return seatingCapacity == that.seatingCapacity;
    }

    @Override
    public int hashCode() {
        return seatingCapacity;
    }

    @Override
    public String toString() {
        return "PassengerAirplane{" +
                "seatingCapacity=" + seatingCapacity +
                ", name=" + name +
                ", rangeOfFlight=" + rangeOfFlight +
                ", fuelConsumption=" + fuelConsumption +
                '}';
    }
}
