package service;

import entity.Airplane;
import entity.airport.Airport;

import java.util.List;

public interface AirportService {
    Airport getAirport();
    int calculateTotalCarryingCapacity();
    int calculateTotalSeatingCapacity();
    void sort();
    List<Airplane> searchForGivenFuelConsumption(int minValue, int maxValue);
}
