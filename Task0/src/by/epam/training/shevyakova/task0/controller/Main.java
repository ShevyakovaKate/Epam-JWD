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

            Criteria<VacuumCleaner> vacuumCleanerCriteria = new Criteria<>();
            vacuumCleanerCriteria.add(VacuumCleaner.BAG_TYPE, "A2");
            vacuumCleanerCriteria.add(VacuumCleaner.CLEANING_WIDTH, 20);
            ResultPrinter.printResult(applianceService.find(vacuumCleanerCriteria));

            Criteria<TabletPC> tabletPCCriteria = new Criteria<>();
            tabletPCCriteria.add(TabletPC.COLOR, "black");
            ResultPrinter.printResult(applianceService.find(tabletPCCriteria));

            Criteria<Speakers> speakersCriteria = new Criteria<>();
            speakersCriteria.add(Speakers.NUMBER_OF_SPEAKERS, 2);
            speakersCriteria.add(Speakers.CORD_LENGTH, 3);
            ResultPrinter.printResult(applianceService.find(speakersCriteria));
        } catch (DAOException e) {
            e.printStackTrace();
        }


    }
}
