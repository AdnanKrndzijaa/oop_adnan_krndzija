package com.company;
import java.util.ArrayList;
public class Seventh {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Hello");
        list.add("Moi");
        list.add("Benvenuto!");
        list.add("badger badger badger badger");

        ArrayList<Integer> lengths = lengths(list);

        System.out.println("The lengths of the Strings: "+lengths);
    }

    public static ArrayList<Integer> lengths(ArrayList<String> len) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (String a:len){
            System.out.println(a.length());
        }
        return list;
    }
}
