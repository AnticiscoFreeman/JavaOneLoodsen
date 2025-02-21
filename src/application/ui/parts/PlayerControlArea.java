package application.ui.parts;

import application.ui.GuiPanel;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 18.02.2025
 */

public class PlayerControlArea extends JPanel {

    private GuiPanel guiPanel;

    private JButton btnMoveUp;
    private JButton btnMoveLeft;
    private JButton btnMoveRight;
    private JButton btnMoveDown;

    public PlayerControlArea(GuiPanel guiPanel) {
        this.guiPanel = guiPanel;

        setLayout(new GridLayout(2, 3));

        btnMoveUp = new JButton("↑");
        btnMoveLeft = new JButton("←");
        btnMoveRight = new JButton("→");
        btnMoveDown = new JButton("↓");

        add(new JPanel());
        add(btnMoveUp);
        add(new JPanel());
        add(btnMoveLeft);
        add(btnMoveDown);
        add(btnMoveRight);
    }
}
