package main;

import entity.Airplane;
import service.AirportService;
import service.ServiceFactory;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        ServiceFactory factory = ServiceFactory.getInstance();
        AirportService service = factory.getAirportService();
        ResultPrinter printer = new ResultPrinter();

        //////////////////////////////////////////////////////////////////////

        int totalCarryingCapacity = service.calculateTotalCarryingCapacity();
        printer.printResult(totalCarryingCapacity);

        /////////////////////////////////////////////////////////////////////

        int totalSeatingCapacity = service.calculateTotalSeatingCapacity();
        printer.printResult(totalSeatingCapacity);

        /////////////////////////////////////////////////////////////////////

        List<Airplane> suitableAirplanes = service.searchForGivenFuelConsumption(500, 1000);
        printer.printResult(suitableAirplanes);

        /////////////////////////////////////////////////////////////////////

        service.sort();
        printer.printResult(service.getAirport());
    }
}
