package module3.lesson2.work.interfaces;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 14.03.2025
 */

public class MainClass {

    public static void main(String[] args) {
        Minotaur minotaur = new Minotaur();
        minotaur.talk();


        Human[] objsInt = {new Minotaur(), new Robot()};

        Object[] objs = {new Minotaur(), new Robot(), new CowObject()};

        for (int i = 0; i < objs.length; i++) {
            if (objs[i] instanceof Human) {
                ((Minotaur )objs[i]).talk();
            }
        }

        for (int i = 0; i < objsInt.length; i++) {
            objsInt[i].talk();
            objsInt[i].write();
        }
    }
}
