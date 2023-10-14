package lk.ijse.la.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import lk.ijse.la.business.custom.CustomerBo;
import lk.ijse.la.business.custom.impl.CustomerBoImpl;
import lk.ijse.la.dto.CustomerDto;

public class CustomerFormController {
    @FXML
    private TextField txtAddress;

    @FXML
    private TextField txtId;

    @FXML
    private TextField txtName;

    @FXML
    private TextField txtTel;

    public void btnSaveOnAction(ActionEvent actionEvent) throws Exception {
        String id = txtId.getText();
        String name = txtName.getText();
        String address = txtAddress.getText();
        String tel = txtTel.getText();

        var dto = new CustomerDto(id, name, address, tel);

        CustomerBo bo = new CustomerBoImpl();
        boolean isSaved = bo.saveCustomer(dto);
    }
}
