/**Design a registration form UI with fields: Roll_NO (numeric), Name, Age (numeric), Email
and a Submit button. Requirements:
● Validate inputs on submit:
1. RollNo and Age must be integers.
2. Email must contain @ and . (basic check).
● On success show a confirmation Alert with entered data.
● On validation failure show an error alert describing the issue.
UI / Classes to use: GridPane, TextField, Button, Alert, FileChooser,
FileWriter/BufferedWriter.*/


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.stage.FileChooser;
import java.io.*;

class RegistrationForm extends Application {
	public void start(Stage stage) {
		System.out.println("Dhruvi Patel");
		System.out.println("240390107027");
 		GridPane grid = new GridPane();
 		grid.setPadding(new Insets(20));
 		grid.setHgap(10);
 		grid.setVgap(10);
 		Label rollLabel = new Label("Roll No:");
 		TextField rollField = new TextField();
 		Label nameLabel = new Label("Name:");
 		TextField nameField = new TextField();
 		Label ageLabel = new Label("Age:");
 		TextField ageField = new TextField();
 		Label emailLabel = new Label("Email:");
 		TextField emailField = new TextField();
		Button submitBtn = new Button("Submit");
	 	grid.add(rollLabel, 0, 0);
		grid.add(rollField, 1, 0);
 		grid.add(nameLabel, 0, 1);
 		grid.add(nameField, 1, 1);
 		grid.add(ageLabel, 0, 2);
 		grid.add(ageField, 1, 2);
 		grid.add(emailLabel, 0, 3);
 		grid.add(emailField, 1, 3);
 		grid.add(submitBtn, 1, 4);
 		submitBtn.setOnAction(e -> {
 			try {
 				int roll = Integer.parseInt(rollField.getText());
 				int age = Integer.parseInt(ageField.getText());
 				String name = nameField.getText();
 				String email = emailField.getText();
 				if (!email.contains("@") || !email.contains(".")) {
 					throw new Exception("Invalid Email Format");
 				}
 				FileChooser fc = new FileChooser();
 				File file = fc.showSaveDialog(stage);
 				if (file != null) {
 					BufferedWriter bw = new BufferedWriter(new FileWriter(file));

 					bw.write("Roll: " + roll + "\n");
 					bw.write("Name: " + name + "\n");
 					bw.write("Age: " + age + "\n");
 					bw.write("Email: " + email);

 					bw.close();
 				}
 				Alert alert = new Alert(Alert.AlertType.INFORMATION);
 				alert.setTitle("Success");
 				alert.setContentText("Registered Successfully!\n\n" + "Roll: " + roll + "\n" + "Name: " + name + "\n" + "Age: " + age + "\n" + "Email: " + email);
 				alert.show();
				} catch (NumberFormatException ex) {
 					Alert alert = new Alert(Alert.AlertType.ERROR);
 					alert.setTitle("Error");
 					alert.setContentText("Roll No and Age must be integers");
 					alert.show();
 				} catch (Exception ex) {
 					Alert alert = new Alert(Alert.AlertType.ERROR);
 					alert.setTitle("Error");
 					alert.setContentText(ex.getMessage());
 					alert.show();
 				}
 			});
 			Scene scene = new Scene(grid, 350, 250);
 			stage.setTitle("Registration Form");
 			stage.setScene(scene);
 			stage.show();
 		}
 		public static void main(String[] args) {
 		launch(args);
 	}
}
