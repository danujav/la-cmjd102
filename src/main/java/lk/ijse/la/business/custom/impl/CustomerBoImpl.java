package lk.ijse.la.business.custom.impl;

import lk.ijse.la.business.custom.CustomerBo;
import lk.ijse.la.dao.CustomerDao;
import lk.ijse.la.dto.CustomerDto;
import lk.ijse.la.entity.Customer;

public class CustomerBoImpl implements CustomerBo {
    @Override
    public boolean saveCustomer(CustomerDto dto) throws Exception {
        String id = dto.getId();
        String name = dto.getName();
        String address = dto.getAddress();
        String tel = dto.getTel();

        var customer = new Customer(id, name, address, tel);

        CustomerDao customerDao = new CustomerDao();
        boolean isSaved = customerDao.save(customer);

        return isSaved;
    }
}
