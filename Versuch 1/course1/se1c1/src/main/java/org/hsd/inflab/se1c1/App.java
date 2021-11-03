package org.hsd.inflab.se1c1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) {

        BorderPane borderPane = new BorderPane();        

        String message = "Hello Java!";
        Button button = new Button("Say: " + message);
        button.setOnAction((event) -> {
            System.out.println(message);
        });

        borderPane.setCenter(button);
        
        Scene scene = new Scene(borderPane, 400, 400);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}