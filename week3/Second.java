package com.company;
import java.util.Scanner;
public class Second {
    public static void main(String[] args){
        Scanner reader = new Scanner (System.in);
        System.out.println("Type your name: ");
        String name=reader.nextLine();

        int num=name.length();
        System.out.println("Count: "+num);

    }
}
