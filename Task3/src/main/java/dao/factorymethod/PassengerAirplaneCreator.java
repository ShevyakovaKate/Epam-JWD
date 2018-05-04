package dao.factorymethod;

import entity.Airplane;
import entity.PassengerAirplane;
import entity.airplaneproperty.AirplaneParameters;

import java.util.Map;

import static entity.airplaneproperty.AirplaneParameters.*;

public class PassengerAirplaneCreator extends AirplaneCreator{
    public Airplane createAirplane(Map<AirplaneParameters, String> parameters) {
        PassengerAirplane passengerAirplane = new PassengerAirplane();
        passengerAirplane.setName(parameters.get(NAME));
        passengerAirplane.setRangeOfFlight(Integer.valueOf(parameters.get(RANGE_OF_FLIHGT)));
        passengerAirplane.setFuelConsumption(Integer.valueOf(parameters.get(FUEL_CONSUMTION)));
        passengerAirplane.setSeatingCapacity(Integer.valueOf(parameters.get(CAPACITY)));
        return passengerAirplane;
    }
}
