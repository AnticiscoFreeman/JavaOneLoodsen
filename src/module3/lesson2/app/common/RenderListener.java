package module3.lesson2.app.common;

import java.awt.*;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 14.03.2025
 */

public interface RenderListener {

    void onRenderFrame(Canvas canvas, Graphics g, float deltaTime);
}
