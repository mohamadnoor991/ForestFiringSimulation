package com.example.forestfires2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 900, 500);

        stage.setTitle("Forest firing simulation");
        Image forest=new Image("forest.png");
        stage.getIcons().add(forest);
        stage.setScene(scene);
        stage.show();
        //Close exit mechanises
        stage.setOnCloseRequest(event->{
            event.consume();
            onHelloButtonClick(stage);
        });
    }
    protected void onHelloButtonClick(Stage stage) {

        Alert alert=new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Closing Program");
        alert.setHeaderText("Did you save all your work!!");
        alert.setContentText("Are  you sure you want to close the program ?");

        if(alert.showAndWait().get()== ButtonType.OK){
            stage.close();
        }
    }

    public static void main(String[] args) {
        launch();
    }
}