package module2.application.actors;

import module2.application.tools.Tools;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 21.02.2025
 */

public class Enemy extends Actor{

    public static int COUNT;
    private int health;
    private int power;

    public Enemy() {
        this.health = Tools.getRandomValue(Tools.ENEMY_MIN_VALUE, Tools.ENEMY_MAX_VALUE);
        this.power = Tools.getRandomValue(Tools.ENEMY_MIN_VALUE, Tools.ENEMY_MAX_VALUE);
    }

    public int getHealth() {
        return health;
    }

    public int getPower() {
        return power;
    }
}
