package com.company;
import java.util.Scanner;
public class Task5 {
    public static void main(String[] args){
        Scanner reader = new Scanner (System.in);
        System.out.println("Type the power: ");
        int pow = Integer.parseInt(reader.nextLine());
        int sum = 1;

        for (int i=1; i<=pow; i++){
            sum=sum+(int)Math.pow(2, i);
        }
        System.out.println("Sum: "+sum);
    }


}
