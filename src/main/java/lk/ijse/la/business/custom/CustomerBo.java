package lk.ijse.la.business.custom;

import lk.ijse.la.business.SuperBo;
import lk.ijse.la.dto.CustomerDto;

public interface CustomerBo extends SuperBo {
    boolean saveCustomer(CustomerDto dto) throws Exception;
}
