
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
	int step = 0; //Variable used to be used as parameter for a method. 
	@FXML
	private VBox infoContainer; //"Container" inside the GUI. Will hold labels/information for components, as well as for ias demo.
	@FXML
	private Label titleLabel = new Label(""); //String, used at title for IAS component, gets stored and displayed in infoContainer.
	@FXML
	private Label infoLabel = new Label(""); //String, used for storing and displaying information for IAS components. Also put into infoContainer

	// For Component Visual Table
	@FXML private TableView<Components> cpuTableView;
	@FXML private TableColumn<Components, String> componentColumn;
	@FXML private TableColumn<Components, String> instructionColumn;
	@FXML private TableColumn<Components, Button> actionColumn;

	private ObservableList<Components> Components = FXCollections.observableArrayList();
	
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


	@FXML
	void updICClear() {
		infoContainer.getChildren().clear();
		IASComponentClass.updateLabels(-1, titleLabel, infoLabel);
		titleLabel.getStyleClass().add("title-label");
		infoLabel.getStyleClass().add("general-label");
		infoContainer.getChildren().addAll(titleLabel, infoLabel);
	}
	@FXML
	public void initialize() {
		updICClear();
		//initialize2();
	}

    @FXML
    void handleButtonAction() {
    	IASComponentClass.updateLabels(0, titleLabel, infoLabel);
		infoContainer.getChildren().clear(); 
		infoContainer.getChildren().add(titleLabel);
		infoContainer.getChildren().add(infoLabel);
    }
    @FXML
    void handleButtonAction1() {
    	IASComponentClass.updateLabels(1, titleLabel, infoLabel);
		infoContainer.getChildren().clear(); 
		infoContainer.getChildren().add(titleLabel);
		infoContainer.getChildren().add(infoLabel);
    }
    @FXML
    void handleButtonAction2() {
    	IASComponentClass.updateLabels(2, titleLabel, infoLabel);
		infoContainer.getChildren().clear(); 
		infoContainer.getChildren().add(titleLabel);
		infoContainer.getChildren().add(infoLabel);
    }

    @FXML
    void handleButtonAction3() {
    	IASComponentClass.updateLabels(3, titleLabel, infoLabel);
    	infoContainer.getChildren().clear(); 
    	infoContainer.getChildren().add(titleLabel);
    	infoContainer.getChildren().add(infoLabel);
    }
    @FXML
    void handleButtonAction4() {
    	IASComponentClass.updateLabels(4, titleLabel, infoLabel);
		infoContainer.getChildren().clear(); 
		infoContainer.getChildren().add(titleLabel);
		infoContainer.getChildren().add(infoLabel);
    }
    @FXML
    void handleButtonAction5() {
    	IASComponentClass.updateLabels(5, titleLabel, infoLabel);
		infoContainer.getChildren().clear(); 
		infoContainer.getChildren().add(titleLabel);
		infoContainer.getChildren().add(infoLabel);
    }
    @FXML
    void handleButtonAction6() {
    	IASComponentClass.updateLabels(6, titleLabel, infoLabel);
		infoContainer.getChildren().clear(); 
		infoContainer.getChildren().add(titleLabel);
		infoContainer.getChildren().add(infoLabel);
    }
    @FXML
    void handleButtonAction7() {
    	IASComponentClass.updateLabels(7, titleLabel, infoLabel);
    	infoContainer.getChildren().clear(); 
    	infoContainer.getChildren().add(titleLabel);
    	infoContainer.getChildren().add(infoLabel);
    }

    @FXML
    void handleButtonAction8() {
    	IASComponentClass.updateLabels(8, titleLabel, infoLabel);
		infoContainer.getChildren().clear(); 
		infoContainer.getChildren().add(titleLabel);
		infoContainer.getChildren().add(infoLabel);
    }
    @FXML
    void handleButtonAction9() {
    	IASComponentClass.updateLabels(9, titleLabel, infoLabel);
		infoContainer.getChildren().clear(); 
		infoContainer.getChildren().add(titleLabel);
		infoContainer.getChildren().add(infoLabel);
    }
    @FXML
    void handleButtonAction10() {
    	IASComponentClass.updateLabels(10, titleLabel, infoLabel);
		infoContainer.getChildren().clear(); 
		infoContainer.getChildren().add(titleLabel);
		infoContainer.getChildren().add(infoLabel);
    }

	public void initialize2() {
//		componentColumn.setCellValueFactory(new PropertyValueFactory<>("componentName"));
//		instructionColumn.setCellValueFactory(new PropertyValueFactory<>("instruction"));
//
//		actionColumn.setCellFactory(param -> new TableCell<>() {
//			private final Button button = new Button("Next");
//
//			@Override
//			protected void updateItem(Button item, boolean empty) {
//				super.updateItem(item, empty);
//				if (empty) {
//					setGraphic(null);
//				} else {
//					setGraphic(button);
//					button.setOnAction(event -> handleNextStep(getIndex()));
//				}
//			}
//		});
//
//		ObservableList<Components> componentList = FXCollections.observableArrayList(
//				new Components("PC"),
//				new Components("MAR"),
//				new Components("MBR"),
//				new Components("IR"),
//				new Components("IBR"),
//				new Components("AC")
//		);
//
//		// Add components to the table
//		cpuTableView.setItems(componentList);
		//////////////////////////////
	    System.out.println("Component Column: " + componentColumn);
	    System.out.println("Instruction Column: " + instructionColumn);

	    if (componentColumn == null || instructionColumn == null) {
	        System.out.println("❌ ERROR: TableColumns are null! Check FXML fx:id.");
	        return;
	    }

	    componentColumn.setCellValueFactory(new PropertyValueFactory<>("componentName"));
	    instructionColumn.setCellValueFactory(new PropertyValueFactory<>("instruction"));

	    ObservableList<Components> componentList = FXCollections.observableArrayList(
	        new Components("PC"),
	        new Components("MAR"),
	        new Components("MBR"),
	        new Components("IR"),
	        new Components("IBR"),
	        new Components("AC")
	    );

	    cpuTableView.setItems(componentList);
	    startInstruction();

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



