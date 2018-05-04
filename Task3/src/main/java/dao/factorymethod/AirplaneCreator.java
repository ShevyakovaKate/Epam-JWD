package dao.factorymethod;

import entity.Airplane;
import entity.airplaneproperty.AirplaneParameters;

import java.util.Map;

public abstract class AirplaneCreator {
    public abstract Airplane createAirplane(Map<AirplaneParameters, String> parameters);
}
