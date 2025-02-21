

package com.example.scenebuilder;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.shape.Circle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.TableCell;
import javafx.util.Callback;

import javafx.scene.shape.Path;
import javafx.animation.PathTransition;

import java.awt.image.ComponentSampleModel;
import java.util.List;

public class Controller {

//    @FXML
//    void handleButtonAction() {
//        try {
//            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ACWindow.fxml"));
//            Parent root1 = fxmlLoader.load();
//            Stage stage = new Stage();
//            stage.setTitle("Second WINDOW");
//            stage.setScene(new Scene(root1, 300, 275));
//            stage.show();
//        } catch (Exception e) {
//            e.printStackTrace();  // Print stack trace for debugging
//        }
//    }
//    @FXML
//    void handleButtonAction1() {
//        try {
//            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("MQWindow.fxml"));
//            Parent root1 = fxmlLoader.load();
//            Stage stage = new Stage();
//            stage.setTitle("Third WINDOW for MQ");
//            stage.setScene(new Scene(root1, 300, 275));
//            stage.show();
//        } catch (Exception e) {
//            e.printStackTrace();  // Print stack trace for debugging
//        }
//    }
//    @FXML
//    void handleButtonAction2() {
//        try {
//            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ALCircuitWindow.fxml"));
//            Parent root1 = fxmlLoader.load();
//            Stage stage = new Stage();
//            stage.setTitle("Fourth WINDOW for AL Circuits");
//            stage.setScene(new Scene(root1, 300, 275));
//            stage.show();
//        } catch (Exception e) {
//            e.printStackTrace();  // Print stack trace for debugging
//        }
//    }
//
//        @FXML
//        void handleButtonAction3() {
//            try {
//                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("MBRWindow.fxml"));
//                Parent root1 = fxmlLoader.load();
//                Stage stage = new Stage();
//                stage.setTitle("Fifth WINDOW for MBR");
//                stage.setScene(new Scene(root1, 300, 275));
//                stage.show();
//            } catch (Exception e) {
//                e.printStackTrace();  // Print stack trace for debugging
//            }
//    }
//    @FXML
//    void handleButtonAction4() {
//        try {
//            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("SixthWindow.fxml"));
//            Parent root1 = fxmlLoader.load();
//            Stage stage = new Stage();
//            stage.setTitle("Sixth WINDOW for Input");
//            stage.setScene(new Scene(root1, 300, 275));
//            stage.show();
//        } catch (Exception e) {
//            e.printStackTrace();  // Print stack trace for debugging
//        }
//    }
//    @FXML
//    void handleButtonAction5() {
//        try {
//            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ResetWindow.fxml"));
//            Parent root1 = fxmlLoader.load();
//            Stage stage = new Stage();
//            stage.setTitle("Seventh WINDOW for Input");
//            stage.setScene(new Scene(root1, 300, 275));
//            stage.show();
//        } catch (Exception e) {
//            e.printStackTrace();  // Print stack trace for debugging
//        }
//    }
//    @FXML
//    void handleButtonAction6() {
//        try {
//            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("PCWindow.fxml"));
//            Parent root1 = fxmlLoader.load();
//            Stage stage = new Stage();
//            stage.setTitle("Eighth WINDOW for PC");
//            stage.setScene(new Scene(root1, 300, 275));
//            stage.show();
//        } catch (Exception e) {
//            e.printStackTrace();  // Print stack trace for debugging
//        }
//    }
//        @FXML
//        void handleButtonAction7() {
//            try {
//                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("MARWindow.fxml"));
//                Parent root1 = fxmlLoader.load();
//                Stage stage = new Stage();
//                stage.setTitle(" WINDOW for MAR");
//                stage.setScene(new Scene(root1, 300, 275));
//                stage.show();
//            } catch (Exception e) {
//                e.printStackTrace();  // Print stack trace for debugging
//            }
//    }
//
//    @FXML
//    void handleButtonAction8() {
//        try {
//            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("IBRWindow.fxml"));
//            Parent root1 = fxmlLoader.load();
//            Stage stage = new Stage();
//            stage.setTitle(" WINDOW for IBR");
//            stage.setScene(new Scene(root1, 300, 275));
//            stage.show();
//        } catch (Exception e) {
//            e.printStackTrace();  // Print stack trace for debugging
//        }
//    }
//    @FXML
//    void handleButtonAction9() {
//        try {
//            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ControlCircuitWindow.fxml"));
//            Parent root1 = fxmlLoader.load();
//            Stage stage = new Stage();
//            stage.setTitle(" WINDOW for Control Circuit window");
//            stage.setScene(new Scene(root1, 300, 275));
//            stage.show();
//        } catch (Exception e) {
//            e.printStackTrace();  // Print stack trace for debugging
//        }
//    }
//    @FXML
//    void handleButtonAction10() {
//        try {
//            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("IRWindow.fxml"));
//            Parent root1 = fxmlLoader.load();
//            Stage stage = new Stage();
//            stage.setTitle(" WINDOW for IR");
//            stage.setScene(new Scene(root1, 300, 275));
//            stage.show();
//        } catch (Exception e) {
//            e.printStackTrace();  // Print stack trace for debugging
//        }
//    }

//	@FXML
//	private Button myTestButton;
	@FXML
	private VBox infoContainer;
	@FXML
	private Label titleLabel = new Label("");
	@FXML
	private Label infoLabel = new Label("");
//	@FXML
//	private Circle movinCircle;

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
		titleLabel.setText("The IAS Computer\n\n");
		infoLabel.setText("Click a button to learn about its functions");
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
    	titleLabel.setText("Accumulator Register\n\n");
    	infoLabel.setText("Temporarily holds operands and results from ALU operations. The"
				+ " most significant 40 bits are stored here.");
		infoContainer.getChildren().clear(); 
		infoContainer.getChildren().add(titleLabel);
		infoContainer.getChildren().add(infoLabel);
    }
    @FXML
    void handleButtonAction1() {
    	titleLabel.setText("Multiplier Quotient Register\n\n");
    	infoLabel.setText("Works alongside the AC. Holds the multiplier during"
				+ " multiplication, and the quotient during division. Holds the least"
				+ " significant of the 40 bits.");
		infoContainer.getChildren().clear(); 
		infoContainer.getChildren().add(titleLabel);
		infoContainer.getChildren().add(infoLabel);
    }
    @FXML
    void handleButtonAction2() {
    	titleLabel.setText("Arithmatic Logic Circuits\n\n");
    	infoLabel.setText("Circuitry inside the ALU that performs calculations."
				+ " Executes arithmetic functions (add, subtract, multiply, divide) as well as logic"
				+ " (AND, OR, NOT, XOR) operations. These circuits work with registers (AC, MQ, MBR) to "
				+ "process data and store results.");
		infoContainer.getChildren().clear(); 
		infoContainer.getChildren().add(titleLabel);
		infoContainer.getChildren().add(infoLabel);
    }

        @FXML
        void handleButtonAction3() {
        	titleLabel.setText("Memory Buffer Register\n\n");
        	infoLabel.setText("Temporarily holds instructions for data transferred between ALU and main memory."
    				+ " Holds instructions/data fetched from memory before processing, and stores "
    				+ " results before writing back to memory.");
    		infoContainer.getChildren().clear(); 
    		infoContainer.getChildren().add(titleLabel);
    		infoContainer.getChildren().add(infoLabel);
    }
    @FXML
    void handleButtonAction4() {
    	titleLabel.setText("Input/Output (I/O)\n\n");
    	infoLabel.setText("Handles communication between the IAS computer and external devices.");
		infoContainer.getChildren().clear(); 
		infoContainer.getChildren().add(titleLabel);
		infoContainer.getChildren().add(infoLabel);
    }
    @FXML
    void handleButtonAction5() {
    	titleLabel.setText("Main Memory\n\n");
    	infoLabel.setText("Stores both data and instructions. (Basis of Von Neumann Architecture)."
				+ " Acts as the central storage unit from which the CPU");
		infoContainer.getChildren().clear(); 
		infoContainer.getChildren().add(titleLabel);
		infoContainer.getChildren().add(infoLabel);
    }
    @FXML
    void handleButtonAction6() {
    	titleLabel.setText("Program Counter\n\n");
    	infoLabel.setText("Holds/Keeps track of the next instruction to be executed. "
				+ "Keeps track of where the program is in memory. "
				+ "After each instruction of a program, it updates to point to the next instruction in sequence.");
		infoContainer.getChildren().clear(); 
		infoContainer.getChildren().add(titleLabel);
		infoContainer.getChildren().add(infoLabel);
    }
    @FXML
    void handleButtonAction7() {
    	titleLabel.setText("Memory Address Register\n\n");
    	infoLabel.setText("Stores the memory address where data or an instruction is located. "
    			+ "Works alongside the PC to fetch instructions from memory. "
    			+ "It is also used to hold addresses when reading/writing data to memory");  		
    	infoContainer.getChildren().clear(); 
    	infoContainer.getChildren().add(titleLabel);
    	infoContainer.getChildren().add(infoLabel);
    }

    @FXML
    void handleButtonAction8() {
    	titleLabel.setText("Instruction Buffer Register\n\n");
    	infoLabel.setText("Stores the second instruction (Bits 20-39) from a 40-bit word"
				+ " retrieved from the MBR. When the IR finishes executing the first instruction, the IBR"
				+ " sends its stored instruction to the IR for execution.");
		infoContainer.getChildren().clear(); 
		infoContainer.getChildren().add(titleLabel);
		infoContainer.getChildren().add(infoLabel);
    }
    @FXML
    void handleButtonAction9() {
    	titleLabel.setText("Control Circuits\n\n");
    	infoLabel.setText("Acts as the 'brain' of the CPU. Coordinates flow between registers, I/O and "
				+ "main memory.");
		infoContainer.getChildren().clear(); 
		infoContainer.getChildren().add(titleLabel);
		infoContainer.getChildren().add(infoLabel);
    }
    @FXML
    void handleButtonAction10() {
    	titleLabel.setText("Instruction Register\n\n");
    	infoLabel.setText("Retrieves and stores the first instruction (Bits 0-19) from a 40-bit word retrieved from the MBR. "
				+ "The IR holds the current instruction being executed.");
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


}

