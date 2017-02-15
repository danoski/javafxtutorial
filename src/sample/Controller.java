package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
import sun.swing.PrintColorUIResource;

public class Controller extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception {
        //set the gridpane
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25,25,25,25));

        Text sceneTitle = new Text("Welcome");
        sceneTitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(sceneTitle,0,0,2,1);


        Label userName = new Label("User name:");
        grid.add(userName, 0, 1);

        TextField userTextField = new TextField();
        grid.add(userTextField, 1, 1);

        Label pw = new Label("Password:");
        grid.add(pw, 0, 2);

        PasswordField pwBox = new PasswordField();
        grid.add(pwBox,1,2);

//        grid.setGridLinesVisible(true);

        /*set the button*/
        Button btn = new Button("Sing In");
        HBox btnHbox = new HBox();
        btnHbox.setAlignment(Pos.BOTTOM_RIGHT);
        btnHbox.getChildren().add(btn);
        grid.add(btnHbox,1,4);

        Text actionTarget = new Text();
        HBox textHbox = new HBox();
        textHbox.setAlignment(Pos.BOTTOM_RIGHT);
        textHbox.getChildren().add(actionTarget);
        actionTarget.setTextAlignment(TextAlignment.RIGHT);
        grid.add(textHbox, 1, 6);

        /*set the button action*/
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                actionTarget.setFill(Color.FIREBRICK);
                actionTarget.setText("Sign in button pressed");
            }
        });

        /*The Scene*/
        Scene scene = new Scene(grid, 350, 275);

        primaryStage.setTitle("Welcome JavaFX");
        primaryStage.setScene(scene);
        scene.getStylesheets().add(Controller.class.getResource("../login/Login.css").toExternalForm());
        primaryStage.show();
    }

    public void handle(){}

    public static void main(String[] args) {
        launch(args);
    }
}
