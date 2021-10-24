package com.company;
import java.util.Scanner;
public class Eighth {
    public static void main(String[] args){
        Scanner reader = new Scanner (System.in);

        System.out.print("Type your word: ");
        String word = reader.nextLine();

        int i=word.length();
        String reverseOrder = "";
        while (i>0){
            reverseOrder+=word.charAt(i-1);
            i--;
        }
        if (reverseOrder.equals(word)){
            System.out.print("The text is a palindrome!");
        }
        else{
            System.out.print("The text is not palindrome!");
        }
    }
}
