package com.company;
import java.util.Scanner;
import java.util.Random;
public class Task8 {
    public static void main(String [] args){
                Scanner a=new Scanner(System.in);
                Random random=new Random();
                int x=random.nextInt(101);
                System.out.println(x);
                int i=1;
                while(true){
                    System.out.println("Guess: ");
                    int number=a.nextInt();
                    if(number<x){
                        System.out.println("Number is lesser, guess number "+i);
                    }
                    else if(number>x){
                        System.out.println("Number is grater, guess number "+i);
                    }
                    else{
                        System.out.println("Great. You are corrrect!");
                        break;
                    }
                }

    }
}
