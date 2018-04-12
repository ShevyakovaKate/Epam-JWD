package by.epam.preTraining.shevyakova.task8.service;

import by.epam.preTraining.shevyakova.task8.entity.Appliance;
import by.epam.preTraining.shevyakova.task8.entity.criteria.Criteria;

import java.util.List;

public interface ApplianceService<E> {
    List<Appliance> find(Criteria criteria);
}
