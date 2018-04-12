package by.epam.preTraining.shevyakova.task8.controller;

import by.epam.preTraining.shevyakova.task8.entity.criteria.Criteria;
import by.epam.preTraining.shevyakova.task8.entity.criteria.SearchCriteria.*;
import by.epam.preTraining.shevyakova.task8.service.ApplianceService;
import by.epam.preTraining.shevyakova.task8.service.impl.ApplianceServiceImpl;

public class Main {

    public static void main(String[] args) {
        ApplianceService applianceService = new ApplianceServiceImpl();

        Criteria<Oven> ovenCriteria = new Criteria<>();
        ovenCriteria.add(Oven.CAPACITY, 33);
        ovenCriteria.add(Oven.DEPTH, 60);
        ResultPrinter.printResult(applianceService.find(ovenCriteria));

        Criteria<Laptop> laptopCriteria = new Criteria<>();
        laptopCriteria.add(Laptop.BATTERY_CAPACITY, 2);
        ResultPrinter.printResult(applianceService.find(laptopCriteria));

        Criteria<Refrigerator> refrigeratorCriteria = new Criteria<>();
        refrigeratorCriteria.add(Refrigerator.FREEZER_CAPACITY, 10);
        refrigeratorCriteria.add(Refrigerator.OVERALL_CAPACITY, 300);
        ResultPrinter.printResult(applianceService.find(refrigeratorCriteria));
    }
}
