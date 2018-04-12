package by.epam.training.shevyakova.task0.dao.creator;

import java.util.HashMap;
import java.util.Map;

public class ApplianceCreator {
    /**Package level access*/
    Map<String, CreateCommand> map = new HashMap<>();

    public ApplianceCreator() {
        map.put("Oven", new OvenCreator());
        map.put("Laptop", new LaptopCreator());
        map.put("Refrigerator", new RefrigeratorCreator());
    }

    public CreateCommand getCommand(String commandType) {
        return  map.get(commandType);
    }

}
