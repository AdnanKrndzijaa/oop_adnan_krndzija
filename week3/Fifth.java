package com.company;
import java.util.Scanner;

public class Fifth {
    public static void main(String[] args){
        Scanner reader=new Scanner(System.in);
        System.out.println("Word1: ");
        String word1=reader.nextLine();
        System.out.println("Word2: ");
        String word2=reader.nextLine();
        if(word1.indexOf(word2)>=0){
            System.out.print("Word1 is in Word2");
        }
        else{
            System.out.print("doesn't contains");
        }

    }
}
