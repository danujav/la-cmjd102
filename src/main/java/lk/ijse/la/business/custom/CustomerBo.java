package lk.ijse.la.business.custom;

import lk.ijse.la.dto.CustomerDto;

public interface CustomerBo {
    boolean saveCustomer(CustomerDto dto) throws Exception;
}
