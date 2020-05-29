package com.goowia.swing.gui.panels;

import com.goowia.swing.service.ButtonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.swing.*;
import java.awt.*;

@Component
public class ButtonPanel extends JPanel {
    @Autowired
    private ButtonService buttonService;

    public ButtonPanel() {
        this.setPreferredSize(new Dimension(400, 200));
        this.setBackground(Color.blue);
        this.setLayout(new GridLayout(2, 0));
    }

    @PostConstruct
    public void createButtons() {
        String titleButton = buttonService.getRow();

        JButton button = new JButton(titleButton);
        button.setPreferredSize(new Dimension(80, 40));

        this.add(button);
    }
}
