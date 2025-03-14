
package com.example.scenebuilder;

import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.shape.Circle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.util.Callback;

import javafx.scene.shape.Path;
import javafx.animation.PathTransition;
import javafx.util.Duration;

import java.awt.image.ComponentSampleModel;
import java.util.List;

import static com.example.scenebuilder.Components.updTable;

public class Controller {
	@FXML
	private VBox infoContainer; //"Container" inside the GUI. Will hold labels/information for components, as well as for ias demo.
	@FXML
	private Label titleLabel = new Label(""); //String, used at title for IAS component, gets stored and displayed in infoContainer.
	@FXML
	private Label infoLabel = new Label(""); //String, used for storing and displaying information for IAS components. Also put into infoContainer
	@FXML
	private Button btnStart, btnAC, btnMQ, btnALC, btnMBR, btnIO, btnPC, btnIBR, btnMAR, btnIR, btnCC, btnMM; //Names for all the buttons
	
	//private String[] originals = {};

	// For Component Visual Table
	@FXML private TableView<Components> cpuTableView;
	@FXML private TableColumn<Components, String> componentColumn;
	@FXML private TableColumn<Components, String> instructionColumn;
	@FXML private TableColumn<Components, Button> actionColumn;

	private ObservableList<Components> Components = FXCollections.observableArrayList();

	//@FXML
	private void toggleButtons(boolean t) { //If argument is false, disable buttons, true enable
		boolean toggle = true;//Extra boolean used for clarity when calling functions. So toggleButton(true) enables instead of toggleButton(false)
		if (t) {toggle = false;}
	    btnAC.setDisable(toggle);
	    btnMQ.setDisable(toggle);
	    btnALC.setDisable(toggle);
	    btnMBR.setDisable(toggle);
	    btnIO.setDisable(toggle);
	    btnPC.setDisable(toggle);
	    btnIBR.setDisable(toggle);
	    btnMAR.setDisable(toggle);
	    btnIR.setDisable(toggle);
	    btnCC.setDisable(toggle);
	    btnMM.setDisable(toggle);
	}
	/*
	 * Resets labels in infoContainer. Calls on switch case "-1" which calls the default case.
	 */
	void resetBtnTxt() {
		btnPC.setText("PC");
		btnMAR.setText("MAR");
		btnMBR.setText("MBR");
		btnAC.setText("AC");
	}
	@FXML
	void updICClear() {
		step = 1;
		resetMovingTxt();
		resetBtnTxt();
		toggleButtons(true);
		btnStart.setOnAction(event -> initialize2());  //Resets onAction method of btnStart, assumes animation has started, will fix
		btnStart.setText("Start");
		infoContainer.getChildren().clear();
		IASComponentClass.updateLabels(-1, titleLabel, infoLabel, infoContainer);
	}
	@FXML
	public void initialize() {
		initialize0();
		titleLabel.getStyleClass().add("title-label");
		infoLabel.getStyleClass().add("general-label");
		updICClear();
		//initialize2();
	}
	/*
	 * Calls upon updateLabels() method in IASComponentClass. This method is copy and pasted, only difference being
	 * which integer gets passed in as the first argument. Copied and pasted for handleButtonAction 0-10.
	 */
    @FXML
    void handleButtonAction() {
    	//Calls upon method in IASComponent class, passing an int specifying which case.
    	IASComponentClass.updateLabels(0, titleLabel, infoLabel, infoContainer);
    }
    @FXML
    void handleButtonAction1() { //For info, refer to comments on handleButtonAction() above
    	IASComponentClass.updateLabels(1, titleLabel, infoLabel, infoContainer);
    }
    @FXML
    void handleButtonAction2() { //For info, refer to comments on handleButtonAction() above
    	IASComponentClass.updateLabels(2, titleLabel, infoLabel, infoContainer);
    }

    @FXML
    void handleButtonAction3() { //For info, refer to comments on handleButtonAction() above
    	IASComponentClass.updateLabels(3, titleLabel, infoLabel, infoContainer);
    } 
    @FXML
    void handleButtonAction4() { //For info, refer to comments on handleButtonAction() above
    	IASComponentClass.updateLabels(4, titleLabel, infoLabel, infoContainer);
    }
    @FXML
    void handleButtonAction5() { //For info, refer to comments on handleButtonAction() above
    	IASComponentClass.updateLabels(5, titleLabel, infoLabel, infoContainer);
    }
    @FXML
    void handleButtonAction6() { //For info, refer to comments on handleButtonAction() above
    	IASComponentClass.updateLabels(6, titleLabel, infoLabel, infoContainer);
    }
    @FXML
    void handleButtonAction7() { //For info, refer to comments on handleButtonAction() above
    	IASComponentClass.updateLabels(7, titleLabel, infoLabel, infoContainer);
    }

