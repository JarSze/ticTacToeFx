package com.javaLearning;

import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

public class MainWindowController
{
    public void handleClick(MouseEvent mouseEvent){
        Label source = (Label)mouseEvent.getSource();
        System.out.println(source.getId());
    }
}
