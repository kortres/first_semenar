package com.company;

import javax.swing.*;
import java.awt.*;

public class ExFrame extends JFrame {
    public ExFrame() {
        setSize(300, 300);
        setTitle("Крестики -нолики");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Container container = getContentPane();
        //ExPanel panel = new ExPanel();
        //container.add(panel);
        ExPanelXO panelXO = new ExPanelXO();
        container.add(panelXO);
        //getContentPane().add(new ExPanel(), BorderLayout.SOUTH);
    }
}
