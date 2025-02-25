package com.example.scenebuilder;

import javafx.animation.SequentialTransition;
import javafx.animation.TranslateTransition;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.util.Duration;

/*
 * Class will be used to store all methods pertaining to animations in the controller class. There will be a method "callAnimation()"
 * which takes an integer argument, which specifies which method or "step" will be played.
 */
public class AnimationClass {
	public static void playAnimation(int i, TextArea t, TextArea t1, TextArea t2, TextArea t3, TextArea t4, TextArea t5) {
		switch (i) {
        case 1:
            t.setText("MAR <- PC");
            t.setVisible(true);
            
            TranslateTransition translate1 = createTranslateTransition(t, Duration.seconds(1.5), 0, 74);
            
            translate1.setOnFinished(e -> t.setVisible(false));
            translate1.play();
            break;
            
        case 3:
            t.setText("Address = 1");
            t.setVisible(true);
            
            // Create transitions using the helper method:
            TranslateTransition ttDown = createTranslateTransition(t, Duration.seconds(1), 0, 100); // move down
            TranslateTransition ttRight = createTranslateTransition(t, Duration.seconds(1), 450, 0); // move right
            TranslateTransition ttUp = createTranslateTransition(t, Duration.seconds(0.5), 0, -50);   // move up
            
            // When the final animation finishes, hide the text area:
            ttUp.setOnFinished(e -> t.setVisible(false));
            
            // Chain the transitions using SequentialTransition:
            SequentialTransition sequential = new SequentialTransition(ttDown, ttRight, ttUp);
            sequential.play();
            break;
        case 4:
        	t.setText("LOAD M(X) 500, ADD M(X) 501");
        	t.setVisible(true);
        	TranslateTransition ttUp3 = createTranslateTransition(t, Duration.seconds(0.5), 0, -100);
        	TranslateTransition ttLeft3 = createTranslateTransition(t, Duration.seconds(0.5), -175, 0);
        	TranslateTransition ttUp31 = createTranslateTransition(t, Duration.seconds(0.5), 0, -130);
        	TranslateTransition ttLeft31 = createTranslateTransition(t, Duration.seconds(0.5), -185, 0);
        	TranslateTransition ttUp32 = createTranslateTransition(t, Duration.seconds(1), 0, -20);
        	
        	//ttUp32.setOnFinished(e -> t.setVisible(false));
        	SequentialTransition sequential3 = new SequentialTransition(ttUp3, ttLeft3, ttUp31, ttLeft31, ttUp32);
        	sequential3.play();
        	break;
        case 5:
        	t1.setText("ADD M(X) 501");
        	t2.setText("LOAD M(X)");
        	t1.setVisible(true); t2.setVisible(true);
        	TranslateTransition ttD4 = createTranslateTransition(t1, Duration.seconds(0.5), 0, 129);
        	TranslateTransition ttR4 = createTranslateTransition(t1, Duration.seconds(0.5), 81, 0);
        	TranslateTransition ttD4t2 = createTranslateTransition(t2, Duration.seconds(0.75), 0, 205);
        	TranslateTransition ttR4t2 = createTranslateTransition(t2, Duration.seconds(0.5), 81, 0);
        	ttR4t2.setOnFinished(e -> t.setVisible(false));
        	SequentialTransition sequential4 = new SequentialTransition(ttD4, ttR4, ttD4t2,ttR4t2);
        	sequential4.play();
        	break;
        case 6:
        	t3.setText("500"); t3.setVisible(true);
        	TranslateTransition ttD5 = createTranslateTransition(t3, Duration.seconds(0.75), 0, 205);
        	TranslateTransition ttL5 = createTranslateTransition(t3, Duration.seconds(0.5), -93, 0);
        	ttL5.setOnFinished(e -> t3.setVisible(false));
        	SequentialTransition sequential5 = new SequentialTransition(ttD5, ttL5); sequential5.play();
        	break;
        case 8:
        	t3.setText("add = 500"); t3.setVisible(true);
        	 TranslateTransition ttD6 = createTranslateTransition(t3, Duration.seconds(1), 0, 100); 
             TranslateTransition ttR6 = createTranslateTransition(t3, Duration.seconds(1), 450, 0); 
             TranslateTransition ttU6 = createTranslateTransition(t3, Duration.seconds(0.5), 0, -50);
             ttU6.setOnFinished(e -> t3.setText("3"));
             SequentialTransition sequential6 = new SequentialTransition(ttD6, ttR6, ttU6); sequential6.play();
             break;
        case 9:
        	TranslateTransition ttU9 = createTranslateTransition(t3, Duration.seconds(0.5), 0, -100);
        	TranslateTransition ttL9 = createTranslateTransition(t3, Duration.seconds(0.5), -175, 0);
        	TranslateTransition ttU91 = createTranslateTransition(t3, Duration.seconds(0.5), 0, -130);
        	TranslateTransition ttL91 = createTranslateTransition(t3, Duration.seconds(0.5), -185, 0);
        	TranslateTransition ttU92 = createTranslateTransition(t3, Duration.seconds(1), 0, -20);
        	
        	ttU92.setOnFinished(e -> t3.setVisible(false));
        	SequentialTransition sequential9 = new SequentialTransition(ttU9, ttL9, ttU91, ttL91, ttU92);
        	sequential9.play();
        	break;
        case 11:
        	t4.setText("3");
        	t4.setVisible(true);
        	TranslateTransition ttU10 = createTranslateTransition(t4, Duration.seconds(0.5), 0, -90);
        	TranslateTransition ttL10 = createTranslateTransition(t4, Duration.seconds(0.5), -70, 0);
        	TranslateTransition ttU10a = createTranslateTransition(t4, Duration.seconds(0.5), 0, -70);
        	ttU10a.setOnFinished(e -> t4.setVisible(false));
        	SequentialTransition sequential10 = new SequentialTransition(ttU10,ttL10,ttU10a); 
        	sequential10.play();
        	break;
        case 13:
        	t5.setText("ADD M(X)");
        	TranslateTransition ttD13 = createTranslateTransition(t5, Duration.seconds(0.5), 0, 75);
        	ttD13.setOnFinished(e -> t2.setVisible(false));
        	SequentialTransition sequential13 = new SequentialTransition(ttD13); 
        	sequential13.play();
        	break;
		}
	}
	public static void changeBtnText(Button b, String newText) {
		b.setText(newText);
	}
	public static TranslateTransition createTranslateTransition(TextArea t, Duration duration, double byX, double byY) {
	    TranslateTransition tt = new TranslateTransition(duration, t);
	    tt.setCycleCount(1);
	    tt.setAutoReverse(false);
	    tt.setByX(byX);
	    tt.setByY(byY);
	    return tt;
	}
}
