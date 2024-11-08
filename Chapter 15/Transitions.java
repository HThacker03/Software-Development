package Demo;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.animation.PathTransition;
import javafx.animation.FadeTransition;
import javafx.animation.Timeline;
//import javafx.event.ActionEvent;
//import javafx.event.EventHandler;
//import javafx.geometry.Pos;
//import javafx.scene.control.Button;
//import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
//import javafx.scene.layout.StackPane;
//import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
//import javafx.scene.text.Font;
import javafx.scene.shape.Polygon;
import javafx.util.Duration;
import javafx.stage.Stage;
import javafx.scene.Scene;

public class Transitions extends Application {
   public static void main(String[] args) {
       launch(args);
   }
  
   @Override
   public void start(Stage primaryStage) {
      Pane pane = new Pane();

      Rectangle rectangle = new Rectangle(25, 50);
      rectangle .setFill(Color.PURPLE);

      // Create a polygon and place polygon to pane
      Polygon polygon = new Polygon();
      polygon.setFill(Color.WHITE);
      polygon.setStroke(Color.BLACK);
      ObservableList<Double> list = polygon.getPoints();
     
      double centerX = 150, centerY = 150;
      double radius = Math.min(150, 150) * 0.4;


      // s represents the number of sides of the shape
      // Make sure to update this number when necessary
      int s = 8;
      System.out.println(pane.getWidth() + " " +centerY + " " +radius + " " );
      // Add points to the polygon list
      for (int i = 0; i < s; i++) {
          list.add(centerX + radius * Math.cos(2 * i * Math.PI / s));
          list.add(centerY - radius * Math.sin(2 * i * Math.PI / s));
      }    
     
      pane.getChildren().clear();
      pane.getChildren().add(polygon);
      pane.getChildren().add(rectangle);
      //create path transition

      PathTransition pt = new PathTransition();
      pt.setDuration(Duration.millis(4000));
      pt.setPath(polygon);
      pt.setNode(rectangle);
      pt.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
      pt.setCycleCount(Timeline.INDEFINITE);
      pt.setAutoReverse(true);
      pt.play();

      polygon.setOnMousePressed(e -> pt.pause());
      polygon.setOnMouseReleased(e -> pt.play());

      //Fade Transition
      FadeTransition ft = new FadeTransition(Duration.millis(3000), rectangle);
      ft.setFromValue(1.0);
      ft.setToValue(0.1);
      ft.setCycleCount(Timeline.INDEFINITE);
      ft.setAutoReverse(true);
      ft.play();

       Scene scene = new Scene(pane, 300, 300);
       primaryStage.setTitle("PathTransition");
       primaryStage.setScene(scene);
       primaryStage.show();


   }
// class MyPolygon extends Pane {
//    private void paint() {
       
      
//    }
  
//    @Override
//    public void setWidth(double width) {
//        super.setWidth(width);
//        paint();
//    }
  
//    @Override
//    public void setHeight(double height) {
//        super.setHeight(height);
//        paint();
//    }
// }

   
}
