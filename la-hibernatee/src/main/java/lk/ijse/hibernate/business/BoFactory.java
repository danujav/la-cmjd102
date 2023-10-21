package lk.ijse.hibernate.business;

import lk.ijse.hibernate.business.custom.impl.CustomerBoImpl;

public class BoFactory {
    public static <T extends SuperBo>T getBo(BoType type) {
        switch (type) {
            case CUSTOMER :
                return (T) new CustomerBoImpl();
            default:
                return null;
        }
    }
}
