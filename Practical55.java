/**Write a JavaFX program that displays a bar chart to represent the percentage distribution of
overall grades using Rectangle shapes.
● Projects: 20%, displayed in Red
● Quizzes: 10%, displayed in Blue
● Midterm Exams: 30%, displayed in Green
● Final Exam: 40%, displayed in Orange
Requirements:
1. Each category should be displayed with a labeled bar.
2. Bars should be proportional in height to the percentage.
3. Use the Rectangle class to create the bars.
4. Display the labels (e.g., "Projects — 20%") under each bar.
5. Arrange the bars horizontally in the scene using an HBox or Pane.*/

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.geometry.Pos;

class BarChartFX extends Application {
	 public void start(Stage stage) {
 		System.out.println("Dhruvi Patel");
		System.out.println("240390107027");
 		VBox projectBox = createBar("Projects — 20%", 20, Color.RED);
 		VBox quizBox = createBar("Quizzes — 10%", 10, Color.BLUE);
 		VBox midtermBox = createBar("Midterm — 30%", 30, Color.GREEN);
 		VBox finalBox = createBar("Final — 40%", 40, Color.ORANGE);
 		HBox root = new HBox(20, projectBox, quizBox, midtermBox, finalBox);
 		root.setAlignment(Pos.BOTTOM_CENTER);
 		Scene scene = new Scene(root, 500, 300);
 		stage.setTitle("Grade Distribution");
 		stage.setScene(scene);
 		stage.show();
 	}
 	VBox createBar(String text, int percent, Color color) {
		Rectangle bar = new Rectangle(60, percent * 4);
 		bar.setFill(color);
 		Label label = new Label(text);
 		VBox box = new VBox(5, bar, label);
 		box.setAlignment(Pos.BOTTOM_CENTER);
 		return box;
 	}
	public static void main(String[] args) {
		launch(args);
 	}
}
