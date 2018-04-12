package by.epam.preTraining.shevyakova.task8.dao.creator;

import by.epam.preTraining.shevyakova.task8.entity.Appliance;
import by.epam.preTraining.shevyakova.task8.entity.Oven;
import by.epam.preTraining.shevyakova.task8.entity.criteria.SearchCriteria;

import java.util.HashMap;

public class OvenCreator implements CreateCommand {
    @Override
    public Appliance create(HashMap<String, String> propertyMap) {
        Oven oven = new Oven();

        int powerConsumptionValue = Integer.valueOf(propertyMap.get(SearchCriteria.Oven.POWER_CONSUMPTION.toString()));
        int weightValue = Integer.valueOf(propertyMap.get(SearchCriteria.Oven.WEIGHT.toString()));
        int capacityValue = Integer.valueOf(propertyMap.get(SearchCriteria.Oven.CAPACITY.toString()));
        int depthValue = Integer.valueOf(propertyMap.get(SearchCriteria.Oven.DEPTH.toString()));
        int heightValue = Integer.valueOf(propertyMap.get(SearchCriteria.Oven.HEIGHT.toString()));
        int widthValue = Integer.valueOf(propertyMap.get(SearchCriteria.Oven.WIDTH.toString()));

        oven.setPowerConsumption(powerConsumptionValue);
        oven.setWeight(weightValue);
        oven.setCapacity(capacityValue);
        oven.setDepth(depthValue);
        oven.setHeight(heightValue);
        oven.setWidth(widthValue);

        return oven;
    }
}
