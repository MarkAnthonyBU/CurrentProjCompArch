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
//        this("component", "-");
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

}