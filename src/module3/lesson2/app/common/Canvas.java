package module3.lesson2.app.common;

import module3.lesson2.app.GameWindow;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 11.03.2025
 */

public class Canvas extends JPanel {

    private final GameWindow window;
    private long lastUpdateTime;

    public Canvas(GameWindow window) {
        this.window = window;
        this.lastUpdateTime = System.nanoTime();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        long currentTime = System.nanoTime();
        float deltaTime = (currentTime - lastUpdateTime) * 0.000000001f;
        lastUpdateTime = currentTime;
        window.onRenderFrame(this, g, deltaTime);

        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        repaint();
    }

    public int getLeft() {
        return 0;
    }

    public int getRight() {
        return getWidth() - 2;
    }

    public int getBottom() {
        return getHeight() - 2;
    }

    public int getTop() {
        return 0;
    }
}
