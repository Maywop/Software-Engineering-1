package org.openjfx.se1ce4;


	

import java.util.Arrays;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;


public class App extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			GridPane root = new GridPane();
			root.setPrefWidth(500);
			root.setHgap(20);
			root.setVgap(20);
			
			Scene scene = new Scene(root,640,140);
			
			primaryStage.setScene(scene);
			primaryStage.setResizable(false);
			primaryStage.setTitle("Lottoziehung");
			primaryStage.show();
			
			TextField[] textFields = new TextField[6];
			
			for(int i = 1 ; i <=6;i++) {
				TextField tf = new TextField(""+i);
				tf.setFont(new Font("Arial",30));
				tf.setPrefWidth(85);
				tf.setPrefHeight(40);
				tf.setAlignment(Pos.CENTER);
				tf.setEditable(false);
				
				root.add(tf,i,0);
				
				textFields[i-1] = tf;
			}
			
			Button ziehen = new Button("Ziehen");
			ziehen.setPrefHeight(40);
			ziehen.setPrefWidth(190);
			ziehen.setFont(new Font("Arial",30));
			
			root.add(ziehen,3,1,2,1);
			
			int[] arr = new int[6];
			
			ziehen.setOnAction(new EventHandler<ActionEvent>() {
				
				@Override
				public void handle(ActionEvent e) {
					boolean doppelt;
					do {
						doppelt = false;
						for (int i = 0; i < 6; i++) {
							arr[i] = (int)(Math.random()*49)+1;
						}
						for (int i = 0; i < 6; i++) {
							for(int j =0;j<6;j++) {
								if(i!=j) {
									if(arr[i]==arr[j]) {
										doppelt = true;
									}
								}
							}
						}
					}while(doppelt==true);
					
					Arrays.sort(arr);
					
					for (int i = 0; i < 6; i++) {
						textFields[i].setText(""+arr[i]);
					}
					
				}
			});
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
