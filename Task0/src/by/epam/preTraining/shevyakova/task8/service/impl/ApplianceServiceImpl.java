package by.epam.preTraining.shevyakova.task8.service.impl;

import by.epam.preTraining.shevyakova.task8.dao.impl.ApplianceDAOImpl;
import by.epam.preTraining.shevyakova.task8.entity.Appliance;
import by.epam.preTraining.shevyakova.task8.entity.criteria.Criteria;
import by.epam.preTraining.shevyakova.task8.service.ApplianceService;
import by.epam.preTraining.shevyakova.task8.service.validation.Validator;

import java.util.List;

public class ApplianceServiceImpl implements ApplianceService {
    @Override
    public List<Appliance> find(Criteria criteria) {
        Validator validator = new Validator();
        if (!validator.criteriaValidator(criteria)) {
            return null;
        }

        ApplianceDAOImpl applianceDAO = new ApplianceDAOImpl();
        return applianceDAO.find(criteria);
    }
}
