package sample;

import com.sun.javafx.robot.FXRobot;
import com.sun.javafx.robot.FXRobotFactory;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{


        FXMLLoader loader = new FXMLLoader(getClass().getResource("MainGUI.fxml"));
        Parent root = (Parent) loader.load();
        Controller controller = loader.getController();
        primaryStage.setTitle("Car Park System");
        Scene main = new Scene(root, 1200, 700);
        main.getStylesheets().add(Main.class.getResource("css.css").toExternalForm());
        primaryStage.setScene(main);
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
