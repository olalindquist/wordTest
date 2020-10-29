package sample;

import javafx.beans.property.SimpleObjectProperty;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class Controller {
    Handler handler =new Handler();
    @FXML
    private TextField from;
    @FXML
    private MenuItem loadButton ;
    @FXML
    private BorderPane bp;



    @FXML
    public void send(KeyEvent keyEvent) throws IOException {
        System.out.println("in Send");

    }

    @FXML
    public void submit(javafx.event.ActionEvent actionEvent) {
        // String a = from.getText();
        System.out.println("click");

    }

    @FXML
    public void loadWords(javafx.event.ActionEvent actionEvent) {
        Scene st = bp.getScene();
        this.handler.load(st);


    }

}





