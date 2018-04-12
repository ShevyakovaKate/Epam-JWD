package by.epam.preTraining.shevyakova.task8.controller;

import by.epam.preTraining.shevyakova.task8.entity.Appliance;

import java.util.List;

public class ResultPrinter {
    public static void printResult(List<Appliance> applianceList) {
        if (applianceList.size() != 0) {
            System.out.println(applianceList.toString());
        } else {
            System.out.println("The appliance is not found.");
        }
    }
}
