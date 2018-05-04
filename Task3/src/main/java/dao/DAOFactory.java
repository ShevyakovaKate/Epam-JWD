package dao;

import dao.impl.AirportDAOImpl;

public final class DAOFactory {
    private static final DAOFactory instance = new DAOFactory();

    private final AirportDAO airportDAO = new AirportDAOImpl();

    private DAOFactory() {
    }

    public AirportDAO getAirportDAO() {
        return airportDAO;
    }

    public static DAOFactory getInstance() {
        return instance;
    }
}
