package module3.lesson6.work.reflection;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 01.04.2025
 */

public class TestClassWithPrivate {

    private int field;

    public TestClassWithPrivate(int field) {
        this.field = field;
    }

    public void info() {
        System.out.println("field > " + field);
    }

    private void test() {
        System.out.println("Test from object");
    }

    private void test1(int i) {
        System.out.println("Test from object > " + i);
    }
}
