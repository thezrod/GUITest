package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.awt.*;
import java.net.URL;
import java.util.ResourceBundle;

public class BussController implements Initializable {

    @FXML
    private Label busnamn;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
    public void setBusnamn(String namn){
        busnamn.setText(namn);
    }
}
