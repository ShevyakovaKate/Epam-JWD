package by.epam.training.shevyakova.task0.service;

import by.epam.training.shevyakova.task0.entity.Appliance;
import by.epam.training.shevyakova.task0.entity.criteria.Criteria;
import by.epam.training.shevyakova.task0.exception.DAOException;

import java.util.List;

public interface ApplianceService<E> {
    List<Appliance> find(Criteria criteria) throws DAOException;
}
