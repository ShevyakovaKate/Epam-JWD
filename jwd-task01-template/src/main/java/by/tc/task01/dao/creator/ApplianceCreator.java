package by.tc.task01.dao.creator;

import java.util.HashMap;
import java.util.Map;

public class ApplianceCreator {
    /**Package level access*/
    Map<String, CreateCommand> map = new HashMap<>();

    public ApplianceCreator() {
        map.put("Oven", new OvenCreator());
        map.put("Laptop", new LaptopCreator());
        map.put("Refrigerator", new RefrigeratorCreator());
        map.put("VacuumCleaner", new VacuumCleanerCreator());
        map.put("TabletPC", new TabletPCCreator());
        map.put("Speakers", new SpeakersCreator());
    }

    public CreateCommand getCommand(String commandType) {
        return  map.get(commandType);
    }

}
