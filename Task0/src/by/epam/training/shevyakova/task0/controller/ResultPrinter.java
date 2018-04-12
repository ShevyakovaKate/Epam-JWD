package by.epam.training.shevyakova.task0.controller;

import by.epam.training.shevyakova.task0.entity.Appliance;

import java.util.List;

public class ResultPrinter {

    private static final String NOT_FOUND_MESSAGE = "The appliance is not found.";

    public static void printResult(List<Appliance> applianceList) {
        String result = applianceList.isEmpty() ? NOT_FOUND_MESSAGE : applianceList.toString();
        System.out.println(result);
    }
}
