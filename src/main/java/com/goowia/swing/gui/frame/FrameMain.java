package com.goowia.swing.gui.frame;

import com.goowia.swing.gui.panels.ButtonPanel;
import com.goowia.swing.gui.panels.EmptyPanel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.swing.*;
import java.awt.*;

@Component
public class FrameMain extends JFrame {
    @Autowired
    private EmptyPanel emptyPanel;
    @Autowired
    private ButtonPanel buttonPanel;

    public FrameMain() {
        this.setTitle("PROGRA III 2020");
        this.setBounds(300, 200, 800, 500);
        this.setBackground(Color.blue);
    }

    @PostConstruct
    public void createPanelsMainFrame() {
        this.add(emptyPanel);
        this.add(buttonPanel);
        this.setVisible(true);
    }
}
