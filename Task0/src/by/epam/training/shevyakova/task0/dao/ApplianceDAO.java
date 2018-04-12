package by.epam.training.shevyakova.task0.dao;

import by.epam.training.shevyakova.task0.entity.Appliance;
import by.epam.training.shevyakova.task0.entity.criteria.Criteria;
import by.epam.training.shevyakova.task0.exception.DAOException;

import java.util.List;

public interface ApplianceDAO<E> {
    List<Appliance> find(Criteria<E> criteria) throws DAOException;
}

