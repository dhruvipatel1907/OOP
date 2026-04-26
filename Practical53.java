/**Create a JavaFX app that shows a circle which continuously bounces (left↔right) inside
the scene. Provide:
● A Start and Stop button.
● A Slider to control the ball speed (min: slow, max: fast).
● When window is resized, the ball should keep bouncing within new bounds.
UI / Classes to use: Pane or AnchorPane, Circle, TranslateTransition or AnimationTimer,
Button, Slider.
Following behavior is expected:
● Press Start → ball moves horizontally and reverses on boundaries.
● Move Slider while running → ball speed updates.
● Press Stop → animation pauses.*/

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.geometry.Pos;
import javafx.scene.layout.HBox;
import javafx.animation.AnimationTimer;

class BouncingBall extends Application {
	double dx = 2;
 	AnimationTimer timer;
 	public void start(Stage stage) {
		System.out.println("Dhruvi Patel");
		System.out.println("240390107027");
 		Pane pane = new Pane();
 		Circle ball = new Circle(20, Color.BLUE);
 		ball.setCenterX(50);
 		ball.setCenterY(100);
 		pane.getChildren().add(ball);
 		Button startBtn = new Button("Start");
		Button stopBtn = new Button("Stop");
 		Slider speedSlider = new Slider(1, 10, 2);
 		HBox controls = new HBox(10, startBtn, stopBtn, speedSlider);
 		controls.setAlignment(Pos.CENTER);
 		BorderPane root = new BorderPane();
 		root.setCenter(pane);
 		root.setBottom(controls);
 		timer = new AnimationTimer() {
 			public void handle(long now) {
 				double speed = speedSlider.getValue();
 				ball.setCenterX(ball.getCenterX() + dx * speed);
 				if (ball.getCenterX() >= pane.getWidth() - ball.getRadius() || ball.getCenterX() <= ball.getRadius()) {
 					dx = -dx;
 				}
 			}
 		};
 		startBtn.setOnAction(e -> timer.start());
 		stopBtn.setOnAction(e -> timer.stop());
 		Scene scene = new Scene(root, 400, 300);
 		stage.setTitle("Bouncing Ball");
 		stage.setScene(scene);
 		stage.show();
 	}
 	public static void main(String[] args) {
 	launch(args);
 	}
}
