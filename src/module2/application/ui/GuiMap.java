package module2.application.ui;

import module2.application.MainWindow;
import module2.application.actors.Enemy;
import module2.application.actors.MedPack;
import module2.application.actors.Player;
import module2.application.tools.Tools;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 18.02.2025
 */

public class GuiMap extends JPanel {

    private MainWindow window;

    public static final int MOVE_UP = 8;
    public static final int MOVE_LEFT = 4;
    public static final int MOVE_RIGHT = 6;
    public static final int MOVE_DOWN = 2;

    private static final int CELL_PLAYER = 0;
    private static final int CELL_ENEMY = 1;
    private static final int CELL_EMPTY = 2;
    private static final int CELL_MED_PACK = 3;
    private static final int CELL_EXIT = 4;
    private static final int CELL_READY = 5;

    public int[][] map;
    public int mapWidth;
    public int mapHeight;
    public int minSizeMap = 3;
    public int maxSizeMap = 6;

    public boolean isFoundExit = false;

    private Player player;
    private Enemy enemy;
    private MedPack medPack;

    private boolean isGameStart;

    private int cellWidth;
    private int cellHeight;

    public GuiMap(MainWindow window) {
        this.window = window;
        setBackground(Color.ORANGE);
        this.isGameStart = false;
    }

    /**
     * При нажатии кнопки START на UI
     */
    public void startNewGame() {
        player = new Player();
        createMap();
        createPlayer();
        createHealthPack();
        createEnemies();
        createExit();
        this.isGameStart = true;
        refreshGameInfo();
    }

    private void render(Graphics g) {
        if (!isGameStart) {
            return;
        }
        paintMap(g);

        for (int y = 0; y < mapHeight; y++) {
            for (int x = 0; x < mapWidth; x++) {

                if (map[y][x] == CELL_EMPTY) {
                    continue;
                }

                if (map[y][x] == CELL_PLAYER) {
                    g.setColor(Color.GREEN);
                    g.fillRect(x * cellWidth, y * cellHeight, cellWidth, cellHeight);
                }

                if (map[y][x] == CELL_READY) {
                    g.setColor(Color.GRAY);
                    g.fillRect(x * cellWidth, y * cellHeight, cellWidth, cellHeight);
                }
            }
        }
    }

    private void refreshGameInfo() {
        window.refreshGameInfo(
                player.getHealth(),
                player.getPower(),
                player.getPosition(),
                Enemy.COUNT,
                MedPack.COUNT,
                String.format("%s:%s", mapWidth, mapHeight)
        );
    }

    private void paintMap(Graphics g) {
        int myWidth = getWidth();
        int myHeight = getHeight();

        cellWidth = myWidth / mapWidth;
        cellHeight = myHeight / mapHeight;

        g.setColor(Color.BLACK);

        for (int i = 0; i <= mapHeight; i++) {
            int y = i * cellHeight;
            g.drawLine(0, y, myWidth, y);
        }

        for (int i = 0; i <= mapWidth; i++) {
            int x = i * cellWidth;
            g.drawLine(x, 0, x, myHeight);
        }
    }

    public void directionPlayer(int keyButton) {
        if (!isGameStart) {
            return;
        }

        int currentX = player.getX();
        int currentY = player.getY();

        switch (keyButton) {
            case MOVE_UP: {
                player.moveUp();
                break;
            }
            case MOVE_LEFT: {
                player.moveLeft();
                break;
            }
            case MOVE_RIGHT: {
                player.moveRight();
                break;
            }
            case MOVE_DOWN: {
                player.moveDown();
                break;
            }
        }

        if (!isValidMove(currentX, currentY, player.getX(), player.getY())) {
            return;
        }
        playerNextMoveAction(currentX, currentY, player.getX(), player.getY());
        refreshGameInfo();
        repaint();

        if (!player.isAlive()) {
            this.isGameStart = false;
            JOptionPane.showMessageDialog(this, "Player is dead! Game Over!");
        }

        if (isFoundExit) {
            this.isGameStart = false;
            JOptionPane.showMessageDialog(this, "You found exit! Game Over!");
        }
    }

