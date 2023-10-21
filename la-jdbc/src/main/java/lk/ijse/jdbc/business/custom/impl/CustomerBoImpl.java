package lk.ijse.jdbc.business.custom.impl;

import lk.ijse.jdbc.business.custom.CustomerBo;
import lk.ijse.jdbc.dao.custom.CustomerDao;
import lk.ijse.jdbc.dao.custom.impl.CustomerDaoImpl;
import lk.ijse.jdbc.dto.CustomerDto;
import lk.ijse.jdbc.entity.Customer;

public class CustomerBoImpl implements CustomerBo {
    @Override
    public boolean saveCustomer(CustomerDto dto) throws Exception {
        String id = dto.getId();
        String name = dto.getName();
        String address = dto.getAddress();
        String tel = dto.getTel();

        var customer = new Customer(id, name, address, tel);

        CustomerDao customerDao = new CustomerDaoImpl();
        boolean isSaved = customerDao.save(customer);

        return isSaved;
    }
}
