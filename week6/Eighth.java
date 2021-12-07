package com.company;
import java.util.ArrayList;

public class Eighth {
    public static void main(String[] args) {
        Library Library = new Library();
        Book cheese = new Book("Cheese Problems Solved", "Woodhead Publishing", 2007);
        System.out.println(cheese.title());
        System.out.println(cheese.publisher());
        System.out.println(cheese.year());

        System.out.println(cheese);

        Book nh1 = new Book("NHL Hockey", "Stanley Cup", 1952);
        Library.addBook(cheese);
        Library.addBook(nh1);

        Library.addBook(new Book("Battle Axes", "Tom A. Hawk", 1851));
        Library.addBook(new Book("Cheese Man", "Penguin Group", 1992));

        Library.printBooks();

        ArrayList<Book> result = Library.searchByTitle("Cheese");
        for (Book book : result) {
            System.out.println(book);
        }
        System.out.println("-------------");
        for (Book book : Library.searchByPublisher("Penguin Group")) {
            System.out.println(book);
        }
        System.out.println("-------------");
        for (Book book : Library.searchByYear(1851)) {
            System.out.println(book);
        }
    }
}
