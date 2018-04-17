package by.epam.training.shevyakova.task0.dao.creator;

import by.epam.training.shevyakova.task0.entity.Appliance;
import by.epam.training.shevyakova.task0.entity.Speakers;
import by.epam.training.shevyakova.task0.entity.criteria.SearchCriteria;

import java.util.Map;

public class SpeakersCreator implements CreateCommand {
    @Override
    public Appliance create(Map<String, String> propertyMap) {
        Speakers speakers = new Speakers();

        int powerConsumptionValue = Integer.valueOf(propertyMap.get(SearchCriteria.Speakers.POWER_CONSUMPTION.toString()));
        int numberOfSpeakersValue = Integer.valueOf(propertyMap.get(SearchCriteria.Speakers.NUMBER_OF_SPEAKERS.toString()));
        String frequencyRangeValue = propertyMap.get(SearchCriteria.Speakers.FREQUENCY_RANGE.toString());
        int cordLengthValue = Integer.valueOf(propertyMap.get(SearchCriteria.Speakers.CORD_LENGTH.toString()));

        speakers.setPowerConsumption(powerConsumptionValue);
        speakers.setNumberOfSpeakers(numberOfSpeakersValue);
        speakers.setFrequencyRange(frequencyRangeValue);
        speakers.setCordLength(cordLengthValue);

        return speakers;
    }
}
