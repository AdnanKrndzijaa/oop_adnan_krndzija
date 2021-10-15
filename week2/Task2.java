package com.company;
import java.util.Scanner;
public class Task2 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum=0;

        System.out.print("First: ");
        int num1 = Integer.parseInt(reader.nextLine());
        sum+=num1;
        System.out.print("Second: ");
        int num2 = Integer.parseInt(reader.nextLine());
        sum+=num2;
        System.out.print("Third: ");
        int num3 = Integer.parseInt(reader.nextLine());
        sum+=num3;
        System.out.print("Sum is: "+sum);

    }
}