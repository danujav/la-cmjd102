package lk.ijse.la.business;

import lk.ijse.la.business.custom.impl.CustomerBoImpl;
import lk.ijse.la.business.custom.impl.ItemBoImpl;

public class BoFactory {
    public static <T extends SuperBo>T getBo(BoType type) {
        switch (type) {
            case CUSTOMER :
                return (T) new CustomerBoImpl();
            case ITEM:
                return (T) new ItemBoImpl();
            default:
                return null;
        }
    }
}
