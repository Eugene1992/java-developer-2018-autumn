package seabattle;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.stage.Stage;

import java.awt.*;
import java.util.Scanner;

public class GridPaneForceColsAndRows extends Application {

    @Override
    public void start(Stage primaryStage) {
        Scanner sc = new Scanner(System.in);
        GridPane root = new GridPane();
        root.setGridLinesVisible(true);
        final int numCols = sc.nextInt();
        final int numRows = sc.nextInt();
        for (int i = 0; i < numCols; i++) {
            for (int j = 0; j < numRows; j++) {
                Button button = new Button();
                root.add(button, i * 1, j * 1);
            }
        }
        primaryStage.setScene(new Scene(root, numCols * 60, numRows * 60));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}