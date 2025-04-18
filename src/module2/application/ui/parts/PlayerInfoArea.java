package module2.application.ui.parts;

import module2.application.ui.GuiPanel;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 18.02.2025
 */

public class PlayerInfoArea extends JPanel {
    private static String HP_PREFIX = "Health: ";
    private static String STR_PREFIX = "Str: ";
    private static String POSITION_PREFIX = "Position: ";

    private GuiPanel guiPanel;

    private JLabel playerHp;
    private JLabel playerStr;
    private JLabel playerPosition;

    public PlayerInfoArea(GuiPanel guiPanel) {
        this.guiPanel = guiPanel;
        setLayout(new GridLayout(4,1));

        playerHp = new JLabel(HP_PREFIX + "-");
        playerStr = new JLabel(STR_PREFIX + "-");
        playerPosition = new JLabel(POSITION_PREFIX + "-:-");

        add(new JLabel("= Player Info =", SwingConstants.CENTER));
        add(playerHp);
        add(playerStr);
        add(playerPosition);
    }

    public void refreshInfo(int health, int power, String position) {
        playerHp.setText(HP_PREFIX + health);
        playerStr.setText(STR_PREFIX + power);
        playerPosition.setText(POSITION_PREFIX + position);
    }
}
