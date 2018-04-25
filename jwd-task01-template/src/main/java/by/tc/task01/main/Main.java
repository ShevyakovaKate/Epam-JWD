package by.tc.task01.main;

import static by.tc.task01.entity.criteria.SearchCriteria.*;

import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.exception.DAOException;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.ServiceFactory;

public class Main {

	public static void main(String[] args) {

		ServiceFactory factory = ServiceFactory.getInstance();
		ApplianceService service = factory.getApplianceService();

		//////////////////////////////////////////////////////////////////

		Criteria<Oven> criteriaOven = new Criteria<Oven>(Oven.class);
		criteriaOven.add(Oven.CAPACITY, 33);

		try {
			PrintApplianceInfo.print(service.find(criteriaOven));
		} catch (DAOException e) {
			e.printStackTrace();
		}

		//////////////////////////////////////////////////////////////////

		criteriaOven = new Criteria<Oven>(Oven.class);
		criteriaOven.add(Oven.HEIGHT, 200);
		criteriaOven.add(Oven.DEPTH, 300);

		try {
			PrintApplianceInfo.print(service.find(criteriaOven));
		} catch (DAOException e) {
			e.printStackTrace();
		}

		//////////////////////////////////////////////////////////////////
		
		Criteria<TabletPC> criteriaTabletPC = new Criteria<TabletPC>(TabletPC.class);
		criteriaTabletPC.add(TabletPC.COLOR, "BLUE");
		criteriaTabletPC.add(TabletPC.DISPLAY_INCHES, 14);
		criteriaTabletPC.add(TabletPC.MEMORY_ROM, 8000);

		try {
			PrintApplianceInfo.print(service.find(criteriaTabletPC));
		} catch (DAOException e) {
			e.printStackTrace();
		}

	}

}
