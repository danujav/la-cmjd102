package lk.ijse.hibernate.business.custom.impl;


import lk.ijse.hibernate.business.custom.CustomerBo;
import lk.ijse.hibernate.dao.DaoFactory;
import lk.ijse.hibernate.dao.DaoType;
import lk.ijse.hibernate.dao.custom.CustomerDao;
import lk.ijse.hibernate.dto.CustomerDto;
import lk.ijse.hibernate.entity.Customer;

public class CustomerBoImpl implements CustomerBo {

    private CustomerDao dao = DaoFactory.getDao(DaoType.CUSTOMER);
    @Override
    public void saveCustomer(CustomerDto dto) {
        Customer customer = new Customer(
                dto.getId(),
                dto.getName(),
                dto.getAddress(),
                dto.getTel()
        );

        dao.save(customer);
    }

    @Override
    public CustomerDto searchCustomer(String id) {
        Customer customer = dao.search(id);

        return new CustomerDto(
                customer.getId(),
                customer.getName(),
                customer.getAddress(),
                customer.getTel()
        );
    }
}
