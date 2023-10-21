package lk.ijse.jdbc.dao.custom;

import lk.ijse.jdbc.entity.Customer;

public interface CustomerDao {
    boolean save(Customer customer) throws Exception;
}
