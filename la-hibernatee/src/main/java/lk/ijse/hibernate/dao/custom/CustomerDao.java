package lk.ijse.hibernate.dao.custom;

import lk.ijse.hibernate.dao.CrudDao;
import lk.ijse.hibernate.dao.SuperDao;
import lk.ijse.hibernate.entity.Customer;

public interface CustomerDao extends CrudDao {
    void save(Customer customer);
}
