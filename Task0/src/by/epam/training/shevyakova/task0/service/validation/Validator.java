package by.epam.training.shevyakova.task0.service.validation;

import by.epam.training.shevyakova.task0.entity.criteria.Criteria;

import java.util.List;

public class Validator {
    private static final String stringCriteriaType = "OS";

    public boolean criteriaValidator(Criteria criteria) {

        List<String> userCriteriaList = criteria.getListCriteria();
        if (userCriteriaList.isEmpty()) {
            return false;
        }
        for (String userCriterion : userCriteriaList) {
            String criteriaType = userCriterion.substring(0, userCriterion.indexOf("="));
            if(!stringCriteriaType.contains(criteriaType)) {
                String criteriaValue = userCriterion.substring(userCriterion.indexOf("=")+1, userCriterion.length()).trim();
                try {
                    Double.parseDouble(criteriaValue);
                } catch (NumberFormatException e) {
                    return false;
                }
            }
        }
        return true;
    }
}
