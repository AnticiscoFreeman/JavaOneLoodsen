package module3.lesson2.interfaces.test;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 14.03.2025
 */

public class Book implements Interface1, Interface2 {

    @Override
    public void read() {
        System.out.println("Book read!");
    }


    public static void main(String[] args) {

//        Interface1[] objs1 = {new Book()};
//        Interface2[] objs2 = {new Book(), new TV()};
//
//
//        Book book = new Book();
//        book.read();
//
//        Interface1 bookInt1 = new Book();
//        bookInt1.read();
//
//        Interface2 bookInt2 = new Book();
//        bookInt2.read();
    }

}
