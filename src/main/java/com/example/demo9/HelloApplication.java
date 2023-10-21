package com.example.demo9;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();

        // https://rur.hitmotop.com/get/music/20170903/ilipp_Kirkorov_-_Sneg_48107198.mp3
        // https://sun6-20.userapi.com/s/v1/ig2/2WRq59ZpcELxEj1SLrRQIAUZHL6TwDSHZIGK8mQKcERrS-cCPADYmhkoxAkwQatCYk3o2SCFyo-cAxkfPenP-Q_S.jpg?size=1117x1117&quality=96&crop=369,61,1117,1117&ava=1

    }

    public static void main(String[] args) {
        launch();
    }
}