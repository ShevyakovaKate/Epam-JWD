package by.epam.training.shevyakova.task0.dao.creator;

import by.epam.training.shevyakova.task0.entity.Appliance;
import by.epam.training.shevyakova.task0.entity.TabletPC;
import by.epam.training.shevyakova.task0.entity.criteria.SearchCriteria;

import java.util.Map;

public class TabletPCCreator implements CreateCommand {
    @Override
    public Appliance create(Map<String, String> propertyMap) {
        TabletPC tabletPC = new TabletPC();

        int batteryCapacityValue = Integer.valueOf(propertyMap.get(SearchCriteria.TabletPC.BATTERY_CAPACITY.toString()));
        int displayInchesValue = Integer.valueOf(propertyMap.get(SearchCriteria.TabletPC.DISPLAY_INCHES.toString()));
        int memoryRomValue = Integer.valueOf(propertyMap.get(SearchCriteria.TabletPC.MEMORY_ROM.toString()));;
        int flashMemoryCapacityValue = Integer.valueOf(propertyMap.get(SearchCriteria.TabletPC.FLASH_MEMORY_CAPACITY.toString()));
        String colorValue = propertyMap.get(SearchCriteria.TabletPC.COLOR.toString());

        tabletPC.setBatteryCapacity(batteryCapacityValue);
        tabletPC.setDisplayInches(displayInchesValue);
        tabletPC.setMemoryRom(memoryRomValue);
        tabletPC.setFlashMemoryCapacity(flashMemoryCapacityValue);
        tabletPC.setColor(colorValue);

        return tabletPC;
    }
}
