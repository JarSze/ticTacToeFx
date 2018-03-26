package com.javaLearning.controller;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import com.javaLearning.viewmodel.ConnectionDialogViewModel;

/**
 * Created by jszeligowski on 2018-03-25.
 */

public class ConnectionDialogController
{
    @FXML
    public TextField serverAddressTextField;

    @FXML
    public TextField playerNameTextField;

    public ConnectionDialogViewModel getConnectionDetails()
    {
        return new ConnectionDialogViewModel( serverAddressTextField.getText(),
            playerNameTextField.getText() );
    }
}
