package dao.factorymethod;

import entity.Airplane;
import entity.CargoAirplane;
import entity.airplaneproperty.AirplaneParameters;

import static entity.airplaneproperty.AirplaneParameters.*;

import java.util.Map;

public class CargoAirplaneCreator extends AirplaneCreator {
    public Airplane createAirplane( Map<AirplaneParameters, String> parameters) {
        CargoAirplane cargoAirplane = new CargoAirplane();
        cargoAirplane.setName(parameters.get(NAME));
        cargoAirplane.setRangeOfFlight(Integer.valueOf(parameters.get(RANGE_OF_FLIHGT)));
        cargoAirplane.setFuelConsumption(Integer.valueOf(parameters.get(FUEL_CONSUMTION)));
        cargoAirplane.setCarryingCapacity(Integer.valueOf(parameters.get(CAPACITY)));
        return cargoAirplane;
    }
}
