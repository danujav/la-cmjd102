package lk.ijse.la.dao;

import lk.ijse.la.dao.custom.impl.CustomerDaoImpl;

public class DaoFactory {
    public static <T extends SuperDao>T getDao(DaoType type) {
        switch (type) {
            case CUSTOMER :
                return (T) new CustomerDaoImpl();
            default:
                return null;
        }
    }
}
