package com.company;
import java.util.Scanner;
public class Task7 {

    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        printStars(5);
        System.out.println();
        printStars(3);
        System.out.println();
        printStars(9);

    }
    public static void printStars(int amount){
        int sum=0;
        while (sum<amount){
            System.out.print("*");
            sum++;
        }
    }
}
