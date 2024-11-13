package Demo;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
//import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.geometry.Insets;
//import javafx.scene.control.RadioButton;
//import javafx.scene.control.ToggleGroup;
import javafx.scene.input.KeyCode;
//import javafx.scene.paint.Color;
import javafx.geometry.Pos;
//import javafx.scene.layout.HBox;
//import javafx.scene.layout.Pane;
//import javafx.scene.text.Text;
import javafx.scene.text.Font;
//import javafx.scene.text.FontWeight;
//import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.util.Duration;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;


public class Exercise16_21 extends Application {
    private final static String MEDIA_URL = "https://liveexample.pearsoncmg.com/common/audio/anthem/anthem0.mp3";

   public static void main(String[] args) {
       launch(args);
   }
  
  
   @Override
   public void start(Stage primaryStage) {


    BorderPane pane = new BorderPane();
    pane.setPadding(new Insets(5, 5, 5, 5));


    TextField tf = new TextField();
    tf.setEditable(true);
    tf.setFont(Font.font("Times", 40));
    tf.setAlignment(Pos.CENTER);
    pane.setCenter(tf);

    //private final static String MEDIA_URL = "https://liveexample.pearsoncmg.com/common/audio/anthem/anthem0.mp3";
    Media media = new Media(MEDIA_URL);
    MediaPlayer mediaPlayer = new MediaPlayer(media);

    EventHandler<ActionEvent> eventHandler = e -> {
        Integer num = Integer.parseInt(tf.getText());
        if(num > 0) {
            num = num - 1;
            tf.setText(Integer.toString(num));
            //System.out.println(num);
        }
        else if(num == 0) {
            mediaPlayer.play();
        }
    };

    Timeline animation = new Timeline(new KeyFrame(Duration.millis(1000), eventHandler));
    animation.setCycleCount(Timeline.INDEFINITE);



    tf.setOnKeyPressed(e -> {
       if (e.getCode() == KeyCode.ENTER) {
           //tf.setStyle("-fx-text-fill: green");
           animation.play();
       }
    });




       Scene scene = new Scene(pane, 200, 200);
       primaryStage.setTitle("Exercise16_21");
       primaryStage.setScene(scene);
       primaryStage.show();
   }
}
