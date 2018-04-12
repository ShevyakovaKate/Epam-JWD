package by.epam.preTraining.shevyakova.task8.dao.creator;

import by.epam.preTraining.shevyakova.task8.entity.Appliance;
import by.epam.preTraining.shevyakova.task8.entity.Laptop;
import by.epam.preTraining.shevyakova.task8.entity.criteria.SearchCriteria;

import java.util.HashMap;

public class LaptopCreator implements CreateCommand {
    @Override
    public Appliance create(HashMap<String, String> propertyMap) {
        Laptop laptop = new Laptop();

        int batteryCapacityValue = Integer.valueOf(propertyMap.get(SearchCriteria.Laptop.BATTERY_CAPACITY.toString()));
        String osValue = propertyMap.get(SearchCriteria.Laptop.OS.toString());
        int memoryRomValue = Integer.valueOf(propertyMap.get(SearchCriteria.Laptop.MEMORY_ROM.toString()));
        int systemMemoryValue = Integer.valueOf(propertyMap.get(SearchCriteria.Laptop.SYSTEM_MEMORY.toString()));
        double cpuValue = Double.valueOf(propertyMap.get(SearchCriteria.Laptop.CPU.toString()));
        int displayInchsValue = Integer.valueOf(propertyMap.get(SearchCriteria.Laptop.DISPLAY_INCHS.toString()));

        laptop.setBatteryCapacity(batteryCapacityValue);
        laptop.setOs(osValue);
        laptop.setMemoryRom(memoryRomValue);
        laptop.setSystemMemory(systemMemoryValue);
        laptop.setCpu(cpuValue);
        laptop.setDisplayInchs(displayInchsValue);

        return laptop;
    }
}
