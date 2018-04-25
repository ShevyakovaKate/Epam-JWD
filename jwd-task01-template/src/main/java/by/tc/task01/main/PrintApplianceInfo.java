package by.tc.task01.main;

import by.tc.task01.entity.Appliance;

import java.util.List;

public class PrintApplianceInfo {
	private static final String NOT_FOUND_MESSAGE = "The appliance is not found.";

	public static void print(List<Appliance> applianceList) {
		String result = applianceList.isEmpty() ? NOT_FOUND_MESSAGE : applianceList.toString();
		System.out.println(result);
	}

}
