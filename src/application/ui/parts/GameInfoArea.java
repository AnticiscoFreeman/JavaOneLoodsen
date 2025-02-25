package application.ui.parts;

import application.ui.GuiPanel;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 18.02.2025
 */

public class GameInfoArea extends JPanel {
    private static String ENEMY_INFO_PREFIX = "Enemies: ";
    private static String MED_PACK_INFO_PREFIX = "MedPack: ";
    private static String SIZE_PREFIX = "Size map: ";

    private GuiPanel guiPanel;

    private JLabel areaTitle;
    private JLabel enemyCountLabel;
    private JLabel medPackCountLabel;
    private JLabel sizeMapLabel;

    public GameInfoArea(GuiPanel guiPanel) {
        this.guiPanel = guiPanel;
        setLayout(new GridLayout(4,1));

        areaTitle = new JLabel("= Game Info =", SwingConstants.CENTER);
        enemyCountLabel = new JLabel(ENEMY_INFO_PREFIX + "-");
        medPackCountLabel = new JLabel(MED_PACK_INFO_PREFIX + "-");
        sizeMapLabel = new JLabel(SIZE_PREFIX + "-:-");

        add(areaTitle);
        add(enemyCountLabel);
        add(medPackCountLabel);
        add(sizeMapLabel);
    }

    public void refreshInfo(int enemyCount, int medPackCount, String mapSize) {
        enemyCountLabel.setText(ENEMY_INFO_PREFIX + enemyCount);
        medPackCountLabel.setText(MED_PACK_INFO_PREFIX + medPackCount);
        sizeMapLabel.setText(SIZE_PREFIX + mapSize);

    }
}
