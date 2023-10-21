package lk.ijse.hibernate.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import lk.ijse.hibernate.business.BoFactory;
import lk.ijse.hibernate.business.BoType;
import lk.ijse.hibernate.business.custom.CustomerBo;
import lk.ijse.hibernate.dto.CustomerDto;

public class CustomerFormController {
    @FXML
    private TextField txtAddress;

    @FXML
    private TextField txtId;

    @FXML
    private TextField txtName;

    @FXML
    private TextField txtTel;

    private CustomerBo bo = BoFactory.getBo(BoType.CUSTOMER);

    public void btnSaveOnAction(ActionEvent actionEvent) {
        String id = txtId.getText();
        String name = txtName.getText();
        String address = txtAddress.getText();
        String tel = txtTel.getText();

        var dto = new CustomerDto(id,name, address, tel);
        try {
            bo.saveCustomer(dto);
            new Alert(Alert.AlertType.CONFIRMATION, "customer saved!").show();
        } catch (Exception e) {
            new Alert(Alert.AlertType.ERROR, e.getMessage()).show();
        }
    }


    @FXML
    void txtIdOnAction(ActionEvent event) {
        String id = txtId.getText();

        CustomerDto dto = bo.searchCustomer(id);
        if(dto != null) {
            txtName.setText(dto.getName());
            txtAddress.setText(dto.getAddress());
            txtTel.setText(dto.getTel());
        }
    }
}
