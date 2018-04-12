package by.epam.training.shevyakova.task0.dao.creator;

import by.epam.training.shevyakova.task0.entity.Appliance;

import java.util.Map;

public interface CreateCommand {
    Appliance create(Map<String, String> propertyMap);
}
