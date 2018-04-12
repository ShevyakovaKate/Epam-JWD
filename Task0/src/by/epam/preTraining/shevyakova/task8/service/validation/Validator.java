package by.epam.preTraining.shevyakova.task8.service.validation;

import by.epam.preTraining.shevyakova.task8.entity.criteria.Criteria;

import java.util.List;

public class Validator<E> {
    public boolean criteriaValidator(Criteria criteria) {
        List<String> userCriterisList = criteria.getListCriteria();
        if (userCriterisList == null) {
            return false;
        }
        return true;
    }
}
