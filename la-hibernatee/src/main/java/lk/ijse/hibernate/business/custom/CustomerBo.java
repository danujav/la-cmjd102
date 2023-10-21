package lk.ijse.hibernate.business.custom;

import lk.ijse.hibernate.business.SuperBo;
import lk.ijse.hibernate.dto.CustomerDto;

public interface CustomerBo extends SuperBo {
    void saveCustomer(CustomerDto dto) ;
}
