package module3.lesson3.work.generics;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 18.03.2025
 */

public class StartClass {

    public static void main(String[] args) {
        UniversalBox integerBox1 = new UniversalBox(20);
        UniversalBox integerBox2 = new UniversalBox(30);
        UniversalBox longBox = new UniversalBox(30L);
        UniversalBox floatBox = new UniversalBox(2.5f);

//        System.out.println(integerBox1.getObject() + integerBox2.getObject());

        if (integerBox1.getObject() instanceof Integer &&
                integerBox2.getObject() instanceof Integer) {
            int value1 = (Integer) integerBox1.getObject();
            int value2 = (Integer) integerBox2.getObject();
            System.out.println(value1 + value2);
        }

        genericsMethod();
        genericsMethod2();
        genericsMethod3();
    }

    public static void genericsMethod() {
        Box<Integer> box1 = new Box<>(20);
        Box<Integer> box2 = new Box<>(30);
        Box<String> box3 = new Box<>("Hello");
        Box<Long> box4 = new Box<>(30L);

        System.out.println(box1.getObject() + box2.getObject());

    }

    public static void genericsMethod2() {
        BoxNumber<Long> box = new BoxNumber<>(20L);
        box.sum(30);
    }

    public static void genericsMethod3() {
        BoxWithTwoGen<String, Float> box = new BoxWithTwoGen<>("Hello", 20.0f);
        System.out.println(box.getCurrentType());
    }
}
