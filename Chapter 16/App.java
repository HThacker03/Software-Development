package Demo;
import javafx.application.Application;
//import javafx.event.ActionEvent;
//import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.paint.Color;
import javafx.geometry.Pos;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

 
public class App extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    

    
    @Override
    public void start(Stage primaryStage) {

     Text text = new Text (150, 80, "Programming is fun :)");
      text.setFont(Font.font("Times New Roman", FontWeight.BOLD, 20));
     BorderPane pane = new BorderPane();
        HBox paneForButtons = new HBox(20);
        Button btLeft = new Button("<=");
        Button btRight = new Button("=>");
        paneForButtons.getChildren().addAll(btLeft, btRight);
        paneForButtons.setAlignment(Pos.CENTER);
        paneForButtons.setStyle("-fx-border-color: green");

        pane.setBottom(paneForButtons);

        Pane paneForText = new Pane();
        paneForText.getChildren().add(text);
        pane.setCenter(paneForText);

        btLeft.setOnAction(e -> text.setX(text.getX() > 0 ? text.getX() - 10 : 0));
        btRight.setOnAction(e -> text.setX(text.getX() < 310 ? text.getX() + 10 : 310));


        //Radio buttons
        HBox paneForRadioButtons = new HBox(20);
        paneForRadioButtons.setPadding(new Insets(5, 5, 5, 5));
        paneForRadioButtons.setStyle("-fx-border-width: 2px; -fx-border-color: green");

        RadioButton rbRed = new RadioButton("Red");
        RadioButton rbYellow = new RadioButton("Yellow");
        RadioButton rbBlack = new RadioButton("Black");
        RadioButton rbOrange = new RadioButton("Orange");
        RadioButton rbGreen = new RadioButton("Green");
        
        paneForRadioButtons.getChildren().addAll(rbRed, rbYellow, rbBlack, rbOrange, rbGreen);
        pane.setTop(paneForRadioButtons);

        ToggleGroup group = new ToggleGroup();
        rbRed.setToggleGroup(group);
        rbYellow.setToggleGroup(group);
        rbBlack.setToggleGroup(group);
        rbOrange.setToggleGroup(group);
        rbGreen.setToggleGroup(group);

        rbRed.setOnAction (e -> {
            if (rbRed.isSelected()) {
                text.setFill(Color.RED);
            }
        });

        rbBlack.setOnAction (e -> {
            if (rbBlack.isSelected()) {
                text.setFill(Color.BLACK);
            }
        });

        rbYellow.setOnAction (e -> {
            if (rbYellow.isSelected()) {
                text.setFill(Color.YELLOW);
            }
        });

        rbOrange.setOnAction (e -> {
            if (rbOrange.isSelected()) {
                text.setFill(Color.ORANGE);
            }
        });

        rbGreen.setOnAction (e -> {
            if (rbGreen.isSelected()) {
                text.setFill(Color.GREEN);
            }
        });

        Scene scene = new Scene(pane, 500, 200);
        primaryStage.setTitle("Exercise16_01");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}