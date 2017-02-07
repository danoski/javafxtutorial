package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Controller extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception {
        Button btn = new Button();
        btn.setText("Hello World");

        //create event handler
        btn.setOnAction(new EventHandler<ActionEvent>(){

            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World");
            }
        });

        /*stack the pane*/
        StackPane root = new StackPane();
        root.getChildren().add(btn);

        /*set the pane*/
        Scene scene = new Scene(root,300,150);
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void handle(){}

    public static void main(String[] args) {
        launch(args);
    }
}
