package lk.ijse.hibernate.dao.custom.impl;

import lk.ijse.hibernate.dao.custom.CustomerDao;
import lk.ijse.hibernate.entity.Customer;
import lk.ijse.hibernate.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class CustomerDaoImpl implements CustomerDao {

    @Override
    public void save(Customer customer) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        session.persist(customer);

        transaction.commit();
    }
}
