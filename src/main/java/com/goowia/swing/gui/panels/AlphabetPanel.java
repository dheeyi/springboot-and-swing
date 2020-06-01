package com.goowia.swing.gui.panels;

import com.goowia.swing.model.AlphabetModel;
import com.goowia.swing.model.ButtonModel;
import com.goowia.swing.repository.AlphabetRepository;
import com.goowia.swing.service.AlphabetService;
import com.goowia.swing.service.ButtonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.swing.*;
import java.awt.*;
import java.util.List;

@Component
public class AlphabetPanel extends JPanel {
    @Autowired
    private AlphabetService alphabetService;

    public AlphabetPanel() {
        this.setPreferredSize(new Dimension(600, 190));
        this.setBackground(Color.blue);
        this.setLayout(new GridLayout(3, 0));
    }

    @PostConstruct
    public void createButtonsLetters() {
        List<AlphabetModel> firstRow = alphabetService.getAllLettersFirst();
        String[] titleAlphabet = firstRow.get(0).getLetter().split(",");
        JPanel panelQ_P = this.createPanelButton(titleAlphabet);
        this.add(panelQ_P);

        List<AlphabetModel> secondRow = alphabetService.getAllLettersSecond();
        String[] titleAlphabet1 = secondRow.get(0).getLetter().split(",");
        JPanel panelA_L = this.createPanelButton(titleAlphabet1);
        this.add(panelA_L);

        List<AlphabetModel> threeRow = alphabetService.getAllLettersThree();
        String[] titleAlphabet2 = threeRow.get(0).getLetter().split(",");
        JPanel panelZ_M = this.createPanelButton(titleAlphabet2);
        this.add(panelZ_M);
    }

    public JPanel createPanelButton(String[] titleAlphabet) {
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new FlowLayout());

        for (String title : titleAlphabet) {
            JButton button = new JButton(title);
            button.setPreferredSize(new Dimension(55, 40));
            mainPanel.add(button);
        }

        return mainPanel;
    }
}
