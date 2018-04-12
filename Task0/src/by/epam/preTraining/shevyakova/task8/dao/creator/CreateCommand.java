package by.epam.preTraining.shevyakova.task8.dao.creator;

import by.epam.preTraining.shevyakova.task8.entity.Appliance;
import by.epam.preTraining.shevyakova.task8.entity.criteria.Criteria;

import java.util.HashMap;

public interface CreateCommand {
    public Appliance create(HashMap<String, String> propertyMap);
}
