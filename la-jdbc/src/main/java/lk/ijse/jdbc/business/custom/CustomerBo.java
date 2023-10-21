package lk.ijse.jdbc.business.custom;

import lk.ijse.jdbc.business.SuperBo;
import lk.ijse.jdbc.dto.CustomerDto;

public interface CustomerBo extends SuperBo {
    boolean saveCustomer(CustomerDto dto) throws Exception;
}
