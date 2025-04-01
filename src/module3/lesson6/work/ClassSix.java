package module3.lesson6.work;

import module3.lesson6.work.hard.Fly;
import module3.lesson6.work.hard.Hangar;

import java.io.*;
import java.util.Arrays;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 01.04.2025
 */

public class ClassSix {

    public static void main(String[] args) {
//        File file = new File("src/module3/lesson6/work/lesson6.txt");
//        System.out.println(file.exists());
//        fileOutStream();
//        serHangars("src/module3/lesson6/work/hangar.ser");
        deSerHangar("src/module3/lesson6/work/hangar.ser");
    }

    public static void serHangars(String path) {
        Hangar hangar1 = new Hangar(1);
        Hangar hangar2 = new Hangar(2);
        Fly fly1 = new Fly("Fly1");
        hangar1.setFly(fly1);
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(hangar1);
            oos.writeObject(hangar2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void deSerHangar(String path) {
        Hangar hangar1 = null;
        Hangar hangar2 = null;
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            hangar1 = (Hangar) ois.readObject();
            hangar2 = (Hangar) ois.readObject();

            System.out.println("Deser > " + hangar1.toString());
            System.out.println("Deser > " + hangar2.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void studySerDeser() {
        Car carOut = new Car("Black", 10);
        byte[] carOutByte = serializableClass(carOut);
        Car carIn = deserializableClass(carOutByte);
        carIn.beep();
    }

    public static Car deserializableClass(byte[] inputBytes) {
        Car catInput = null;
        try {
            ByteArrayInputStream bais = new ByteArrayInputStream(inputBytes);
            ObjectInputStream oos = new ObjectInputStream(bais);
            catInput = (Car) oos.readObject();
            System.out.println("Deser car: " + catInput);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return catInput;
    }

    public static byte[] serializableClass(Car carForOut) {
        byte[] carByte = null;
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            oos.writeObject(carForOut);
            carByte = baos.toByteArray();
            System.out.println("Before : " + carForOut);
            System.out.println("ByteCar Array : " + Arrays.toString(carByte));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return carByte;
    }

    private void studyInOutStream() {
        InputStream inputStream; //.read() 0..255, else null => -1
        OutputStream outputStream;
    }

    public static void byteArrayStreams1() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(10);
        baos.write(11);
        byte[] arrOut = baos.toByteArray();

        ByteArrayInputStream bais = new ByteArrayInputStream(arrOut);
        int x;
        while ((x = bais.read()) != -1) {
            System.out.println("Result : " + x);
        }
    }

    public static void byteArrayStreams2() {
        byte[] arr = {0, 127, -1};
        ByteArrayInputStream bais = new ByteArrayInputStream(arr);
        int x;
        while ((x = bais.read()) != -1) {
            System.out.println("Result : " + x);
        }
    }

    public static void fileOutStream() {
        String inputWorld = "Hello";
        byte[] arr = inputWorld.getBytes();
        try {
            FileOutputStream fos = new FileOutputStream("src/module3/lesson6/work/lesson6.txt");
            fos.write(arr);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void fileInStream() {
        byte[] arr = new byte[20];
        try {
            FileInputStream fis = new FileInputStream("src/module3/lesson6/work/lesson6.txt");
            int x;
            while ((x = fis.read(arr)) > 0) {
                for (int i = 0; i < x; i++) {
                    System.out.print((char) arr[i]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
