package org.openjfx.ub9_1;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;


/**
 * JavaFX App
 */
public class App extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		class  Person {
			String name;
			int jahr;
			boolean status;
			
			public Person(String neuerName, int Geburtsjahr, boolean checkStatus) {
				name = neuerName;
				jahr = Geburtsjahr;
				status = checkStatus;
			}	
		}
		
		primaryStage.setTitle("Person");
		Group group = new Group ();
		group.prefWidth(250);
		group.prefHeight(250);
		
		Button buttonNeu = new Button();
		buttonNeu.setText("NEU");
		buttonNeu.setLayoutX(150);
		buttonNeu.setLayoutY(120);
		
		
		Button buttonOk = new Button();
		buttonOk.setText("OK");
		buttonOk.setLayoutX(200);
		buttonOk.setLayoutY(120);		
		
		Label labelName = new Label();
		labelName.setText("Name");
		labelName.setLayoutX(50);
		labelName.setLayoutY(30);		
		
		Label labelJahr = new Label();
		labelJahr.setText("Geburtsjahr");
		labelJahr.setLayoutX(50);
		labelJahr.setLayoutY(60);		
		
		Label labelStatus = new Label();
		labelStatus.setText("Stand");
		labelStatus.setLayoutX(50);
		labelStatus.setLayoutY(90);
		
		
		
		TextField textField = new TextField();
		textField.setLayoutX(120);
		textField.setLayoutY(30);
		
		
		CheckBox checkBox = new CheckBox ("verheiratet");
		checkBox.setLayoutX(120);
		checkBox.setLayoutY(90);

		
		
		ComboBox<String> cb= new ComboBox<>();
		cb.setLayoutX(120);
		cb.setLayoutY(60);
		cb.prefWidth(40);
		cb.prefHeight(40);
		cb.setPromptText("");
		cb.setEditable(false);
		int i;
		for (i=2021;i >= 1900 ;i--) {
			String a = Integer.toString(i);	
			cb.getItems().addAll(a);
		
		}
		
		
		group.getChildren().addAll(buttonNeu,buttonOk,checkBox,textField,cb,labelName,labelJahr,labelStatus);
		Scene scene = new Scene(group,300,150);
		
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
		buttonNeu.setOnAction(e ->{
			textField.setText("");
			checkBox.setSelected(false);
			cb.setItems(null);
		});
		
		buttonOk.setOnAction(e ->{
			
		
		});
		
		
	}	
		
    public static void main(String[] args) {
        launch();
        
 
	}
}