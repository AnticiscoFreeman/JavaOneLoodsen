package module3.lesson2.home;

/**
 * JavaOneLoodsen
 *
 * @author Gladkov Alex (aka. Anticisco)
 * @version 1.0.0
 */

import module3.lesson2.home.obstacleInterface.IObstacle;
import module3.lesson2.home.obstacleInterface.IRunRoad;
import module3.lesson2.home.obstacleInterface.IWall;
import module3.lesson2.home.obstacleObject.OObstacle;
import module3.lesson2.home.obstacleObject.ORunRoad;
import module3.lesson2.home.obstacleObject.OWall;
import module3.lesson2.home.participants.Cat;
import module3.lesson2.home.participants.Human;
import module3.lesson2.home.participants.Participant;
import module3.lesson2.home.participants.Robot;

/**
 * 1. Создайте три класса Человек, Кот, Робот, которые не наследуются от одного класса.
 * Эти классы должны уметь бегать и прыгать (методы просто выводят информацию о действии в консоль).
 * 2. Создайте два класса: беговая дорожка и стена, при прохождении через которые,участники должны выполнять
 * соответствующие действия (бежать или прыгать),результат выполнения печатаем в консоль (успешно пробежал,
 * не смог пробежать и т.д.). У препятствий есть длина (для дорожки) или высота (для стены), а участников ограничения
 * на бег и прыжки.
 * 3. Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти этот набор препятствий.
 * Если участник не смог пройти одно из препятствий, то дальше по списку он препятствий не идет.
 */
public class Home2Launcher {

    public static void main(String[] args) {
        Participant[] participant = {new Robot(), new Cat(), new Human()};

        IObstacle[] iObstacles = {new IRunRoad(), new IWall(), new IWall(), new IRunRoad()};

        OObstacle[] oObstacles = {new ORunRoad(), new OWall(), new OWall(), new ORunRoad()};

       methodForInterfaces(participant, iObstacles);
       methodForObjects(participant, oObstacles);
    }

    private static void methodForInterfaces(Participant[] participant, IObstacle[] obstacles) {
        System.out.println("----------------- INTERFACES ----------------");
        for (int i = 0; i < participant.length; i++) {
            Participant currentParticipant = participant[i];
            System.out.printf("Участник [%s] стартует! Характеристики [Бег:%s][Прыг:%s]\n",
                    currentParticipant.getName(),
                    currentParticipant.getMaxRunDistance(),
                    currentParticipant.getMaxJumpDistance()
            );
            for (int j = 0; j < obstacles.length; j++) {
                IObstacle currentObstacle = obstacles[j];
                System.out.printf("Препятствие № %s [%s:%s]\n", j + 1, currentObstacle.getName(), currentObstacle.getParameter());
                if (!currentObstacle.overcomeObstacle(currentParticipant)) {
                    System.out.printf("Участник [%s] не прошел Препятствие № %s [%s]\n", currentParticipant.getName(), j + 1, currentObstacle.getName());
                    break;
                }
                System.out.printf("Участник [%s] прошел Препятствие № %s [%s]!\n", currentParticipant.getName(), j + 1, currentObstacle.getName());
            }
            System.out.println("--------------------------");
        }
    }

    private static void methodForObjects(Participant[] participant, OObstacle[] obstacles) {
        System.out.println("----------------- OBJECTS ----------------");
        for (int i = 0; i < participant.length; i++) {
            Participant currentParticipant = participant[i];
            System.out.printf("Участник [%s] стартует! Характеристики [Бег:%s][Прыг:%s]\n",
                    currentParticipant.getName(),
                    currentParticipant.getMaxRunDistance(),
                    currentParticipant.getMaxJumpDistance()
            );
            for (int j = 0; j < obstacles.length; j++) {
                OObstacle currentObstacle = obstacles[j];
                System.out.printf("Препятствие № %s [%s:%s]\n", j + 1, currentObstacle.getName(), currentObstacle.getParameter());
                if (!currentObstacle.overcomeObstacle(currentParticipant)) {
                    System.out.printf("Участник [%s] не прошел Препятствие № %s [%s]\n", currentParticipant.getName(), j + 1, currentObstacle.getName());
                    break;
                }
                System.out.printf("Участник [%s] прошел Препятствие № %s [%s]!\n", currentParticipant.getName(), j + 1, currentObstacle.getName());
            }
            System.out.println("--------------------------");
        }
    }
}
