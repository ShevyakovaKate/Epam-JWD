package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;

import java.util.List;

public class Validator {

	private static final String stringCriteriaType = "OS, FILTER_TYPE, BAG_TYPE, WAND_TYPE, COLOR, FREQUENCY_RANGE";

	public static  boolean criteriaValidator(Criteria criteria) {

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
