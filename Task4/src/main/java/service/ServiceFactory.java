package service;

import service.impl.XMLAnalyzerImpl;

public final class ServiceFactory {

    private static final ServiceFactory instance = new ServiceFactory();

    private final XMLAnalyzer xmlAnalyzer = new XMLAnalyzerImpl();

    private ServiceFactory() {
    }

    public XMLAnalyzer getXmlAnalyzer() {
        return xmlAnalyzer;
    }

    public static ServiceFactory getInstance() {
        return instance;
    }
}
