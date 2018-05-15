package by.tc.task4.main;

import by.tc.task4.entity.Node;
import by.tc.task4.service.ServiceFactory;
import by.tc.task4.service.XMLAnalyzer;

public class Main {

    public static void main(String[] args) {
        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        try ( XMLAnalyzer xmlAnalyzer = serviceFactory.getXmlAnalyzer()) {
            InfoPrinter infoPrinter = new InfoPrinter();
            Node node;
            while ((node = xmlAnalyzer.nextNode()) != null) {
               infoPrinter.printInfo(node);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
