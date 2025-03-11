package module2.application.ui.parts;

import module2.application.ui.GuiMap;
import module2.application.ui.GuiPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
        btnMoveUp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                directionPlayer(GuiMap.MOVE_UP);
                System.out.println("↑");
            }
        });
        btnMoveLeft = new JButton("←");
        btnMoveLeft.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                directionPlayer(GuiMap.MOVE_LEFT);
                System.out.println("←");
            }
        });
        btnMoveRight = new JButton("→");
        btnMoveRight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                directionPlayer(GuiMap.MOVE_RIGHT);
                System.out.println("→");
            }
        });
        btnMoveDown = new JButton("↓");
        btnMoveDown.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                directionPlayer(GuiMap.MOVE_DOWN);
                System.out.println("↓");
            }
        });

        add(new JPanel());
        add(btnMoveUp);
        add(new JPanel());
        add(btnMoveLeft);
        add(btnMoveDown);
        add(btnMoveRight);
    }

    public void directionPlayer(int keyCode) {
        guiPanel.directionPlayer(keyCode);
    }
}
