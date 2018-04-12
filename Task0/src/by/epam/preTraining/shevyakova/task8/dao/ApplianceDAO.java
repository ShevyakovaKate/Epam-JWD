package by.epam.preTraining.shevyakova.task8.dao;

import by.epam.preTraining.shevyakova.task8.entity.Appliance;
import by.epam.preTraining.shevyakova.task8.entity.criteria.Criteria;

import java.util.List;

public interface ApplianceDAO<E> {
    List<Appliance> find(Criteria<E> criteria);
}

