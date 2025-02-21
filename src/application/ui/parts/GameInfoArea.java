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
    private JLabel enemyCount;
    private JLabel medPackCount;
    private JLabel sizeMap;

    public GameInfoArea(GuiPanel guiPanel) {
        this.guiPanel = guiPanel;
        setLayout(new GridLayout(4,1));

        areaTitle = new JLabel("= Game Info =", SwingConstants.CENTER);
        enemyCount = new JLabel(ENEMY_INFO_PREFIX + "-");
        medPackCount = new JLabel(MED_PACK_INFO_PREFIX + "-");
        sizeMap = new JLabel(SIZE_PREFIX + "-:-");

        add(areaTitle);
        add(enemyCount);
        add(medPackCount);
        add(sizeMap);
    }
}
