package trab.caretaker.__init__;

import javafx.application.Application;
import javafx.stage.Stage;
import trab.caretaker.control.Watch;

public class __init__ extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Watch watch = new Watch();
        watch.run();
    }

}
