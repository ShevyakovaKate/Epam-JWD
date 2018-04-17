package by.epam.training.shevyakova.task0.dao.creator;

import by.epam.training.shevyakova.task0.entity.Appliance;
import by.epam.training.shevyakova.task0.entity.VacuumCleaner;
import by.epam.training.shevyakova.task0.entity.criteria.SearchCriteria;

import java.util.Map;

public class VacuumCleanerCreator implements CreateCommand {
    @Override
    public Appliance create(Map<String, String> propertyMap) {
        VacuumCleaner vacuumCleaner = new VacuumCleaner();

        int powerConsumptionValue = Integer.valueOf(propertyMap.get(SearchCriteria.VacuumCleaner.POWER_CONSUMPTION.toString()));
        String filterTypeValue = propertyMap.get(SearchCriteria.VacuumCleaner.FILTER_TYPE.toString());
        String bagTypeValue = propertyMap.get(SearchCriteria.VacuumCleaner.BAG_TYPE.toString());
        String wandTypeValue = propertyMap.get(SearchCriteria.VacuumCleaner.WAND_TYPE.toString());
        int motorSpeedRegularationValue = Integer.valueOf(propertyMap.get(SearchCriteria.VacuumCleaner.MOTOR_SPEED_REGULATION.toString()));;
        int cleaningWidthValue = Integer.valueOf(propertyMap.get(SearchCriteria.VacuumCleaner.CLEANING_WIDTH.toString()));

        vacuumCleaner.setPowerConsumption(powerConsumptionValue);
        vacuumCleaner.setFilterType(filterTypeValue);
        vacuumCleaner.setBagType(bagTypeValue);
        vacuumCleaner.setWandType(wandTypeValue);
        vacuumCleaner.setMotorSpeedRegularation(motorSpeedRegularationValue);
        vacuumCleaner.setCleaningWidth(cleaningWidthValue);

        return vacuumCleaner;
    }
}