    @FXML
    void handleButtonAction8() { //For info, refer to comments on handleButtonAction() above
    	IASComponentClass.updateLabels(8, titleLabel, infoLabel, infoContainer);
    }
    @FXML
    void handleButtonAction9() { //For info, refer to comments on handleButtonAction() above
    	IASComponentClass.updateLabels(9, titleLabel, infoLabel, infoContainer);
    }
    @FXML
    void handleButtonAction10() { //For info, refer to comments on handleButtonAction() above
    	IASComponentClass.updateLabels(10, titleLabel, infoLabel, infoContainer);
    }

    @FXML
    public void initialize0() {
        // Set up the TableColumn cell value factories.
        componentColumn.setCellValueFactory(new PropertyValueFactory<>("componentName"));
        instructionColumn.setCellValueFactory(new PropertyValueFactory<>("instruction"));

        // Clear and populate the field-level ObservableList so it's not empty.
        Components.clear();
        Components.addAll(
            new Components("PC"),
            new Components("MAR"),
            new Components("MBR"),
            new Components("IR"),
            new Components("IBR"),
            new Components("AC")
        );

        // Set the TableView items using the field.
        cpuTableView.setItems(Components);
    }
    @FXML
    public void initialize2() {
        IASComponentClass.updateLabels(11, titleLabel, infoLabel, infoContainer);
        startInstruction();
        btnStart.setText("Next");
        btnStart.setOnAction(event -> playAnimation());
        btnPC.setText("PC = 1");
        toggleButtons(false);
    }
    
    
    
    
    //IMPORTANT
	int step = 1; //Variable used to be used as parameter for a method. Calls for specific step in animation sequence
	@FXML
	private TextArea movingTxt, movingTxt1, movingTxt2, movingTxt3, movingTxt4, movingTxt5, movingTxt6;
	private boolean isAnimationRunning = false;  /**This is responsible for user to stop spamming nex*/

    void playAnimation() {
    	AnimationClass.playAnimation(step, movingTxt, movingTxt1, movingTxt2, movingTxt3, movingTxt4, movingTxt5, movingTxt6);
    	System.out.println(step);
		if (isAnimationRunning) {
			return;
		}
		isAnimationRunning = true;
		btnStart.setDisable(true);
		TranslateTransition transition = new TranslateTransition(Duration.seconds(1), movingTxt);
		transition.setOnFinished(event -> {
			// Animation finished; re-enable the button and reset the flag.
			isAnimationRunning = false;
			btnStart.setDisable(false);
		});
		transition.play();
		updTable(step, Components, cpuTableView); /**Updates table */

    	switch (step) {
    	case 2:
    		btnMAR.setText("MAR = 1"); break;
    	case 7:
    		btnMAR.setText("MAR = 500"); break;
    	case 10:
    		btnMBR.setText("MBR = 3"); break;
    	case 12:
    		btnAC.setText("AC = 3"); break;
    	case 15: 
    		btnMAR.setText("MAR = 501"); break;
    	case 16:
    		btnPC.setText("PC = 2"); break;
    	case 19:
    		btnMBR.setText("MBR = 4"); break;
    	case 20:
    		btnAC.setText("AC = 7"); break;
    	case 22:
    		btnMAR.setText("MAR = 2"); break;
    	case 27:
    		btnMAR.setText("MAR = 500"); break;
    	case 29:
    		btnMBR.setText("MBR = 7"); break;
    	case 31:
    		movingTxt1.setText("Number 7 Stored in \nmemory address 500");
			break;
    	}
    	step ++;
    	
    }
    
    void resetMovingTxt() {
        // Reset translate values to zero so the node is at its original layout position.
        movingTxt.setTranslateX(0);
        movingTxt.setTranslateY(0);
        movingTxt1.setTranslateX(0);
        movingTxt1.setTranslateY(0);
        movingTxt2.setTranslateX(0);
        movingTxt2.setTranslateY(0);
        movingTxt3.setTranslateX(0);
        movingTxt3.setTranslateY(0);
        movingTxt4.setTranslateX(0);
        movingTxt4.setTranslateY(0);
        movingTxt5.setTranslateX(0);
        movingTxt5.setTranslateY(0);
        movingTxt6.setTranslateX(0);
        movingTxt6.setTranslateY(0);

        movingTxt.setVisible(false);
        movingTxt1.setVisible(false);
        movingTxt2.setVisible(false);
        movingTxt3.setVisible(false);
        movingTxt4.setVisible(false);
        movingTxt5.setVisible(false);
        movingTxt6.setVisible(false);
    }

	private void startInstruction() {
		Components pc = Components.get(0);
		pc.enableButton();
		cpuTableView.refresh();

	}

}

