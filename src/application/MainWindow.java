package application;

import application.ui.GuiMap;
import application.ui.GuiPanel;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 18.02.2025
 */

public class MainWindow extends JFrame {

    private int windowWidth = 800;
    private int windowHeight = 600;
    private int windowPosX = 100;
    private int windowPosY = 200;

    private GuiMap guiMap;
    private GuiPanel guiPanel;

    public MainWindow() {
        setupWindow();
        this.guiMap = new GuiMap(this);
        this.guiPanel = new GuiPanel(this);

        add(guiMap);
        add(guiPanel, BorderLayout.EAST);

        setVisible(true);
    }

    private void setupWindow() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(windowWidth, windowHeight);
        setTitle("My First UI App");
        setLocation(windowPosX, windowPosY);
        setResizable(true);
    }

    public void startGame() {
        guiMap.startNewGame();
    }

    public void recordLog(String message) {
        guiPanel.recordLog(message);
    }
}
