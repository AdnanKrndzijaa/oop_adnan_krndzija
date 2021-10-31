package com.company;
import java.util.ArrayList;
import java.util.Collections;
public class Task1 {
    public static void main (String[] args){
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        list1.add(1);
        list1.add(2);

        list2.add(3);
        list2.add(4);
        list2.add(5);

        combine(list1, list2);

        System.out.println(list1);
        System.out.println();
        System.out.println(list2);

    }
    public static void combine (ArrayList<Integer> list1, ArrayList<Integer> list2){
        for (int second: list2){
            Collections.addAll(list1, second);
        }
    }
}
