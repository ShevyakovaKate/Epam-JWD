package by.tc.task01.dao.creator;

import by.tc.task01.entity.Appliance;

import java.util.Map;

public interface CreateCommand {
    Appliance create(Map<String, String> propertyMap);
}
