package com.company;
import java.util.ArrayList;


public class Library {
    private static ArrayList<Book> library = new ArrayList<Book>();

    public void addBook(Book newBook){
        library.add(newBook);
    }

    public void printBooks(){
        for(Book b : library){
            System.out.println(b);
        }
    }

    public static ArrayList<Book> searchByTitle(String title){
        ArrayList<Book> found = new ArrayList<Book>();
        for(Book b : library){
            if(b.title().equals(title)){
                found.add(b);
            }

            if(StringUtils.included(b.title(), title)){
                found.add(b);
            }
        }

        return found;

    }
    public static ArrayList<Book> searchByPublisher(String publisher){
        ArrayList<Book> found = new ArrayList<Book>();
        for(Book b : library){
            if(b.title().equals(publisher)){
                found.add(b);
            }

            if(StringUtils.included(b.title(), publisher)){
                found.add(b);
            }
        }

        return found;

    }
    public static ArrayList<Book> searchByYear(int year){
        ArrayList<Book> found = new ArrayList<Book>();
        for(Book b : library){
            if(b.title().equals(year)){
                found.add(b);
            }

            /*if(StringUtils.included(b.title(), year)){
                found.add(b);
            }*/
        }

        return found;

    }

}
