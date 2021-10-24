package com.company;
import java.util.Scanner;
public class Third {
    public static void main(String[] args){
        Scanner reader=new Scanner(System.in);
        System.out.println("String: ");
        String name=reader.nextLine();
        int i=0;
        while (i<name.length()){
            System.out.println(name.charAt(i));
            i++;;
        }

    }
}
