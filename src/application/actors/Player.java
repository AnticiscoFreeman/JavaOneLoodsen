package application.actors;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 21.02.2025
 */

public class Player extends Actor {

    private int power;
    private int health;

    public Player() {
        this.power = 15;
        this.health = 100;
    }

    public int getPower() {
        return power;
    }

    public int getHealth() {
        return health;
    }

    public String getPosition() {
        return String.format("%s:%s", x + 1, y + 1);
    }

    public void getDamage(int value) {
        this.health -= value;
    }

    public void health(int value) {
        this.health += value;
    }

    public void moveUp() {
        y -= 1;
    }

    public void moveLeft() {
        x -= 1;
    }

    public void moveRight() {
        x += 1;
    }

    public void moveDown() {
        y += 1;
    }

    public boolean isAlive() {
        return health > 0;
    }
}
