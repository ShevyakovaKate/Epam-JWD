package by.epam.training.shevyakova.task0.dao.creator;

import by.epam.training.shevyakova.task0.entity.Appliance;
import by.epam.training.shevyakova.task0.entity.Oven;
import by.epam.training.shevyakova.task0.entity.criteria.SearchCriteria;

import java.util.Map;

public class OvenCreator implements CreateCommand {
    @Override
    public Appliance create(Map<String, String> propertyMap) {
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
