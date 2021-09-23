package com.company;

import javax.swing.*;
import java.awt.*;

public class ExPanelXO extends JPanel {
    public  ExPanelXO(){

        setLayout(new GridLayout(3, 3));

        JButton button11 = new JButton();
        JButton button12 = new JButton();
        JButton button13 = new JButton();
        JButton button21 = new JButton();
        JButton button22 = new JButton();
        JButton button23 = new JButton();
        JButton button31 = new JButton();
        JButton button32 = new JButton();
        JButton button33 = new JButton();

        add(button11);
        add(button12);
        add(button13);
        add(button21);
        add(button22);
        add(button23);
        add(button31);
        add(button32);
        add(button33);

    }
}
