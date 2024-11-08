package Demo;
import javafx.application.Application;
//import javafx.event.ActionEvent;
//import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.scene.Scene;
public class Ball extends Application {
   public static void main(String[] args) {
       launch(args);
   }
  
   @Override
   public void start(Stage primaryStage) {
       Circle circle = new Circle(30);
       circle.setStroke(Color.BLACK);
       circle.setFill(Color.BLUE);
       circle.setLayoutX(150);
       circle.setLayoutY(150);
       Pane pane = new Pane(circle);


       HBox hBox = new HBox();
       hBox.setSpacing(10);
       hBox.setAlignment(Pos.CENTER);
       Button btLeft = new Button("Left");
       Button btRight = new Button("Right");
       Button btUp = new Button("Up");
       Button btDown = new Button("Down");
       hBox.getChildren().add(btLeft);
       hBox.getChildren().add(btRight);
       hBox.getChildren().add(btUp);
       hBox.getChildren().add(btDown);




       BorderPane borderPane = new BorderPane();
       borderPane.setCenter(pane);
       borderPane.setBottom(hBox);
       BorderPane.setAlignment(hBox, Pos.CENTER);


       btLeft.setOnAction(e -> {
           circle.setLayoutX(circle.getLayoutX() > 30 ? circle.getLayoutX() - 5 : 30);
       });


       btRight.setOnAction(e -> {
           circle.setLayoutX(circle.getLayoutX() < 270 ? circle.getLayoutX() + 5 : 270);
       });


       btUp.setOnAction(e -> {
           circle.setLayoutY(circle.getLayoutY() > 30 ? circle.getLayoutY() - 5 : 30);
       });


       btDown.setOnAction(e -> {
           circle.setLayoutY(circle.getLayoutY() < 270 ? circle.getLayoutY() + 5 : 270);
       });
     


       Scene scene = new Scene(borderPane, 300, 300);
       primaryStage.setTitle("ControlCircle");
       primaryStage.setScene(scene);
       primaryStage.show();


   }

   
}
