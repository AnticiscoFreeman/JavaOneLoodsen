package module2.application.ui;

import module2.application.MainWindow;
import module2.application.ui.parts.AppControlArea;
import module2.application.ui.parts.GameInfoArea;
import module2.application.ui.parts.PlayerControlArea;
import module2.application.ui.parts.PlayerInfoArea;

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
    private GameInfoArea gameInfoArea;
    private PlayerControlArea playerControlArea;
    private JTextArea gameLog;
    private JScrollPane scrollLogManager;

    public GuiPanel(MainWindow window) {
        this.window = window;
        setLayout(new GridLayout(5, 1));
        setBackground(Color.BLACK);

        this.appControlArea = new AppControlArea(this);
        this.playerInfoArea = new PlayerInfoArea(this);
        this.gameInfoArea = new GameInfoArea(this);
        this.playerControlArea = new PlayerControlArea(this);

        this.gameLog = new JTextArea();
        this.gameLog.setEditable(false);
        this.gameLog.setLineWrap(true);
        this.scrollLogManager = new JScrollPane(gameLog);

        add(appControlArea);
        add(playerInfoArea);
        add(gameInfoArea);
        add(playerControlArea);
        add(scrollLogManager);
    }

    public void recordLog(String message) {
        gameLog.append(message + "\n");
    }

    public void clearLog() {
        gameLog.setText("");
    }

    public void startGame() {
        window.startGame();
    }

    public void refreshGameInfo(int health, int power, String position, int enemyCount, int medPackCount, String mapSize) {
        playerInfoArea.refreshInfo(health, power, position);
        gameInfoArea.refreshInfo(enemyCount, medPackCount, mapSize);
    }

    public void directionPlayer(int keyCode) {
        window.directionPlayer(keyCode);
    }
}
