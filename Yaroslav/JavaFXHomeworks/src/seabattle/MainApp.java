package seabattle;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Scanner;

public class MainApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();


        Parent root = FXMLLoader.load(getClass().getResource("root.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, i * 10, i * 10));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
