package lk.ijse.hibernate.dao.custom.impl;

import lk.ijse.hibernate.dao.custom.CustomerDao;
import lk.ijse.hibernate.entity.Customer;
import lk.ijse.hibernate.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class CustomerDaoImpl implements CustomerDao {

    @Override
    public void save(Customer customer) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        session.persist(customer);

        transaction.commit();
    }

    @Override
    public Customer search(String id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        Customer customer = session.get(Customer.class, id);

        transaction.commit();

        return customer;
    }

    @Override
    public boolean delete(String id) {
        return false;
    }

    @Override
    public List<Customer> getAll() {
        return null;
    }

    @Override
    public boolean update(Customer customer) {
        return false;
    }
}
