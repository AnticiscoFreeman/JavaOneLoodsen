package module3.lesson1.work.app;

import module3.lesson1.work.app.objects.Circle;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 11.03.2025
 */

public class CirclesApplication extends JFrame {

    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    private static final int POS_X = 500;
    private static final int POS_Y = 260;

    private static final String SPRITES_PREFIX = "Sprites: %s";
    private static final String COLLISION_PREFIX = "Collisions: %s";

    private final JLabel collisionLabel = new JLabel();
    private final JLabel spritesLabel = new JLabel();
    private Circle[] sprites = new Circle[1];
    private int spritesCount;
    private int countCollisions;

    public CirclesApplication() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(WIDTH, HEIGHT);
        setTitle("Circles");
        setLocation(POS_X, POS_Y);

        Canvas canvas = new Canvas(this);
        canvas.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON1) {
                    int x = e.getX();
                    int y = e.getY();
                    addSprite(new Circle(x, y));
                } else if (e.getButton() == MouseEvent.BUTTON3) {
                    removeSprite();
                }
            }
        });

        JPanel topMenu = new JPanel();
        topMenu.setLayout(new FlowLayout());
        topMenu.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        topMenu.add(spritesLabel);
        topMenu.add(collisionLabel);

        add(topMenu, BorderLayout.NORTH);
        add(canvas, BorderLayout.CENTER);
        initSprites();
        setVisible(true);

    }

    private void initSprites() {
        addSprite(new Circle());
    }

    private void removeSprite() {
        if (spritesCount > 1) {
            spritesCount--;
        }
    }

    private void addSprite(Circle circle) {
        if (spritesCount == sprites.length) {
            Circle[] newSprites = new Circle[sprites.length * 2];
            System.arraycopy(sprites, 0, newSprites, 0, sprites.length);
            sprites = newSprites;
        }
        sprites[spritesCount] = circle;
        spritesCount++;
    }

    public void onRenderFrame(Canvas canvas, Graphics g, float deltaTime) {
        update(canvas, deltaTime);
        render(canvas, g);
    }

    private void update(Canvas canvas, float deltaTime) {
        for (int i = 0; i < spritesCount; i++) {
            sprites[i].update(canvas, deltaTime);
        }
        handleCollisions();
        collisionLabel.setText(String.format(COLLISION_PREFIX, countCollisions));
        spritesLabel.setText(String.format(SPRITES_PREFIX, spritesCount));
    }

    private void render(Canvas canvas, Graphics g) {
        for (int i = 0; i < spritesCount; i++) {
            sprites[i].render(canvas, g);
        }
    }

    private void handleCollisions() {
        for (int i = 0; i < spritesCount; i++) {
            for (int j = i + 1; j < spritesCount; j++) {
                if (sprites[i].isColliding(sprites[j])) {
                    sprites[i].setVector(-sprites[i].getVectorX(), -sprites[i].getVectorY());
                    sprites[j].setVector(-sprites[j].getVectorX(), -sprites[j].getVectorY());
                    countCollisions++;
                }
            }
        }
    }

}
