package com.example.scenebuilder;

import javafx.beans.property.SimpleStringProperty;
import javafx.scene.control.Button;

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
            case 3:
                tableComps.get(1).setInstruction("MAR Input here");
                break;
            case 5:
                tableComps.get(2).setInstruction("MBR Input here");
                break;

            case 7:
                tableComps.get(3).setInstruction("IR Input here");
                break;
            case 9:
                tableComps.get(4).setInstruction("IBR Input here");
                break;
            case 11:
                tableComps.get(5).setInstruction("AC Input here");
                break;
        }
        tableView.refresh();
    }
}
