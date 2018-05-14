package main;

import entity.Node;
import service.ServiceFactory;
import service.XMLAnalyzer;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {
            ServiceFactory serviceFactory = ServiceFactory.getInstance();
            XMLAnalyzer xmlAnalyzer = serviceFactory.getXmlAnalyzer();
            InfoPrinter infoPrinter = new InfoPrinter();
            Node node;
            while ((node = xmlAnalyzer.nextNode()) != null) {
               infoPrinter.printInfo(node);
            }
            xmlAnalyzer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
