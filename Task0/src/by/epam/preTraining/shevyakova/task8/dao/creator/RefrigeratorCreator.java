package by.epam.preTraining.shevyakova.task8.dao.creator;

import by.epam.preTraining.shevyakova.task8.entity.Appliance;
import by.epam.preTraining.shevyakova.task8.entity.Refrigerator;
import by.epam.preTraining.shevyakova.task8.entity.criteria.SearchCriteria;

import java.util.HashMap;

public class RefrigeratorCreator implements CreateCommand {
    @Override
    public Appliance create(HashMap<String, String> propertyMap) {
        Refrigerator refrigerator = new Refrigerator();

        int powerConsumptionValue = Integer.valueOf(propertyMap.get(SearchCriteria.Refrigerator.POWER_CONSUMPTION.toString()));
        int weightValue = Integer.valueOf(propertyMap.get(SearchCriteria.Refrigerator.WEIGHT.toString()));
        int freezerCapacityValue = Integer.valueOf(propertyMap.get(SearchCriteria.Refrigerator.FREEZER_CAPACITY.toString()));
        int overallCapacityValue = Integer.valueOf(propertyMap.get(SearchCriteria.Refrigerator.OVERALL_CAPACITY.toString()));
        int heightValue = Integer.valueOf(propertyMap.get(SearchCriteria.Refrigerator.HEIGHT.toString()));
        int widthValue = Integer.valueOf(propertyMap.get(SearchCriteria.Refrigerator.WIDTH.toString()));

        refrigerator.setPowerConsumption(powerConsumptionValue);
        refrigerator.setWeight(weightValue);
        refrigerator.setFreezerCapacity(freezerCapacityValue);
        refrigerator.setOverallCapasity(overallCapacityValue);
        refrigerator.setHeight(heightValue);
        refrigerator.setWidth(widthValue);

        return refrigerator;
    }
}
