package module3.lesson1.work.app.models;

import module3.lesson1.work.app.Canvas;

import java.awt.*;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 11.03.2025
 */

public abstract class Sprite {

    protected float x;
    protected float y;
    protected float halfWidth;
    protected float halfHeight;

    public void setLeft(float left) {
        x = left + halfWidth;
    }

    public void setRight(float right) {
        x = right - halfWidth;
    }

    public void setTop(float top) {
        y = top + halfHeight;
    }

    public void setBottom(float bottom) {
        y = bottom - halfHeight;
    }

    public float getLeft() {
        return x - halfWidth;
    }

    public float getRight() {
        return x + halfWidth;
    }

    public float getTop() {
        return y - halfHeight;
    }

    public float getBottom() {
        return y + halfHeight;
    }

    public float getWidth() {
        return 2f * halfWidth;
    }

    public float getHeight() {
        return 2f * halfHeight;
    }

    protected abstract void render(Canvas canvas, Graphics g);
    protected abstract void update(Canvas canvas, float deltaTime);

    public boolean isColliding(Sprite other) {
        float dx = Math.abs(this.x - other.x);
        float dy = Math.abs(this.y - other.y);
        float maxDistance = this.halfWidth + other.halfWidth;
        return dx < maxDistance && dy < maxDistance;
    }

//    public boolean isColliding(Sprite other) {
//        float dx = this.x - other.x;
//        float dy = this.y - other.y;
//        float distance = (float) Math.sqrt(dx * dx + dy * dy);
//        return distance < (this.halfWidth + other.halfWidth);
//    }

}
