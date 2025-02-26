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
	public static void playAnimation(int i, TextArea t, TextArea t1, TextArea t2, TextArea t3, TextArea t4, TextArea t5, TextArea t6) {
		switch (i) {
        case 1:
            t.setText("MAR <- PC");
            t.setVisible(true);
            
            TranslateTransition translate1 = createTranslateTransition(t, Duration.seconds(1), 0, 74);
            
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
        	t5.setVisible(true); t2.setVisible(false);
        	TranslateTransition ttD13 = createTranslateTransition(t5, Duration.seconds(0.5), 0, 75);
        	ttD13.setOnFinished(e -> t2.setVisible(false));
        	TranslateTransition moveT2up = createTranslateTransition(t2, Duration.seconds(0.5), 0, -75);
        	t2.setText("501");
        	SequentialTransition sequential13 = new SequentialTransition(ttD13, moveT2up); 
        	sequential13.play();
        	break;
        case 14:
        	t2.setVisible(true);
        
        	TranslateTransition ttD15 = createTranslateTransition(t2, Duration.seconds(0.5), 0, 30);
        	TranslateTransition ttl15 = createTranslateTransition(t2, Duration.seconds(0.5), -175, 0);
        	TranslateTransition ttD152 = createTranslateTransition(t2, Duration.seconds(0.5), 0, 45);
        	ttD152.setOnFinished(e -> t2.setVisible(false));
        	SequentialTransition sequential15 = new SequentialTransition(ttD15, ttl15,ttD152);
        	sequential15.play();
        	break;
        case 17:
            t2.setText("Address = 1");
            t2.setVisible(true);
            
            // Create transitions using the helper method:
            TranslateTransition ttDown17 = createTranslateTransition(t2, Duration.seconds(1), 0, 100); // move down
            TranslateTransition ttRight17 = createTranslateTransition(t2, Duration.seconds(1), 450, 0); // move right
            TranslateTransition ttUp17 = createTranslateTransition(t2, Duration.seconds(0.5), 0, -50);   // move up
            
            // When the final animation finishes, hide the text area:
            ttUp17.setOnFinished(e -> t2.setText("4"));
            
            // Chain the transitions using SequentialTransition:
            SequentialTransition sequential17 = new SequentialTransition(ttDown17, ttRight17, ttUp17);
            sequential17.play();
            break;
        case 18:
        	//Copy Step 8 copied 9 actually
           	TranslateTransition ttU18 = createTranslateTransition(t2, Duration.seconds(0.5), 0, -100);
        	TranslateTransition ttL18 = createTranslateTransition(t2, Duration.seconds(0.5), -175, 0);
        	TranslateTransition ttU181 = createTranslateTransition(t2, Duration.seconds(0.5), 0, -130);
        	TranslateTransition ttL181 = createTranslateTransition(t2, Duration.seconds(0.5), -185, 0);
        	TranslateTransition ttU182 = createTranslateTransition(t2, Duration.seconds(1), 0, -20);
        	ttU182.setOnFinished(e -> t2.setVisible(false));
        	//ttU92.setOnFinished(e -> t3.setVisible(false));
        	SequentialTransition sequential18 = new SequentialTransition(ttU18, ttL18, ttU181, ttL181, ttU182); 
        	sequential18.play();
        	break;
        case 21:
            t.setTranslateX(0); //reset position since it hasn't been called for awhile 
            t.setTranslateY(0);
            t.setText("MAR <- PC");
            t.setVisible(true);
            
            TranslateTransition translate21 = createTranslateTransition(t, Duration.seconds(1), 0, 74);
            
            translate21.setOnFinished(e -> t.setVisible(false));
            translate21.play();
            break;
        case 23:
            t.setText("Address = 2");
            t.setVisible(true);
            
            // Create transitions using the helper method:
            TranslateTransition ttD23 = createTranslateTransition(t, Duration.seconds(1), 0, 100); // move down
            TranslateTransition ttR23 = createTranslateTransition(t, Duration.seconds(1), 450, 0); // move right
            TranslateTransition ttU23 = createTranslateTransition(t, Duration.seconds(0.5), 0, -50);   // move up
            
            // When the final animation finishes, hide the text area:
            ttU23.setOnFinished(e -> t.setText("STOR M(X), Other ins"));
            
            // Chain the transitions using SequentialTransition:
            SequentialTransition sequential23 = new SequentialTransition(ttD23, ttR23, ttU23);
            sequential23.play();
            break;
        case 24:
        	TranslateTransition ttU24 = createTranslateTransition(t, Duration.seconds(0.5), 0, -100);
        	TranslateTransition ttL24 = createTranslateTransition(t, Duration.seconds(0.5), -175, 0);
        	TranslateTransition ttU24a = createTranslateTransition(t, Duration.seconds(0.5), 0, -130);
        	TranslateTransition ttL24a = createTranslateTransition(t, Duration.seconds(0.5), -185, 0);
        	TranslateTransition ttU24b = createTranslateTransition(t, Duration.seconds(1), 0, -20);
        	ttU24b.setOnFinished(e -> t.setVisible(false));
        	//ttU92.setOnFinished(e -> t3.setVisible(false));
        	SequentialTransition sequential24 = new SequentialTransition(ttU24, ttL24, ttU24a, ttL24a, ttU24b); 
        	sequential24.play();
        	break;
        case 25:
        	t4.setTranslateX(0); //reset position of these two since it hasnt been called in awhile. 
            t4.setTranslateY(0);
            t3.setTranslateX(0); 
            t3.setTranslateY(0);
            t3.setText("(Other Ins)"); t4.setText("STOR M(X)");
            t3.setVisible(true); t4.setVisible(true);
        	TranslateTransition ttD425t3 = createTranslateTransition(t3, Duration.seconds(0.5), 0, 129);
        	TranslateTransition ttR25t3 = createTranslateTransition(t3, Duration.seconds(0.5), 81, 0);
        	TranslateTransition ttD25t4 = createTranslateTransition(t4, Duration.seconds(0.5), 0, 205);
        	TranslateTransition ttR25t4 = createTranslateTransition(t4, Duration.seconds(0.5), 81, 0);
        	ttD425t3.setOnFinished(e -> t5.setVisible(false)); t1.setTranslateX(0); t1.setTranslateY(0);
        	ttR25t4.setOnFinished(e -> t1.setVisible(false)); t5.setTranslateX(0); t5.setTranslateY(0);
        	SequentialTransition sequential25 = new SequentialTransition(ttD425t3, ttR25t3, ttD25t4,ttR25t4);
        	sequential25.play();
        	break;
        case 26:
        	t1.setText("500"); t1.setVisible(true);
        	TranslateTransition ttD26 = createTranslateTransition(t1, Duration.seconds(0.75), 0, 205);
        	TranslateTransition tt26 = createTranslateTransition(t1, Duration.seconds(0.5), -93, 0);
            SequentialTransition sequential26 = new SequentialTransition(ttD26, tt26); 
            tt26.setOnFinished(e -> t1.setVisible(false));
            sequential26.play();
            break;
        case 28: 
        	t6.setText("7"); t6.setVisible(true);
        	TranslateTransition ttD28 = createTranslateTransition(t6, Duration.seconds(0.75), 0, 75);
        	TranslateTransition ttR28 = createTranslateTransition(t6, Duration.seconds(0.5), 81, 0);
        	TranslateTransition ttD28a = createTranslateTransition(t6, Duration.seconds(0.75), 0, 75);
        	
        	SequentialTransition sequential28 = new SequentialTransition(ttD28, ttR28, ttD28a);
        	sequential28.play();
        	break;
        case 30:
        	t1.setText("Address = 500");
        	t1.setVisible(true);
        	TranslateTransition tt1Down30 = createTranslateTransition(t1, Duration.seconds(1), 0, 100); // move down
            TranslateTransition tt1Right30 = createTranslateTransition(t1, Duration.seconds(1), 450, 0); // move right
            TranslateTransition tt1Up30 = createTranslateTransition(t1, Duration.seconds(0.5), 0, -50);   // move up
            
            TranslateTransition tt6D30 = createTranslateTransition(t6, Duration.seconds(0.75), 0, 35);
            TranslateTransition tt6R30 = createTranslateTransition(t6, Duration.seconds(0.75), 170, 0);
            TranslateTransition tt6D30a = createTranslateTransition(t6, Duration.seconds(0.75), 0, 150);
            TranslateTransition tt6R30a = createTranslateTransition(t6, Duration.seconds(0.75), 185, 0);
            TranslateTransition tt6D30b = createTranslateTransition(t6, Duration.seconds(0.75), 0, 70);
            tt6D30b.setOnFinished(e -> t6.setVisible(false));
            SequentialTransition sequential30 = new SequentialTransition(tt1Down30, tt1Right30, tt1Up30, tt6D30, tt6R30, tt6D30a, tt6R30a, tt6D30b);
            sequential30.play(); break;
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
