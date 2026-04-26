/**Write a JavaFX program that displays five Text nodes vertically (stacked). For each Text:

Use font Times New Roman, bold + italic, size 22 px.
Assign a random color and random opacity (between 0.3 and 1.0) to each text.
Center the texts horizontally in the window and add spacing between them.

UI / Classes to use: VBox, Text, Font, Color, Random.
On launch the window shows five vertically arranged lines (e.g., “Text 1”, ... “Text 5”)
each with different color & opacity and same font style.*/

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.FontPosture;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.geometry.Pos;
import java.util.Random;

class TextDisplay extends Application {
 	public void start(Stage stage) {
 		System.out.println("Dhruvi Patel");
		System.out.println("240390107027");
 		VBox vbox = new VBox(15);
 		vbox.setAlignment(Pos.CENTER);
 		Random rand = new Random();
 		for (int i = 1; i <= 5; i++) {
 			Text text = new Text("Text " + i);
 			text.setFont(Font.font("Times New Roman", FontWeight.BOLD,
			FontPosture.ITALIC, 22));
			Color color = Color.color(rand.nextDouble(), rand.nextDouble(),
			rand.nextDouble());
 			text.setFill(color);
 			double opacity = 0.3 + (0.7 * rand.nextDouble());
 			text.setOpacity(opacity);
 			vbox.getChildren().add(text);
 		}
 		Scene scene = new Scene(vbox, 400, 300);
 		stage.setTitle("Random Text Display");
 		stage.setScene(scene);
 		stage.show();
 	}
 
	public static void main(String[] args) {
 		launch(args);
 	}
}
