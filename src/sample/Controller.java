package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import static javafx.fxml.FXMLLoader.load;

public class Controller {
    @FXML
    private TextField searchfield;

    public void changeView(javafx.event.ActionEvent actionEvent) throws IOException {
        if(searchfield.getText().equals("Chalmers")){
            searchfield.setText("Yeah");
            Stage primaryStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            primaryStage.setResizable(false);
            Parent start = load(getClass().getResource("departureBoard.fxml"));
            primaryStage.setScene(new Scene(start, 300, 275));
        }
        else
            searchfield.setText("Fel");
    }

}
