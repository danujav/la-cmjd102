package lk.ijse.hibernate.dao.custom;

import lk.ijse.hibernate.dao.SuperDao;
import lk.ijse.hibernate.entity.Customer;

public interface CustomerDao extends SuperDao {
    void save(Customer customer);
}
