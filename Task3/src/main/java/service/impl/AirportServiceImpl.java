package service.impl;

import dao.AirportDAO;
import dao.DAOFactory;
import entity.Airplane;
import entity.CargoAirplane;
import entity.PassengerAirplane;
import entity.Airport;
import service.AirportService;

import static entity.airplaneproperty.AirplaneType.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AirportServiceImpl implements AirportService {
    private Airport airport;

    public AirportServiceImpl(){
        DAOFactory factory = DAOFactory.getInstance();
        AirportDAO airportDAO = factory.getAirportDAO();
        airport= airportDAO.initAirport();
    }

    @Override
    public Airport getAirport() {
        return airport;
    }

    public int calculateTotalCarryingCapacity() {
        int totalCarryingCapacity = 0;
        List<Airplane> airplanes = airport.getAirplanes();
        for (Airplane airplane : airplanes ) {
            if (isPassengerAirplane(airplane)) {
                totalCarryingCapacity += 0;
                continue;
            }
            CargoAirplane passengerAirplane = (CargoAirplane) airplane;
            totalCarryingCapacity += passengerAirplane.getCarryingCapacity();
        }
        return totalCarryingCapacity;
    }

    public int calculateTotalSeatingCapacity() {
        int totalSeatingCapacity = 0;
        List<Airplane> airplanes = airport.getAirplanes();
        for (Airplane airplane : airplanes ) {
            if (isCargoAirplane(airplane)) {
                totalSeatingCapacity += 0;
                continue;
            }
            PassengerAirplane passengerAirplane = (PassengerAirplane) airplane;
            totalSeatingCapacity += passengerAirplane.getSeatingCapacity();
        }
        return totalSeatingCapacity;
    }

    public void sort() {
        List<Airplane> airplanes = airport.getAirplanes();
        airplanes.sort(Comparator.comparing(Airplane::getRangeOfFlight));
        airport.setAirplanes(airplanes);
    }

    public List<Airplane> searchForGivenFuelConsumption(int minValue, int maxValue) {
        List<Airplane> suitableAirplanes = new ArrayList<>();
        List<Airplane> airplanes = airport.getAirplanes();
        for (Airplane airplane : airplanes) {
            int fuelConsumption = airplane.getFuelConsumption();
            if (fuelConsumption >= minValue && fuelConsumption <= maxValue) {
                suitableAirplanes.add(airplane);
            }
        }
        return suitableAirplanes;
    }

    private boolean isPassengerAirplane(Airplane airplane) {
        String airplaneType = airplane.getClass().getSimpleName();
        return airplaneType.equalsIgnoreCase(PASSENGERAIRPLANE.toString());
    }

    private boolean isCargoAirplane(Airplane airplane) {
        String airplaneType = airplane.getClass().getSimpleName();
        return airplaneType.equalsIgnoreCase(CARGOAIRPLANE.toString());
    }
}
