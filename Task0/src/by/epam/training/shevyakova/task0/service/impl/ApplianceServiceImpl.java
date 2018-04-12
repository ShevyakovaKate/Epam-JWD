package by.epam.training.shevyakova.task0.service.impl;

import by.epam.training.shevyakova.task0.dao.impl.ApplianceDAOImpl;
import by.epam.training.shevyakova.task0.entity.Appliance;
import by.epam.training.shevyakova.task0.entity.criteria.Criteria;
import by.epam.training.shevyakova.task0.exception.DAOException;
import by.epam.training.shevyakova.task0.service.ApplianceService;
import by.epam.training.shevyakova.task0.service.validation.Validator;

import java.util.List;

public class ApplianceServiceImpl implements ApplianceService {
    @Override
    public List<Appliance> find(Criteria criteria) throws DAOException {
        Validator validator = new Validator();
        if (!validator.criteriaValidator(criteria)) {
            return null;
        }

        ApplianceDAOImpl applianceDAO = new ApplianceDAOImpl();
        return applianceDAO.find(criteria);
    }
}
