package by.tc.task4.dao;

import by.tc.task4.dao.impl.XMLFileReaderImpl;

public final class DAOFactory {
    private static final DAOFactory instance = new DAOFactory();

    private final XMLFileReader xmlFileReader = new XMLFileReaderImpl();

    private DAOFactory() {}

    public static DAOFactory getInstance() {
        return instance;
    }

    public XMLFileReader getXmlFileReader() {
        return xmlFileReader;
    }
}
