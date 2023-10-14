package lk.ijse.la.dao.custom;

import lk.ijse.la.entity.Customer;

public interface CustomerDao {
    boolean save(Customer customer) throws Exception;
}
