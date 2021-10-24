package com.company;

import java.util.Collections;
import java.util.Scanner;
public class Fourth {
    public static void main(String[] args){
        Scanner reader=new Scanner(System.in);
        System.out.println("String: ");
        String name=reader.nextLine();
        int i=name.length();
        String reverseOrder = "";
        while (i>0){
            reverseOrder+=name.charAt(i-1);
            i--;
        }
        System.out.println(reverseOrder);

    }
}
