package by.epam.training.shevyakova.task0.controller;

import by.epam.training.shevyakova.task0.entity.criteria.Criteria;
import by.epam.training.shevyakova.task0.entity.criteria.SearchCriteria.*;
import by.epam.training.shevyakova.task0.exception.DAOException;
import by.epam.training.shevyakova.task0.service.ApplianceService;
import by.epam.training.shevyakova.task0.service.impl.ApplianceServiceImpl;
import by.epam.training.shevyakova.task0.entity.criteria.SearchCriteria;

public class Main {

    public static void main(String[] args) {
        ApplianceService applianceService = new ApplianceServiceImpl();

        try {
            Criteria<Oven> ovenCriteria = new Criteria<>();
            ovenCriteria.add(SearchCriteria.Oven.CAPACITY, 33);
            ovenCriteria.add(SearchCriteria.Oven.DEPTH, 60);
            ResultPrinter.printResult(applianceService.find(ovenCriteria));

            Criteria<SearchCriteria.Laptop> laptopCriteria = new Criteria<>();
            laptopCriteria.add(SearchCriteria.Laptop.BATTERY_CAPACITY, 2);
            ResultPrinter.printResult(applianceService.find(laptopCriteria));

            Criteria<SearchCriteria.Refrigerator> refrigeratorCriteria = new Criteria<>();
            refrigeratorCriteria.add(SearchCriteria.Refrigerator.FREEZER_CAPACITY, 10);
            refrigeratorCriteria.add(SearchCriteria.Refrigerator.OVERALL_CAPACITY, 300);
            ResultPrinter.printResult(applianceService.find(refrigeratorCriteria));
        } catch (DAOException e) {
            e.printStackTrace();
        }


    }
}
