package com.company;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum=0;
        while(true){
            int read=Integer.parseInt(reader.nextLine());
            if (read==0) break;
            else sum+=read;
            System.out.print("Sum is: " + sum);

        }
        System.out.print("Sum is: " + sum);

    }
}


