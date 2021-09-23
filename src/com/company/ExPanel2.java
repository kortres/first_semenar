package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExPanel2 extends JPanel {

    public ExPanel2(){
        JTextField textField = new JTextField(20);
        add(textField);

        JLabel label = new JLabel("введите логин");
        add(label);

        JButton button = new JButton("войти");
        add(button);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText(textField.getText()+ ";)");
            }
        });
    }

}
