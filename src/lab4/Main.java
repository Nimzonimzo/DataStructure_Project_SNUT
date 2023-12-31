package lab4;

import javafx.application.Application;
import javafx.scene.layout.HBox;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Welcome to our Drawing program! | Press C to copy and V to paste |");
        System.out.println("Drawing program has started");
        SidePanel sidePanel = new SidePanel();
        ShapePanel shapePanel = new ShapePanel();
        DrawingModel model = new DrawingModel(sidePanel, shapePanel);
        DrawingPanel drawingPanel = new DrawingPanel(model);


        HBox root = new HBox(drawingPanel,shapePanel , sidePanel);

        primaryStage.setScene(new Scene(root, 500, 500));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
