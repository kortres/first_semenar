package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.PrivilegedExceptionAction;

public class ExAction implements ActionListener {

    private JLabel label;
    private JTextField textField;

    public  ExAction(JLabel label, JTextField textField){
        this.label = label;
        this.textField = textField;
    }

    @Override
    public  void actionPerformed(ActionEvent a){
        System.out.println("Hello world !!!");
        this.label.setText(textField.getText() + ";)");
    }
}
