package com.example.scenebuilder;

import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

/*
 * Class is solely used to house method which updates the labels which are displayed onto in infoContainer vBox in controller class.
 */
public class IASComponentClass{
	public static void updateLabels(int i, Label titleLabel, Label infoLabel, VBox infoContainer) {
		switch (i) { 
		case 0: 
	    	titleLabel.setText("Accumulator Register\n\n");
	    	infoLabel.setText("Temporarily holds operands and results from ALU operations. The"
					+ " most significant 40 bits are stored here.");
			break;
		case 1:
	    	titleLabel.setText("Multiplier Quotient Register\n\n");
	    	infoLabel.setText("Works alongside the AC. Holds the multiplier during"
					+ " multiplication, and the quotient during division. Holds the least"
					+ " significant of the 40 bits.");
			break;
		case 2:
	    	titleLabel.setText("Arithmatic Logic Circuits\n\n");
	    	infoLabel.setText("Circuitry inside the ALU that performs calculations."
					+ " Executes arithmetic functions (add, subtract, multiply, divide) as well as logic"
					+ " (AND, OR, NOT, XOR) operations. These circuits work with registers (AC, MQ, MBR) to "
					+ "process data and store results.");
			break;
		case 3:
	    	titleLabel.setText("Memory Buffer Register\n\n");
	        infoLabel.setText("Temporarily holds instructions for data transferred between ALU and main memory."
	    			+ " Holds instructions/data fetched from memory before processing, and stores "
	    			+ " results before writing back to memory.");
			break;
		case 4:
	    	titleLabel.setText("Input/Output (I/O)\n\n");
	    	infoLabel.setText("Handles communication between the IAS computer and external devices.");
			break;
		case 5:
	    	titleLabel.setText("Main Memory\n\n");
	    	infoLabel.setText("Stores both data and instructions. (Basis of Von Neumann Architecture)."
					+ " Acts as the central storage unit from which the CPU");
			break;
		case 6:
	    	titleLabel.setText("Program Counter\n\n");
	    	infoLabel.setText("Holds/Keeps track of the next instruction to be executed. "
					+ "Keeps track of where the program is in memory. "
					+ "After each instruction of a program, it updates to point to the next instruction in sequence.");
			break; 
		case 7:
	    	titleLabel.setText("Memory Address Register\n\n");
	    	infoLabel.setText("Stores the memory address where data or an instruction is located. "
	    			+ "Works alongside the PC to fetch instructions from memory. "
	    			+ "It is also used to hold addresses when reading/writing data to memory");  
			break;
		case 8:
	    	titleLabel.setText("Instruction Buffer Register\n\n");
	    	infoLabel.setText("Stores the second instruction (Bits 20-39) from a 40-bit word"
					+ " retrieved from the MBR. When the IR finishes executing the first instruction, the IBR"
					+ " sends its stored instruction to the IR for execution.");
			break;
		case 9:
	    	titleLabel.setText("Control Circuits\n\n");
	    	infoLabel.setText("Acts as the 'brain' of the CPU. Coordinates flow between registers, I/O and "
					+ "main memory.");
			break;
		case 10:
	    	titleLabel.setText("Instruction Register\n\n");
	    	infoLabel.setText("Retrieves and stores the first instruction (Bits 0-19) from a 40-bit word retrieved from the MBR. "
					+ "The IR holds the current instruction being executed.");
			break;
		case 11:
			titleLabel.setText("Memory\n\n");
			infoLabel.setText("1. LOAD M(X) 500, ADD M(X) 501\n"
					+ "2. STOR M(X) 500, Other Ins\n\n"
					+ "500. 3\n"
					+ "501. 4");
			break;
		default: 
			titleLabel.setText("The IAS Computer\n\n");
			infoLabel.setText("Click a button to learn about its functions");
		}
		infoContainer.getChildren().clear(); 
		infoContainer.getChildren().addAll(titleLabel, infoLabel);
	}
}
