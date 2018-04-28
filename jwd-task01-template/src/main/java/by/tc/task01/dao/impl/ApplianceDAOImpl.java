package by.tc.task01.dao.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.creator.ApplianceCreator;
import by.tc.task01.dao.creator.CreateCommand;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.exception.DAOException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ApplianceDAOImpl implements ApplianceDAO{

	private static final String APPLIANCES_DB_PATH = "src\\main\\resources\\appliances_db.txt";
	private ApplianceCreator applianceCreator = new ApplianceCreator();

	@Override
	public List<Appliance> find(Criteria criteria) throws DAOException {
		List<Appliance> appliances = new ArrayList<>();
		try(BufferedReader reader = new BufferedReader(new FileReader(APPLIANCES_DB_PATH))) {
			String applianceLine;
			while ((applianceLine = reader.readLine()) != null) {
				if (applianceLine.isEmpty()) {
					continue;
				}
				if (isAppropriateLine(applianceLine, criteria)) {
					Map<String,String> appliancePropertyMap;
					appliancePropertyMap = createAppliancePropertyMap(applianceLine);
					if (isApplianceSuited(appliancePropertyMap, criteria)) {

						String applianceType = criteria.getParamsClassName();
						Appliance appliance = createAppliance(applianceType, appliancePropertyMap);
						appliances.add(appliance);
					}
				}
			}
		} catch (IOException e) {
			throw new DAOException("File not found.", e);
		}
		return appliances;
	}

	private boolean isAppropriateLine(String applianceLine, Criteria criteria) {
		String line = applianceLine.substring(0, applianceLine.indexOf(" "));
		return line.equals(criteria.getParamsClassName());
	}

	private Map<String, String> createAppliancePropertyMap(String applianceLine) {
		Map<String, String> appliancePropertyMap = new HashMap<>();
		String[] applianceProperties = applianceLine.split("[:;\\s,=]+");
		for (int i = 1; i < applianceProperties.length; i += 2) {
			appliancePropertyMap.put(applianceProperties[i], applianceProperties[i + 1]);
		}
		return appliancePropertyMap;
	}

	private boolean isApplianceSuited(Map<String, String> appliancePropertyMap, Criteria criteria) {
		boolean suited = true;
		List<String> criteriaList = criteria.getListCriteria();
		for (String criterion : criteriaList) {
			String criterionName = criterion.substring(0, criterion.indexOf("="));
			String criterionValue = criterion.substring((criterion.indexOf("=")+1), criterion.length());
			if (!appliancePropertyMap.get(criterionName).equalsIgnoreCase(criterionValue)) {
				suited = false;
			}
		}
		return suited;
	}

	private Appliance createAppliance(String applianceType, Map<String, String > appliancePropertyMap) {
		CreateCommand command = applianceCreator.getCommand(applianceType);
		return command.create(appliancePropertyMap);
	}

}