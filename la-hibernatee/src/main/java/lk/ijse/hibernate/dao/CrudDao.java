package lk.ijse.hibernate.dao;

import lk.ijse.hibernate.entity.Customer;

import java.util.List;

public interface CrudDao extends SuperDao{
    void save(Customer customer);

    Customer search(String id);

    boolean delete(String id);

    List<Customer> getAll();

    boolean update(Customer customer);
}
