package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import static javafx.fxml.FXMLLoader.load;

public class DepartureController implements Initializable {


    @FXML
    private ListView<String> listView;
  /**  final ListView lv = new ListView(FXCollections.observableList(Arrays.asList("one", "2", "3")));
    lv.setOnMouseClicked(new EventHandler<MouseEvent>() {

        @Override
        public void handle(MouseEvent event) {
            System.out.println("clicked on " + lv.getSelectionModel().getSelectedItem());
        }
    });*/


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ObservableList<String> observableList = FXCollections.observableArrayList("16 Eketrägatan", "16 Marklandsgatan");
        listView.setItems(observableList);
        listView.setOnMouseClicked(new EventHandler<MouseEvent>() {

            @Override
            public void handle(MouseEvent event) {
                System.out.println("clicked on " + listView.getSelectionModel().getSelectedItem());
               // BussController bc = new BussController();
               // bc.setBusnamn(listView.getSelectionModel().getSelectedItem());
            }
        });
    }

    public void cellPressed(javafx.event.ActionEvent actionEvent) throws IOException {
        Stage primaryStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        primaryStage.setResizable(false);
        Parent start = load(getClass().getResource("bussen.fxml"));
        primaryStage.setScene(new Scene(start, 300, 275));
    }
    public void backButtonPressed(javafx.event.ActionEvent actionEvent) throws IOException{
        Stage primaryStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        primaryStage.setResizable(false);
        Parent start = load(getClass().getResource("startView.fxml"));
        primaryStage.setScene(new Scene(start, 300, 275));
    }
}
