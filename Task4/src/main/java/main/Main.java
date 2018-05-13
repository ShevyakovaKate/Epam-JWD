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
            Node node;
            while ((node = xmlAnalyzer.nextNode()) != null) {
                System.out.println(node);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
