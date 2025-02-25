package com.example.scenebuilder;

import javafx.animation.TranslateTransition;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.util.Duration;

/*
 * Class will be used to store all methods pertaining to animations in the controller class. There will be a method "callAnimation()"
 * which takes an integer argument, which specifies which method or "step" will be played.
 */
public class AnimationClass {
	public static void playAnimation(int i, TextArea t) {
		switch (i) {
//		case 1:
//			t.setText("MAR <- PC");
//			t.setVisible(true); 
//			double initialY = t.getLayoutY();  // Use getLayoutY() instead of getCenterY()
//
//			// Create a TranslateTransition to animate the TextArea's movement
//			TranslateTransition translate = new TranslateTransition();
//			translate.setNode(t); // Set the TextArea as the node to animate
//			translate.setDuration(Duration.seconds(2)); // Set animation duration to 3 seconds
//			translate.setCycleCount(1); // Run it only once
//			translate.setByY(74); // Move 250 units down on the Y-axis
//			translate.setAutoReverse(false); // Do not reverse after moving down
//			
//			translate.setOnFinished(e -> t.setVisible(false));
//
//			// Start the translation animation
//			translate.play();
//		case 2:
//			t.setText("Address = 1");
//			initialY = t.getLayoutY();  // Use getLayoutY() instead of getCenterY()
//
//			// Create a TranslateTransition to animate the TextArea's movement
//			translate = new TranslateTransition();
//			translate.setNode(t); // Set the TextArea as the node to animate
//			translate.setDuration(Duration.seconds(1)); // Set animation duration to 3 seconds
//			translate.setCycleCount(1); // Run it only once
//			translate.setByY(74); // Move 250 units down on the Y-axis
//			translate.setAutoReverse(false); // Do not reverse after moving down
//			
//			translate.setOnFinished(e -> t.setVisible(false));
        case 1:
            t.setText("MAR <- PC");
            t.setVisible(true);
            
            // Create first TranslateTransition for step 1
            TranslateTransition translate1 = new TranslateTransition(Duration.seconds(2), t);
            translate1.setCycleCount(1);
            translate1.setAutoReverse(false);
            translate1.setByY(74);
            
            // When step 1 finishes, start step 2
            translate1.setOnFinished(e -> t.setVisible(false));
            translate1.play();
            break;
            
        case 2:
        	t.setText("Address = 1");
            t.setVisible(true);
            
            // First transition: Move down by 100
            TranslateTransition translateDown = new TranslateTransition(Duration.seconds(1), t);
            translateDown.setCycleCount(1);
            translateDown.setAutoReverse(false);
            translateDown.setByY(100);
            
            // Second transition: Move right by 50
            TranslateTransition translateRight = new TranslateTransition(Duration.seconds(1), t);
            translateRight.setCycleCount(1);
            translateRight.setAutoReverse(false);
            translateRight.setByX(450);
            
            // Third transition: Move up by 100
            translateRight.setOnFinished(e -> t.setVisible(false));  // Hide text area when done
            
            // Chain the transitions:
            translateDown.setOnFinished(e -> translateRight.play());
            
            // Start the first animation
            translateDown.play();
            break;
    
		}
	}
	public static void changeBtnText(Button b, String newText) {
		b.setText(newText);
	}
	public static void translateX() {
		
	}
	public static void translateY() {
		
	}
}
