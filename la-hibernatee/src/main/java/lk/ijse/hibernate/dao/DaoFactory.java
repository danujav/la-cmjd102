package lk.ijse.hibernate.dao;

import lk.ijse.hibernate.dao.custom.impl.CustomerDaoImpl;

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
