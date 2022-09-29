package com.example.scrollbar;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.ScrollBar;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;



public class HelloApplication extends Application{

    public void start(Stage primaryStage){

        ScrollBar scroll = new ScrollBar();
        scroll.setMin(0);
        scroll.setMax(2000);
        scroll.setValue(1000);
        scroll.setOrientation(Orientation.HORIZONTAL);
        scroll.setUnitIncrement(100);
        scroll.setBlockIncrement(10);
        StackPane root = new StackPane();
        root.getChildren().add(scroll);
        Scene scene = new Scene(root,300,200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("ScrollBar");
        primaryStage.show();

    }
    public static void main(String[] args) {
        launch(args);
    }

}
