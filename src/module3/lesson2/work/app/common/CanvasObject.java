package module3.lesson2.work.app.common;

import java.awt.*;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 14.03.2025
 */

public interface CanvasObject {

    void render(Canvas canvas, Graphics g);
    void update(Canvas canvas, float deltaTime);
}
