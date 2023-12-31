package lk.ijse.jdbc.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import lk.ijse.jdbc.business.BoFactory;
import lk.ijse.jdbc.business.BoType;
import lk.ijse.jdbc.business.custom.CustomerBo;
import lk.ijse.jdbc.business.custom.ItemBo;
import lk.ijse.jdbc.business.custom.impl.CustomerBoImpl;
import lk.ijse.jdbc.dto.CustomerDto;

public class CustomerFormController {
    @FXML
    private TextField txtAddress;

    @FXML
    private TextField txtId;

    @FXML
    private TextField txtName;

    @FXML
    private TextField txtTel;

    public void btnSaveOnAction(ActionEvent actionEvent) {
        String id = txtId.getText();
        String name = txtName.getText();
        String address = txtAddress.getText();
        String tel = txtTel.getText();

        var dto = new CustomerDto(id, name, address, tel);

        CustomerBo bo = BoFactory.getBo(BoType.CUSTOMER);
        try {
            boolean isSaved = bo.saveCustomer(dto);
            if(isSaved) {
                new Alert(Alert.AlertType.CONFIRMATION, "customer saved!").show();
            }
        } catch (Exception e) {
            new Alert(Alert.AlertType.ERROR, e.getMessage()).show();
        }
    }
}
