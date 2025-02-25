
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

public class Controller {
	@FXML
	private VBox infoContainer; //"Container" inside the GUI. Will hold labels/information for components, as well as for ias demo.
	@FXML
	private Label titleLabel = new Label(""); //String, used at title for IAS component, gets stored and displayed in infoContainer.
	@FXML
	private Label infoLabel = new Label(""); //String, used for storing and displaying information for IAS components. Also put into infoContainer
	@FXML
	private Button btnStart, btnAC, btnMQ, btnALC, btnMBR, btnIO, btnPC, btnIBR, btnMAR, btnIR, btnCC, btnMM; //Names for all the buttons

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
	
//	@FXML 
//	void move() {
//        Path path = new Path();
//        path.getElements().add(new MoveTo(100, 200)); // Starting point
//        path.getElements().add(new LineTo(400, 200)); // Destination
//
//        PathTransition pathTransition = new PathTransition();
//        pathTransition.setNode(movingCircle);
//        pathTransition.setDuration(Duration.seconds(3));
//        pathTransition.setPath(path);
//        pathTransition.setCycleCount(PathTransition.INDEFINITE);
//        pathTransition.setAutoReverse(true);
//
//        pathTransition.play();
//	}
	/*
	 * Resets labels in infoContainer. Calls on switch case "-1" which calls the default case.
	 */
	@FXML
	void updICClear() {
//		if (animationInProgress) {
//			animationInProgress = false;
//			System.out.println("Animation Killed Prematurely");
//		}
		toggleButtons(true);
		btnStart.setOnAction(event -> initialize2());  //Resets onAction method of btnStart, assumes animation has started, will fix
		btnStart.setText("Start");
		infoContainer.getChildren().clear();
		IASComponentClass.updateLabels(-1, titleLabel, infoLabel, infoContainer);
	}
	@FXML
	public void initialize() {
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
    public void initialize2() {
//        System.out.println("Component Column: " + componentColumn);
//        System.out.println("Instruction Column: " + instructionColumn);

        if (componentColumn == null || instructionColumn == null) {
            System.out.println("❌ ERROR: TableColumns are null! Check FXML fx:id.");
            return;
        }

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

        // Start instruction, now that the list has data.
        startInstruction();
        btnStart.setText("Next");
        btnStart.setOnAction(event -> playAnimation());
        toggleButtons(false);
    }
    
    
    
    
    //IMPORTANT
	int step = 1; //Variable used to be used as parameter for a method. Calls for specific step in animation sequence
	@FXML
	private TextArea movingTxt;
    void playAnimation() {
    	AnimationClass.playAnimation(step, movingTxt);
    	System.out.println(step);
    	step ++;
    	
    }
    
    
    
    
	private void setButtonActions() {
		for (int i = 0; i < Components.size() - 1; i++) {
			Components current = Components.get(i);
			Components next = Components.get(i+1);

			current.getNextButton().setOnAction(event ->
					{moveToNextStage(current, next); });

		}

		Components.get(0).enableButton();

	}

	private void moveToNextStage(Components current, Components next) {
		next.setInstruction(current.getInstruction());
		next.enableButton();
		current.disableButton();
		cpuTableView.refresh();

	}

	private void startInstruction() {
		Components pc = Components.get(0);
		pc.setInstruction("ADD C, A, B");
		pc.enableButton();
		cpuTableView.refresh();

	}

	private void handleNextStep(int index) {
		Components selectedComponent = cpuTableView.getItems().get(index);

		if (index < cpuTableView.getItems().size() - 1) {
			Components nextComponent = cpuTableView.getItems().get(index + 1);
			nextComponent.setInstruction(selectedComponent.getInstruction());
			selectedComponent.setInstruction("-");
		}

		cpuTableView.refresh();
	}
	@FXML
	private Circle myCircle;
	private double x;
	private double y;
	@FXML
	private TextArea myTextArea;


	public void start(ActionEvent e) {
		double initialY = myTextArea.getLayoutY();  // Use getLayoutY() instead of getCenterY()

		// Create a TranslateTransition to animate the TextArea's movement
		TranslateTransition translate = new TranslateTransition();
		translate.setNode(myTextArea); // Set the TextArea as the node to animate
		translate.setDuration(Duration.seconds(3)); // Set animation duration to 3 seconds
		translate.setCycleCount(1); // Run it only once
		translate.setByY(250); // Move 250 units down on the Y-axis
		translate.setAutoReverse(false); // Do not reverse after moving down

		// Start the translation animation
		translate.play();
	}
}



