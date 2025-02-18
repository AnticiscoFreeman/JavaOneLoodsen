package application.ui.parts;

import application.ui.GuiPanel;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 18.02.2025
 */

public class AppControlArea extends JPanel {

    private GuiPanel panel;

    private JButton startGame;
    private JButton exitGame;

    public AppControlArea(GuiPanel panel) {
        this.panel = panel;
        setLayout(new GridLayout(1, 2));
        startGame = new JButton("START");
        exitGame = new JButton("EXIT");
        add(startGame);
        add(exitGame);
    }

}