    private void playerNextMoveAction(int currentX, int currentY, int nextX, int nextY) {
        if (map[nextY][nextX] == CELL_MED_PACK) {
            player.health(medPack.getValue());
            MedPack.COUNT--;
            window.recordLog(String.format("Player HP +%s. Now hp is %s", medPack.getValue(), player.getHealth()));
        }
        if (map[nextY][nextX] == CELL_ENEMY) {
            Enemy.COUNT--;
            player.getDamage(enemy.getPower());
            window.recordLog(String.format("Warning! Player HP -%s. Now hp is %s", enemy.getPower(), player.getHealth()));
        }
        if (map[nextY][nextX] == CELL_EXIT) {
            isFoundExit = true;
            window.recordLog("Player found exit!");
        }
        map[currentY][currentX] = CELL_READY;
        map[player.getY()][player.getX()] = CELL_PLAYER;
    }

    private boolean isValidMove(int currentX, int currentY, int nextX, int nextY) {
        if (nextY >= 0 && nextY < mapHeight && nextX >= 0 && nextX < mapWidth) {
            return true;
        }
        System.out.println("Sorry, your move is incorrect");
        player.setPosition(currentX, currentY);
        return false;
    }

    private void createMap() {
        mapWidth = Tools.getRandomValue(minSizeMap, maxSizeMap);
        mapHeight = Tools.getRandomValue(minSizeMap, maxSizeMap);
        map = new int[mapHeight][mapWidth];

        for (int i = 0; i < mapHeight; i++) {
            for (int j = 0; j < mapWidth; j++) {
                map[i][j] = CELL_EMPTY;
            }
        }
        window.recordLog(String.format("Map created. Size %sx%s", mapWidth, mapHeight));
    }

    private void createPlayer() {
        player.setPosition(Tools.getRandomValue(0, mapWidth - 1), Tools.getRandomValue(0, mapHeight - 1));
        map[player.getY()][player.getX()] = CELL_PLAYER;
        window.recordLog(String.format("Player spawn in [%s]", player.getPosition()));
    }

    public void createHealthPack() {
        medPack = new MedPack();
        MedPack.COUNT = Tools.getRandomValue(1, (maxSizeMap + minSizeMap) / 4);

        for (int i = 0; i < MedPack.COUNT; i++) {
            do {
                medPack.setPosition(Tools.random.nextInt(mapWidth), Tools.random.nextInt(mapHeight));
            } while (!isEmptyCell(medPack.getY(), medPack.getX()));
            map[medPack.getY()][medPack.getX()] = CELL_MED_PACK;
        }
        window.recordLog(String.format("HealthPacks spawn. Count: %s", MedPack.COUNT));
    }

    private void createEnemies() {
        Enemy.COUNT = Tools.getRandomValue(1, (maxSizeMap + minSizeMap) / 4);
        enemy = new Enemy();

        for (int i = 0; i < Enemy.COUNT; i++) {
            do {
                enemy.setPosition(Tools.random.nextInt(mapWidth),
                        Tools.random.nextInt(mapHeight));
            } while (!isEmptyCell(enemy.getY(), enemy.getX()));
            map[enemy.getY()][enemy.getX()] = CELL_ENEMY;
        }
        window.recordLog(String.format("Enemies spawn. Count: %s. Health: %s. Power: %s",
                Enemy.COUNT, enemy.getHealth(), enemy.getPower()));
    }

    private void createExit() {
        isFoundExit = false;
        int x;
        int y;
        do {
            x = Tools.random.nextInt(mapWidth);
            y = Tools.random.nextInt(mapHeight);
        } while (!isEmptyCell(y, x));
        map[y][x] = CELL_EXIT;
        window.recordLog("Exit spawn");
    }

    private boolean isEmptyCell(int y, int x) {
        return map[y][x] == CELL_EMPTY;
    }


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        render(g);
    }
}
