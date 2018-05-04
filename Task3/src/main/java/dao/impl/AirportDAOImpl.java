package dao.impl;

import org.apache.log4j.Logger;

import dao.AirportDAO;
import dao.factorymethod.AirplaneCreator;
import dao.factorymethod.CargoAirplaneCreator;
import dao.factorymethod.PassengerAirplaneCreator;
import entity.Airplane;
import entity.Airport;
import entity.airplaneproperty.AirplaneParameters;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static entity.airplaneproperty.AirplaneType.*;
import static entity.airplaneproperty.AirplaneParameters.*;

public class AirportDAOImpl implements AirportDAO {
    private static Logger logger = Logger.getLogger(AirportDAOImpl.class);
    private static final String AIRPLANES_DB_PATH = "src\\main\\resources\\airplanes_db";
    private static final int NAME_COLUMN_NUMBER = 1;
    private static final int RANGEOFFLIGHT_COLUMN_NUMBER = 2;
    private static final int FUELCONSUMPTION_COLUMN_NUMBER = 3;
    private static final int CAPACITY_COLUMN_NUMBER = 4;

    public Airport initAirport() {
        Airport airport = new Airport();
        try(BufferedReader reader = new BufferedReader(new FileReader(AIRPLANES_DB_PATH))) {
            String airplaneLine;
            AirplaneCreator cargoAirplaneCreator = new CargoAirplaneCreator();
            AirplaneCreator passengerAirplaneCreator = new PassengerAirplaneCreator();
            Airplane airplane;
            while ((airplaneLine = reader.readLine()) != null) {
                if (airplaneLine.isEmpty()) {
                    continue;
                }
                String airplaneType = getAirplaneName(airplaneLine);
                Map<AirplaneParameters, String> parameters = getAirplanesParametersMap(airplaneLine);
                if (airplaneType.equalsIgnoreCase(CARGOAIRPLANE.toString())) {
                    airplane = cargoAirplaneCreator.createAirplane(parameters);
                } else {
                    airplane = passengerAirplaneCreator.createAirplane(parameters);
                }
                airport.addAirplane(airplane);
                logger.info("initialization was without exception");
            }
        } catch (IOException | NullPointerException e) {
            logger.error(e);
        }
        return airport;
    }

    private String getAirplaneName(String airplaneLine) {
        return airplaneLine.substring(0, airplaneLine.indexOf(" "));
    }

    private Map<AirplaneParameters, String> getAirplanesParametersMap(String airplaneLine) {
        Map<AirplaneParameters, String> airplanesParametersMap = new HashMap<>();
        String[] airplanesParameters = airplaneLine.split("[:;\\s,=]+");
        airplanesParametersMap.put(NAME, airplanesParameters[NAME_COLUMN_NUMBER]);
        airplanesParametersMap.put(RANGE_OF_FLIHGT, airplanesParameters[RANGEOFFLIGHT_COLUMN_NUMBER]);
        airplanesParametersMap.put(FUEL_CONSUMTION, airplanesParameters[FUELCONSUMPTION_COLUMN_NUMBER]);
        airplanesParametersMap.put(CAPACITY, airplanesParameters[CAPACITY_COLUMN_NUMBER]);
        return airplanesParametersMap;
    }
}
