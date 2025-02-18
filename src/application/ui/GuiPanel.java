package application.ui;

import application.MainWindow;
import application.ui.parts.AppControlArea;
import application.ui.parts.EnemyInfoArea;
import application.ui.parts.PlayerControlArea;
import application.ui.parts.PlayerInfoArea;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 18.02.2025
 */

public class GuiPanel extends JPanel {

    private MainWindow window;

    private AppControlArea appControlArea;
    private PlayerInfoArea playerInfoArea;
    private EnemyInfoArea enemyInfoArea;
    private PlayerControlArea playerControlArea;

    public GuiPanel(MainWindow window) {
        this.window = window;
        setLayout(new GridLayout(5, 1));
        setBackground(Color.BLACK);

        this.appControlArea = new AppControlArea(this);

        add(appControlArea);
    }


}
