package com.example.scenebuilder;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.ObservableList;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;

public class Components {
    private final SimpleStringProperty componentName; 
    private final SimpleStringProperty instruction;
    private final Button nextButton;

    public Components(String componentName, String instruction) {
        this.componentName = new SimpleStringProperty(componentName);
        this.instruction = new SimpleStringProperty(instruction);
        this.nextButton = new Button("Next");
        this.nextButton.setDisable(true);

    }

    public Components(String pc) {
    	this(pc, "-");
    }

    public String getComponentName() { //this Line Mark -- added -Name
        return componentName.get();

    }

    public void setComponent(String value) {
        componentName.set(value); 

    }

    public String getInstruction() {
        return instruction.get();

    }

    public void setInstruction(String value) {
        instruction.set(value);

    }

    public Button getNextButton() {
        return nextButton;

    }

    public void enableButton() {
        nextButton.setDisable(false);

    }

    public void disableButton() {
        nextButton.setDisable(true
        );
    }
 public static void updTable(int step, ObservableList<Components> tableComps, TableView<Components> tableView) {
     switch (step) {
         case 1:
             tableComps.get(0).setInstruction("1");
             break;
         case 2:
             tableComps.get(1).setInstruction("1");
             break;
         case 3:
             tableComps.get(1).setInstruction("1");
             break;
         case 4:
             tableComps.get(2).setInstruction("LOAD M(X) 500, ADD M(X) 501");
             break;
         case 5:
             tableComps.get(3).setInstruction("LOAD M(X) 500");
             tableComps.get(4).setInstruction("ADD M(X) 501");
             break;
         case 6:
             tableComps.get(1).setInstruction("500");
             break;
         case 7:
             tableComps.get(1).setInstruction("500");
             break;
         case 8:
             // Memory retrieval
             break;
         case 9:
             tableComps.get(2).setInstruction("3");
             break;
         case 10:
             tableComps.get(2).setInstruction("3");
             break;
         case 11:
             tableComps.get(5).setInstruction("3");
             break;
         case 12:
             tableComps.get(5).setInstruction("3");
             break;
         case 13:
             tableComps.get(3).setInstruction("ADD M(X) 501");
             tableComps.get(4).setInstruction("-");
             break;
         case 14:
             tableComps.get(1).setInstruction("501");
             break;
         case 15:
             tableComps.get(1).setInstruction("501");
             break;
         case 16:
             tableComps.get(0).setInstruction("2");
             break;
         case 17:
             // Memory retrieval
             break;
         case 18:
             tableComps.get(2).setInstruction("4");
             break;
         case 19:
             tableComps.get(2).setInstruction("4");
             break;
         case 20:
             tableComps.get(5).setInstruction("7");
             break;
         case 21:
             tableComps.get(5).setInstruction("7");
             break;
         case 22:
             tableComps.get(1).setInstruction("2");
             break;
         case 23:
             tableComps.get(1).setInstruction("2");
             break;
         case 24:
             tableComps.get(2).setInstruction("STOR M(X) 500, Other Ins");
             break;
         case 25:
             tableComps.get(3).setInstruction("STOR M(X) 500");
             tableComps.get(4).setInstruction("Other Ins");
             break;
         case 26:
             tableComps.get(1).setInstruction("500");
             break;
         case 27:
             tableComps.get(1).setInstruction("500");
             break;
         case 28:
             tableComps.get(2).setInstruction("7");
             break;
         case 29:
             tableComps.get(2).setInstruction("7");
             break;
         case 30:
             // Memory write operation
             break;
         case 31:
             tableComps.get(2).setInstruction("7 stored at address 500");
             tableComps.get(5).setInstruction("7");
             break;
     }
     tableView.refresh();
 }
}